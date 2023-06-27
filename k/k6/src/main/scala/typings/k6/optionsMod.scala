package typings.k6

import org.scalablytyped.runtime.StringDictionary
import typings.k6.anon.Max
import typings.k6.anon.Policy
import typings.k6.httpMod.CipherSuite
import typings.k6.k6Strings.`constant-arrival-rate`
import typings.k6.k6Strings.`constant-vus`
import typings.k6.k6Strings.`externally-controlled`
import typings.k6.k6Strings.`per-vu-iterations`
import typings.k6.k6Strings.`ramping-arrival-rate`
import typings.k6.k6Strings.`ramping-vus`
import typings.k6.k6Strings.`shared-iterations`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  /* note: abstract class */ @JSImport("k6/options", "BaseScenario")
  @js.native
  open class BaseScenario () extends StObject {
    
    /** Environment variables specific to this scenario.  */
    var env: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * Name of exported JS function to execute.
      *
      * The default value is "default".
      */
    var exec: js.UndefOr[String] = js.native
    
    /**
      * Executor type.  Options available:
      * - `shared-iterations`
      * - `per-vu-iterations`
      * - `constant-vus`
      * - `ramping-vus`
      * - `constant-arrival-rate`
      * - `ramping-arrival-rate`
      * - `externally-controlled`
      */
    var executor: ExecutorOptions = js.native
    
    /**
      * Time to wait for iterations to finish executing before stopping them forcefully.
      * See https://k6.io/docs/using-k6/scenarios#graceful-stop-and-ramp-down/
      *
      * Default value is 30s
      */
    var gracefulStop: js.UndefOr[String] = js.native
    
    /** Additional options for each scenario */
    var options: js.UndefOr[ScenarioOptions] = js.native
    
    /**
      * Time offset since the start of the test, at which point this scenario should begin execution.
      *
      * Default value is 0s.
      */
    var startTime: js.UndefOr[String] = js.native
    
    /** Tags specific to this scenario. */
    var tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  
  trait Certificate extends StObject {
    
    /** PEM encoded certificate. */
    var cert: String
    
    /** Domains certificate is valid for. */
    var domains: js.UndefOr[js.Array[String]] = js.undefined
    
    /** PEM encoded certificate key. */
    var key: String
    
    /** PEM passphrase. */
    var password: js.UndefOr[String] = js.undefined
  }
  object Certificate {
    
    inline def apply(cert: String, key: String): Certificate = {
      val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Certificate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Certificate] (val x: Self) extends AnyVal {
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setDomains(value: js.Array[String]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
      
      inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
      
      inline def setDomainsVarargs(value: String*): Self = StObject.set(x, "domains", js.Array(value*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    }
  }
  
  type CollectorOptions = StringDictionary[Any]
  
  @js.native
  trait ConstantArrivalRateScenario
    extends BaseScenario
       with Scenario {
    
    /** Total scenario duration (excluding `gracefulStop`) */
    var duration: String = js.native
    
    @JSName("executor")
    var executor_ConstantArrivalRateScenario: `constant-arrival-rate` = js.native
    
    /**
      * Maximum number of VUs to allow during the test run.
      *
      * The default value is the value of the `preAllocatedVUs` option.
      */
    var maxVUs: js.UndefOr[Double] = js.native
    
    /** Number of VUs to pre-allocate before test start in order to preserve runtime resources. */
    var preAllocatedVUs: Double = js.native
    
    /** Number of iterations to execute each `timeUnit` period. */
    var rate: Double = js.native
    
    /**
      * Period of time to apply the `rate` value.
      *
      * The default value is 1s.
      */
    var timeUnit: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait ConstantVUsScenario
    extends BaseScenario
       with Scenario {
    
    /**
      * Total scenario duration (excluding `gracefulStop`)
      */
    var duration: String = js.native
    
    @JSName("executor")
    var executor_ConstantVUsScenario: `constant-vus` = js.native
    
    /**
      * Number of VUs to run concurrently.
      *
      * The default value is 1.
      */
    var vus: js.UndefOr[Double] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.k6.k6Strings.`shared-iterations`
    - typings.k6.k6Strings.`per-vu-iterations`
    - typings.k6.k6Strings.`constant-vus`
    - typings.k6.k6Strings.`ramping-vus`
    - typings.k6.k6Strings.`constant-arrival-rate`
    - typings.k6.k6Strings.`ramping-arrival-rate`
    - typings.k6.k6Strings.`externally-controlled`
  */
  trait ExecutorOptions extends StObject
  object ExecutorOptions {
    
    inline def `constant-arrival-rate`: typings.k6.k6Strings.`constant-arrival-rate` = "constant-arrival-rate".asInstanceOf[typings.k6.k6Strings.`constant-arrival-rate`]
    
    inline def `constant-vus`: typings.k6.k6Strings.`constant-vus` = "constant-vus".asInstanceOf[typings.k6.k6Strings.`constant-vus`]
    
    inline def `externally-controlled`: typings.k6.k6Strings.`externally-controlled` = "externally-controlled".asInstanceOf[typings.k6.k6Strings.`externally-controlled`]
    
    inline def `per-vu-iterations`: typings.k6.k6Strings.`per-vu-iterations` = "per-vu-iterations".asInstanceOf[typings.k6.k6Strings.`per-vu-iterations`]
    
    inline def `ramping-arrival-rate`: typings.k6.k6Strings.`ramping-arrival-rate` = "ramping-arrival-rate".asInstanceOf[typings.k6.k6Strings.`ramping-arrival-rate`]
    
    inline def `ramping-vus`: typings.k6.k6Strings.`ramping-vus` = "ramping-vus".asInstanceOf[typings.k6.k6Strings.`ramping-vus`]
    
    inline def `shared-iterations`: typings.k6.k6Strings.`shared-iterations` = "shared-iterations".asInstanceOf[typings.k6.k6Strings.`shared-iterations`]
  }
  
  @js.native
  trait ExternallyControlledScenario
    extends BaseScenario
       with Scenario {
    
    /** Total scenario duration (excluding `gracefulStop`) */
    var duration: String = js.native
    
    @JSName("executor")
    var executor_ExternallyControlledScenario: `externally-controlled` = js.native
    
    /** Maximum number of VUs to allow during the test run. */
    var maxVUs: js.UndefOr[Double] = js.native
    
    /**
      * Number of VUs to run concurrently.
      *
      * The default value is 1.
      */
    var vus: js.UndefOr[Double] = js.native
  }
  
  trait ObjectThreshold extends StObject {
    
    /** Abort test if threshold violated. */
    var abortOnFail: js.UndefOr[Boolean] = js.undefined
    
    /** Duration to delay evaluation. Enables collecting additional metrics. */
    var delayAbortEval: js.UndefOr[String] = js.undefined
    
    /** Threshold expression. */
    var threshold: String
  }
  object ObjectThreshold {
    
    inline def apply(threshold: String): ObjectThreshold = {
      val __obj = js.Dynamic.literal(threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectThreshold]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectThreshold] (val x: Self) extends AnyVal {
      
      inline def setAbortOnFail(value: Boolean): Self = StObject.set(x, "abortOnFail", value.asInstanceOf[js.Any])
      
      inline def setAbortOnFailUndefined: Self = StObject.set(x, "abortOnFail", js.undefined)
      
      inline def setDelayAbortEval(value: String): Self = StObject.set(x, "delayAbortEval", value.asInstanceOf[js.Any])
      
      inline def setDelayAbortEvalUndefined: Self = StObject.set(x, "delayAbortEval", js.undefined)
      
      inline def setThreshold(value: String): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /** Maximum parallel `http.batch()` connections per VU. */
    var batch: js.UndefOr[Double] = js.undefined
    
    /** Maximum parallel `http.batch()` host connections per VU. */
    var batchPerHost: js.UndefOr[Double] = js.undefined
    
    /** Blacklist IP ranges from being called. */
    var blacklistIPs: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Blacklist hostnames from being called. Wildcards are supported. */
    var blockHostnames: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Discard response bodies. */
    var discardResponseBodies: js.UndefOr[Boolean] = js.undefined
    
    /** DNS resolution behavior. https://k6.io/docs/using-k6/options#dns */
    var dns: js.UndefOr[Policy] = js.undefined
    
    /** Test duration. */
    var duration: js.UndefOr[String] = js.undefined
    
    /** Partition the test run in different segments. https://k6.io/docs/using-k6/options#execution-segment */
    var executionSegment: js.UndefOr[String] = js.undefined
    
    /** Define the sequence segment to run. https://k6.io/docs/using-k6/options#execution-segment */
    var executionSegmentSequence: js.UndefOr[String] = js.undefined
    
    /** Third party collector configuration. */
    var ext: js.UndefOr[StringDictionary[CollectorOptions]] = js.undefined
    
    /** Static hostname mapping. */
    var hosts: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /** Log all HTTP requests and responses. */
    var httpDebug: js.UndefOr[String] = js.undefined
    
    /** Disable TLS verification. Insecure. */
    var insecureSkipTLSVerify: js.UndefOr[Boolean] = js.undefined
    
    /** Iterations to execute. */
    var iterations: js.UndefOr[Double] = js.undefined
    
    /** Persist the k6 process after test completion. */
    var linger: js.UndefOr[Boolean] = js.undefined
    
    /** Maximum HTTP redirects to follow. */
    var maxRedirects: js.UndefOr[Double] = js.undefined
    
    /** Minimum test iteration duration. */
    var minIterationDuration: js.UndefOr[String] = js.undefined
    
    /** Disable keepalive connections. */
    var noConnectionReuse: js.UndefOr[Boolean] = js.undefined
    
    /** This disables the default behavior of resetting the cookie jar after each VU iteration. If it's enabled, saved cookies will be persisted across VU iterations.. */
    var noCookiesReset: js.UndefOr[Boolean] = js.undefined
    
    /** Disable usage reports. */
    var noUsageReport: js.UndefOr[Boolean] = js.undefined
    
    /** Disable cross-VU TCP connection reuse. */
    var noVUConnectionReuse: js.UndefOr[Boolean] = js.undefined
    
    /** Start test in paused state. */
    var paused: js.UndefOr[Boolean] = js.undefined
    
    /** Maximum requests per second across all VUs. */
    var rps: js.UndefOr[Double] = js.undefined
    
    /** Scenario specifications. */
    var scenarios: js.UndefOr[StringDictionary[Scenario]] = js.undefined
    
    /** Setup function timeout. */
    var setupTimeout: js.UndefOr[String] = js.undefined
    
    /** Test stage specifications. Program of target VU stages. */
    var stages: js.UndefOr[js.Array[Stage]] = js.undefined
    
    /** Define stats for trend metrics. */
    var summaryTrendStats: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Which system tags to include in collected metrics. */
    var systemTags: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Tags to set test wide across all metrics. */
    var tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /** Teardown function timeout. */
    var teardownTimeout: js.UndefOr[String] = js.undefined
    
    /** Threshold specifications. Defines pass and fail conditions. */
    var thresholds: js.UndefOr[StringDictionary[js.Array[Threshold]]] = js.undefined
    
    /** Throw error on failed HTTP request. */
    var `throw`: js.UndefOr[Boolean] = js.undefined
    
    /** TLS client certificates. */
    var tlsAuth: js.UndefOr[js.Array[Certificate]] = js.undefined
    
    /** Allowed TLS cipher suites. */
    var tlsCipherSuites: js.UndefOr[js.Array[CipherSuite]] = js.undefined
    
    /** Allowed TLS version. Use `http.SSL_*` `http.TLS_*` constants. */
    var tlsVersion: js.UndefOr[String | Max] = js.undefined
    
    /** User agent string to include in HTTP requests. */
    var userAgent: js.UndefOr[String] = js.undefined
    
    /** Number of VUs to run concurrently. */
    var vus: js.UndefOr[Double] = js.undefined
    
    /** Maximum VUs. Preallocates VUs to enable faster scaling. */
    var vusMax: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBatch(value: Double): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
      
      inline def setBatchPerHost(value: Double): Self = StObject.set(x, "batchPerHost", value.asInstanceOf[js.Any])
      
      inline def setBatchPerHostUndefined: Self = StObject.set(x, "batchPerHost", js.undefined)
      
      inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
      
      inline def setBlacklistIPs(value: js.Array[String]): Self = StObject.set(x, "blacklistIPs", value.asInstanceOf[js.Any])
      
      inline def setBlacklistIPsUndefined: Self = StObject.set(x, "blacklistIPs", js.undefined)
      
      inline def setBlacklistIPsVarargs(value: String*): Self = StObject.set(x, "blacklistIPs", js.Array(value*))
      
      inline def setBlockHostnames(value: js.Array[String]): Self = StObject.set(x, "blockHostnames", value.asInstanceOf[js.Any])
      
      inline def setBlockHostnamesUndefined: Self = StObject.set(x, "blockHostnames", js.undefined)
      
      inline def setBlockHostnamesVarargs(value: String*): Self = StObject.set(x, "blockHostnames", js.Array(value*))
      
      inline def setDiscardResponseBodies(value: Boolean): Self = StObject.set(x, "discardResponseBodies", value.asInstanceOf[js.Any])
      
      inline def setDiscardResponseBodiesUndefined: Self = StObject.set(x, "discardResponseBodies", js.undefined)
      
      inline def setDns(value: Policy): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
      
      inline def setDnsUndefined: Self = StObject.set(x, "dns", js.undefined)
      
      inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setExecutionSegment(value: String): Self = StObject.set(x, "executionSegment", value.asInstanceOf[js.Any])
      
      inline def setExecutionSegmentSequence(value: String): Self = StObject.set(x, "executionSegmentSequence", value.asInstanceOf[js.Any])
      
      inline def setExecutionSegmentSequenceUndefined: Self = StObject.set(x, "executionSegmentSequence", js.undefined)
      
      inline def setExecutionSegmentUndefined: Self = StObject.set(x, "executionSegment", js.undefined)
      
      inline def setExt(value: StringDictionary[CollectorOptions]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setHosts(value: StringDictionary[String]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      inline def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
      
      inline def setHttpDebug(value: String): Self = StObject.set(x, "httpDebug", value.asInstanceOf[js.Any])
      
      inline def setHttpDebugUndefined: Self = StObject.set(x, "httpDebug", js.undefined)
      
      inline def setInsecureSkipTLSVerify(value: Boolean): Self = StObject.set(x, "insecureSkipTLSVerify", value.asInstanceOf[js.Any])
      
      inline def setInsecureSkipTLSVerifyUndefined: Self = StObject.set(x, "insecureSkipTLSVerify", js.undefined)
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
      
      inline def setLinger(value: Boolean): Self = StObject.set(x, "linger", value.asInstanceOf[js.Any])
      
      inline def setLingerUndefined: Self = StObject.set(x, "linger", js.undefined)
      
      inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      inline def setMinIterationDuration(value: String): Self = StObject.set(x, "minIterationDuration", value.asInstanceOf[js.Any])
      
      inline def setMinIterationDurationUndefined: Self = StObject.set(x, "minIterationDuration", js.undefined)
      
      inline def setNoConnectionReuse(value: Boolean): Self = StObject.set(x, "noConnectionReuse", value.asInstanceOf[js.Any])
      
      inline def setNoConnectionReuseUndefined: Self = StObject.set(x, "noConnectionReuse", js.undefined)
      
      inline def setNoCookiesReset(value: Boolean): Self = StObject.set(x, "noCookiesReset", value.asInstanceOf[js.Any])
      
      inline def setNoCookiesResetUndefined: Self = StObject.set(x, "noCookiesReset", js.undefined)
      
      inline def setNoUsageReport(value: Boolean): Self = StObject.set(x, "noUsageReport", value.asInstanceOf[js.Any])
      
      inline def setNoUsageReportUndefined: Self = StObject.set(x, "noUsageReport", js.undefined)
      
      inline def setNoVUConnectionReuse(value: Boolean): Self = StObject.set(x, "noVUConnectionReuse", value.asInstanceOf[js.Any])
      
      inline def setNoVUConnectionReuseUndefined: Self = StObject.set(x, "noVUConnectionReuse", js.undefined)
      
      inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      inline def setRps(value: Double): Self = StObject.set(x, "rps", value.asInstanceOf[js.Any])
      
      inline def setRpsUndefined: Self = StObject.set(x, "rps", js.undefined)
      
      inline def setScenarios(value: StringDictionary[Scenario]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
      
      inline def setScenariosUndefined: Self = StObject.set(x, "scenarios", js.undefined)
      
      inline def setSetupTimeout(value: String): Self = StObject.set(x, "setupTimeout", value.asInstanceOf[js.Any])
      
      inline def setSetupTimeoutUndefined: Self = StObject.set(x, "setupTimeout", js.undefined)
      
      inline def setStages(value: js.Array[Stage]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
      
      inline def setStagesUndefined: Self = StObject.set(x, "stages", js.undefined)
      
      inline def setStagesVarargs(value: Stage*): Self = StObject.set(x, "stages", js.Array(value*))
      
      inline def setSummaryTrendStats(value: js.Array[String]): Self = StObject.set(x, "summaryTrendStats", value.asInstanceOf[js.Any])
      
      inline def setSummaryTrendStatsUndefined: Self = StObject.set(x, "summaryTrendStats", js.undefined)
      
      inline def setSummaryTrendStatsVarargs(value: String*): Self = StObject.set(x, "summaryTrendStats", js.Array(value*))
      
      inline def setSystemTags(value: js.Array[String]): Self = StObject.set(x, "systemTags", value.asInstanceOf[js.Any])
      
      inline def setSystemTagsUndefined: Self = StObject.set(x, "systemTags", js.undefined)
      
      inline def setSystemTagsVarargs(value: String*): Self = StObject.set(x, "systemTags", js.Array(value*))
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTeardownTimeout(value: String): Self = StObject.set(x, "teardownTimeout", value.asInstanceOf[js.Any])
      
      inline def setTeardownTimeoutUndefined: Self = StObject.set(x, "teardownTimeout", js.undefined)
      
      inline def setThresholds(value: StringDictionary[js.Array[Threshold]]): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
      
      inline def setThresholdsUndefined: Self = StObject.set(x, "thresholds", js.undefined)
      
      inline def setThrow(value: Boolean): Self = StObject.set(x, "throw", value.asInstanceOf[js.Any])
      
      inline def setThrowUndefined: Self = StObject.set(x, "throw", js.undefined)
      
      inline def setTlsAuth(value: js.Array[Certificate]): Self = StObject.set(x, "tlsAuth", value.asInstanceOf[js.Any])
      
      inline def setTlsAuthUndefined: Self = StObject.set(x, "tlsAuth", js.undefined)
      
      inline def setTlsAuthVarargs(value: Certificate*): Self = StObject.set(x, "tlsAuth", js.Array(value*))
      
      inline def setTlsCipherSuites(value: js.Array[CipherSuite]): Self = StObject.set(x, "tlsCipherSuites", value.asInstanceOf[js.Any])
      
      inline def setTlsCipherSuitesUndefined: Self = StObject.set(x, "tlsCipherSuites", js.undefined)
      
      inline def setTlsCipherSuitesVarargs(value: CipherSuite*): Self = StObject.set(x, "tlsCipherSuites", js.Array(value*))
      
      inline def setTlsVersion(value: String | Max): Self = StObject.set(x, "tlsVersion", value.asInstanceOf[js.Any])
      
      inline def setTlsVersionUndefined: Self = StObject.set(x, "tlsVersion", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      inline def setVus(value: Double): Self = StObject.set(x, "vus", value.asInstanceOf[js.Any])
      
      inline def setVusMax(value: Double): Self = StObject.set(x, "vusMax", value.asInstanceOf[js.Any])
      
      inline def setVusMaxUndefined: Self = StObject.set(x, "vusMax", js.undefined)
      
      inline def setVusUndefined: Self = StObject.set(x, "vus", js.undefined)
    }
  }
  
  @js.native
  trait PerVUIterationsScenario
    extends BaseScenario
       with Scenario {
    
    @JSName("executor")
    var executor_PerVUIterationsScenario: `per-vu-iterations` = js.native
    
    /**
      * Number of iterations to execute across per VU.
      *
      * The default value is 1.
      */
    var iterations: js.UndefOr[Double] = js.native
    
    /**
      * Maximum scenario duration before it's forcibly stopped (excluding gracefulStop).
      *
      * The default value is 10m.
      */
    var maxDuration: js.UndefOr[String] = js.native
    
    /**
      * Number of VUs to run concurrently.
      *
      * The default value is 1.
      */
    var vus: js.UndefOr[Double] = js.native
  }
  
  @js.native
  trait RampingArrivalRateScenario
    extends BaseScenario
       with Scenario {
    
    @JSName("executor")
    var executor_RampingArrivalRateScenario: `ramping-arrival-rate` = js.native
    
    /** Maximum number of VUs to allow during the test run. */
    var maxVUs: js.UndefOr[Double] = js.native
    
    /** Number of VUs to pre-allocate before test start in order to preserve runtime resources. */
    var preAllocatedVUs: Double = js.native
    
    /** Array of objects that specify the number of iterations to ramp up or down to. */
    var stages: js.Array[Stage] = js.native
    
    /** Number of iterations to execute each `timeUnit` period at test start. */
    var startRate: js.UndefOr[Double] = js.native
    
    /**
      * Period of time to apply the `startRate` the `stages` target value..
      *
      * The default value is 1s.
      */
    var timeUnit: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait RampingVUsScenario
    extends BaseScenario
       with Scenario {
    
    @JSName("executor")
    var executor_RampingVUsScenario: `ramping-vus` = js.native
    
    /**
      * Time to wait for an already started iteration to finish before stopping it during a ramp down.
      *
      * The default value is 30s.
      */
    var gracefulRampDown: js.UndefOr[String] = js.native
    
    /** Array of objects that specify the number of VUs to ramp up or down to. */
    var stages: js.Array[Stage] = js.native
    
    /**
      * Number of VUs to run at test start.
      *
      * The default value is 1.
      */
    var startVUs: js.UndefOr[Double] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.k6.optionsMod.SharedIterationsScenario
    - typings.k6.optionsMod.PerVUIterationsScenario
    - typings.k6.optionsMod.ConstantVUsScenario
    - typings.k6.optionsMod.RampingVUsScenario
    - typings.k6.optionsMod.ConstantArrivalRateScenario
    - typings.k6.optionsMod.RampingArrivalRateScenario
    - typings.k6.optionsMod.ExternallyControlledScenario
  */
  trait Scenario extends StObject
  
  trait ScenarioOptions extends StObject {
    
    /** Browser specific options */
    var browser: js.UndefOr[Any] = js.undefined
  }
  object ScenarioOptions {
    
    inline def apply(): ScenarioOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScenarioOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScenarioOptions] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: Any): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    }
  }
  
  @js.native
  trait SharedIterationsScenario
    extends BaseScenario
       with Scenario {
    
    @JSName("executor")
    var executor_SharedIterationsScenario: `shared-iterations` = js.native
    
    /**
      * Number of iterations to execute across all VUs.
      *
      * The default value is 1.
      */
    var iterations: js.UndefOr[Double] = js.native
    
    /**
      * Maximum scenario duration before it's forcibly stopped (excluding gracefulStop).
      *
      * The default value is 10m.
      */
    var maxDuration: js.UndefOr[String] = js.native
    
    /**
      * Number of VUs to run concurrently.
      *
      * The default value is 1.
      */
    var vus: js.UndefOr[Double] = js.native
  }
  
  trait Stage extends StObject {
    
    /** Stage duration. */
    var duration: String
    
    /** Target number of VUs. */
    var target: Double
  }
  object Stage {
    
    inline def apply(duration: String, target: Double): Stage = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Stage] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type Threshold = String | ObjectThreshold
}
