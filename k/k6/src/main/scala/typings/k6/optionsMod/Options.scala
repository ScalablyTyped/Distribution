package typings.k6.optionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.k6.anon.Max
import typings.k6.httpMod.CipherSuite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** Maximum parallel `http.batch()` connections per VU. */
  var batch: js.UndefOr[Double] = js.native
  /** Maximum parallel `http.batch()` host connections per VU. */
  var batchPerHost: js.UndefOr[Double] = js.native
  /** Blacklist IP ranges from being called. */
  var blacklistIPs: js.UndefOr[js.Array[String]] = js.native
  /** Discard response bodies. */
  var discardResponseBodies: js.UndefOr[Boolean] = js.native
  /** Test duration. */
  var duration: js.UndefOr[String] = js.native
  /** Third party collector configuration. */
  var ext: js.UndefOr[StringDictionary[CollectorOptions]] = js.native
  /** Static hostname mapping. */
  var hosts: js.UndefOr[StringDictionary[String]] = js.native
  /** Log all HTTP requests and responses. */
  var httpDebug: js.UndefOr[String] = js.native
  /** Disable TLS verification. Insecure. */
  var insecureSkipTLSVerify: js.UndefOr[Boolean] = js.native
  /** Iterations to execute. */
  var iterations: js.UndefOr[Double] = js.native
  /** Persist the k6 process after test completion. */
  var linger: js.UndefOr[Boolean] = js.native
  /** Maximum HTTP redirects to follow. */
  var maxRedirects: js.UndefOr[Double] = js.native
  /** Minimum test iteration duration. */
  var minIterationDuration: js.UndefOr[String] = js.native
  /** Disable keepalive connections. */
  var noConnectionReuse: js.UndefOr[Boolean] = js.native
  /** Disable usage reports. */
  var noUsageReport: js.UndefOr[Boolean] = js.native
  /** Disable cross-VU TCP connection reuse. */
  var noVUConnectionReuse: js.UndefOr[Boolean] = js.native
  /** Start test in paused state. */
  var paused: js.UndefOr[Boolean] = js.native
  /** Maximum requests per second across all VUs. */
  var rps: js.UndefOr[Double] = js.native
  /** Setup function timeout. */
  var setupTimeout: js.UndefOr[String] = js.native
  /** Test stage specifications. Program of target VU stages. */
  var stages: js.UndefOr[js.Array[Stage]] = js.native
  /** Define stats for trend metrics. */
  var summaryTrendStats: js.UndefOr[js.Array[String]] = js.native
  /** Which system tags to include in collected metrics. */
  var systemTags: js.UndefOr[js.Array[String]] = js.native
  /** Tags to set test wide across all metrics. */
  var tags: js.UndefOr[StringDictionary[String]] = js.native
  /** Teardown function timeout. */
  var teardownTimeout: js.UndefOr[String] = js.native
  /** Threshold specifications. Defines pass and fail conditions. */
  var thresholds: js.UndefOr[StringDictionary[js.Array[Threshold]]] = js.native
  /** Throw error on failed HTTP request. */
  var `throw`: js.UndefOr[Boolean] = js.native
  /** TLS client certificates. */
  var tlsAuth: js.UndefOr[js.Array[Certificate]] = js.native
  /** Allowed TLS cipher suites. */
  var tlsCipherSuites: js.UndefOr[js.Array[CipherSuite]] = js.native
  /** Allowed TLS version. Use `http.SSL_*` `http.TLS_*` constants. */
  var tlsVersion: js.UndefOr[String | Max] = js.native
  /** User agent string to include in HTTP requests. */
  var userAgent: js.UndefOr[String] = js.native
  /** Number of VUs to run concurrently. */
  var vus: js.UndefOr[Double] = js.native
  /** Maximum VUs. Preallocates VUs to enable faster scaling. */
  var vusMax: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBatch(value: Double): Self = this.set("batch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatch: Self = this.set("batch", js.undefined)
    @scala.inline
    def setBatchPerHost(value: Double): Self = this.set("batchPerHost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchPerHost: Self = this.set("batchPerHost", js.undefined)
    @scala.inline
    def setBlacklistIPsVarargs(value: String*): Self = this.set("blacklistIPs", js.Array(value :_*))
    @scala.inline
    def setBlacklistIPs(value: js.Array[String]): Self = this.set("blacklistIPs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlacklistIPs: Self = this.set("blacklistIPs", js.undefined)
    @scala.inline
    def setDiscardResponseBodies(value: Boolean): Self = this.set("discardResponseBodies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscardResponseBodies: Self = this.set("discardResponseBodies", js.undefined)
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setExt(value: StringDictionary[CollectorOptions]): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    @scala.inline
    def setHosts(value: StringDictionary[String]): Self = this.set("hosts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHosts: Self = this.set("hosts", js.undefined)
    @scala.inline
    def setHttpDebug(value: String): Self = this.set("httpDebug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpDebug: Self = this.set("httpDebug", js.undefined)
    @scala.inline
    def setInsecureSkipTLSVerify(value: Boolean): Self = this.set("insecureSkipTLSVerify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsecureSkipTLSVerify: Self = this.set("insecureSkipTLSVerify", js.undefined)
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
    @scala.inline
    def setLinger(value: Boolean): Self = this.set("linger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinger: Self = this.set("linger", js.undefined)
    @scala.inline
    def setMaxRedirects(value: Double): Self = this.set("maxRedirects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRedirects: Self = this.set("maxRedirects", js.undefined)
    @scala.inline
    def setMinIterationDuration(value: String): Self = this.set("minIterationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinIterationDuration: Self = this.set("minIterationDuration", js.undefined)
    @scala.inline
    def setNoConnectionReuse(value: Boolean): Self = this.set("noConnectionReuse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoConnectionReuse: Self = this.set("noConnectionReuse", js.undefined)
    @scala.inline
    def setNoUsageReport(value: Boolean): Self = this.set("noUsageReport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoUsageReport: Self = this.set("noUsageReport", js.undefined)
    @scala.inline
    def setNoVUConnectionReuse(value: Boolean): Self = this.set("noVUConnectionReuse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoVUConnectionReuse: Self = this.set("noVUConnectionReuse", js.undefined)
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaused: Self = this.set("paused", js.undefined)
    @scala.inline
    def setRps(value: Double): Self = this.set("rps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRps: Self = this.set("rps", js.undefined)
    @scala.inline
    def setSetupTimeout(value: String): Self = this.set("setupTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetupTimeout: Self = this.set("setupTimeout", js.undefined)
    @scala.inline
    def setStagesVarargs(value: Stage*): Self = this.set("stages", js.Array(value :_*))
    @scala.inline
    def setStages(value: js.Array[Stage]): Self = this.set("stages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStages: Self = this.set("stages", js.undefined)
    @scala.inline
    def setSummaryTrendStatsVarargs(value: String*): Self = this.set("summaryTrendStats", js.Array(value :_*))
    @scala.inline
    def setSummaryTrendStats(value: js.Array[String]): Self = this.set("summaryTrendStats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryTrendStats: Self = this.set("summaryTrendStats", js.undefined)
    @scala.inline
    def setSystemTagsVarargs(value: String*): Self = this.set("systemTags", js.Array(value :_*))
    @scala.inline
    def setSystemTags(value: js.Array[String]): Self = this.set("systemTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemTags: Self = this.set("systemTags", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTeardownTimeout(value: String): Self = this.set("teardownTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeardownTimeout: Self = this.set("teardownTimeout", js.undefined)
    @scala.inline
    def setThresholds(value: StringDictionary[js.Array[Threshold]]): Self = this.set("thresholds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThresholds: Self = this.set("thresholds", js.undefined)
    @scala.inline
    def setThrow(value: Boolean): Self = this.set("throw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrow: Self = this.set("throw", js.undefined)
    @scala.inline
    def setTlsAuthVarargs(value: Certificate*): Self = this.set("tlsAuth", js.Array(value :_*))
    @scala.inline
    def setTlsAuth(value: js.Array[Certificate]): Self = this.set("tlsAuth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTlsAuth: Self = this.set("tlsAuth", js.undefined)
    @scala.inline
    def setTlsCipherSuitesVarargs(value: CipherSuite*): Self = this.set("tlsCipherSuites", js.Array(value :_*))
    @scala.inline
    def setTlsCipherSuites(value: js.Array[CipherSuite]): Self = this.set("tlsCipherSuites", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTlsCipherSuites: Self = this.set("tlsCipherSuites", js.undefined)
    @scala.inline
    def setTlsVersion(value: String | Max): Self = this.set("tlsVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTlsVersion: Self = this.set("tlsVersion", js.undefined)
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
    @scala.inline
    def setVus(value: Double): Self = this.set("vus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVus: Self = this.set("vus", js.undefined)
    @scala.inline
    def setVusMax(value: Double): Self = this.set("vusMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVusMax: Self = this.set("vusMax", js.undefined)
  }
  
}

