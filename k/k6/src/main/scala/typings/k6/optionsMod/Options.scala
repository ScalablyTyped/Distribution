package typings.k6.optionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.k6.anon.Max
import typings.k6.httpMod.CipherSuite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Maximum parallel `http.batch()` connections per VU. */
  var batch: Double
  /** Maximum parallel `http.batch()` host connections per VU. */
  var batchPerHost: Double
  /** Blacklist IP ranges from being called. */
  var blacklistIPs: js.Array[String]
  /** Discard response bodies. */
  var discardResponseBodies: Boolean
  /** Test duration. */
  var duration: String
  /** Third party collector configuration. */
  var ext: StringDictionary[CollectorOptions]
  /** Static hostname mapping. */
  var hosts: StringDictionary[String]
  /** Log all HTTP requests and responses. */
  var httpDebug: String
  /** Disable TLS verification. Insecure. */
  var insecureSkipTLSVerify: Boolean
  /** Iterations to execute. */
  var iterations: Double
  /** Persist the k6 process after test completion. */
  var linger: Boolean
  /** Maximum HTTP redirects to follow. */
  var maxRedirects: Double
  /** Minimum test iteration duration. */
  var minIterationDuration: String
  /** Disable keepalive connections. */
  var noConnectionReuse: Boolean
  /** Disable usage reports. */
  var noUsageReport: Boolean
  /** Disable cross-VU TCP connection reuse. */
  var noVUConnectionReuse: Boolean
  /** Start test in paused state. */
  var paused: Boolean
  /** Maximum requests per second across all VUs. */
  var rps: Double
  /** Setup function timeout. */
  var setupTimeout: String
  /** Test stage specifications. Program of target VU stages. */
  var stages: js.Array[Stage]
  /** Define stats for trend metrics. */
  var summaryTrendStats: js.Array[String]
  /** Which system tags to include in collected metrics. */
  var systemTags: js.Array[String]
  /** Tags to set test wide across all metrics. */
  var tags: StringDictionary[String]
  /** Teardown function timeout. */
  var teardownTimeout: String
  /** Threshold specifications. Defines pass and fail conditions. */
  var thresholds: StringDictionary[js.Array[Threshold]]
  /** Throw error on failed HTTP request. */
  var `throw`: Boolean
  /** TLS client certificates. */
  var tlsAuth: js.Array[Certificate]
  /** Allowed TLS cipher suites. */
  var tlsCipherSuites: js.Array[CipherSuite]
  /** Allowed TLS version. Use `http.SSL_*` `http.TLS_*` constants. */
  var tlsVersion: String | Max
  /** User agent string to include in HTTP requests. */
  var userAgent: String
  /** Number of VUs to run concurrently. */
  var vus: Double
  /** Maximum VUs. Preallocates VUs to enable faster scaling. */
  var vusMax: Double
}

object Options {
  @scala.inline
  def apply(
    batch: Double,
    batchPerHost: Double,
    blacklistIPs: js.Array[String],
    discardResponseBodies: Boolean,
    duration: String,
    ext: StringDictionary[CollectorOptions],
    hosts: StringDictionary[String],
    httpDebug: String,
    insecureSkipTLSVerify: Boolean,
    iterations: Double,
    linger: Boolean,
    maxRedirects: Double,
    minIterationDuration: String,
    noConnectionReuse: Boolean,
    noUsageReport: Boolean,
    noVUConnectionReuse: Boolean,
    paused: Boolean,
    rps: Double,
    setupTimeout: String,
    stages: js.Array[Stage],
    summaryTrendStats: js.Array[String],
    systemTags: js.Array[String],
    tags: StringDictionary[String],
    teardownTimeout: String,
    thresholds: StringDictionary[js.Array[Threshold]],
    `throw`: Boolean,
    tlsAuth: js.Array[Certificate],
    tlsCipherSuites: js.Array[CipherSuite],
    tlsVersion: String | Max,
    userAgent: String,
    vus: Double,
    vusMax: Double
  ): Options = {
    val __obj = js.Dynamic.literal(batch = batch.asInstanceOf[js.Any], batchPerHost = batchPerHost.asInstanceOf[js.Any], blacklistIPs = blacklistIPs.asInstanceOf[js.Any], discardResponseBodies = discardResponseBodies.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], hosts = hosts.asInstanceOf[js.Any], httpDebug = httpDebug.asInstanceOf[js.Any], insecureSkipTLSVerify = insecureSkipTLSVerify.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], linger = linger.asInstanceOf[js.Any], maxRedirects = maxRedirects.asInstanceOf[js.Any], minIterationDuration = minIterationDuration.asInstanceOf[js.Any], noConnectionReuse = noConnectionReuse.asInstanceOf[js.Any], noUsageReport = noUsageReport.asInstanceOf[js.Any], noVUConnectionReuse = noVUConnectionReuse.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], rps = rps.asInstanceOf[js.Any], setupTimeout = setupTimeout.asInstanceOf[js.Any], stages = stages.asInstanceOf[js.Any], summaryTrendStats = summaryTrendStats.asInstanceOf[js.Any], systemTags = systemTags.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], teardownTimeout = teardownTimeout.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any], tlsAuth = tlsAuth.asInstanceOf[js.Any], tlsCipherSuites = tlsCipherSuites.asInstanceOf[js.Any], tlsVersion = tlsVersion.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], vus = vus.asInstanceOf[js.Any], vusMax = vusMax.asInstanceOf[js.Any])
    __obj.updateDynamic("throw")(`throw`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

