package typings.k6.optionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.k6.anon.Max
import typings.k6.httpMod.CipherSuite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Maximum parallel `http.batch()` connections per VU. */
  var batch: js.UndefOr[Double] = js.undefined
  /** Maximum parallel `http.batch()` host connections per VU. */
  var batchPerHost: js.UndefOr[Double] = js.undefined
  /** Blacklist IP ranges from being called. */
  var blacklistIPs: js.UndefOr[js.Array[String]] = js.undefined
  /** Discard response bodies. */
  var discardResponseBodies: js.UndefOr[Boolean] = js.undefined
  /** Test duration. */
  var duration: js.UndefOr[String] = js.undefined
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
  /** Disable usage reports. */
  var noUsageReport: js.UndefOr[Boolean] = js.undefined
  /** Disable cross-VU TCP connection reuse. */
  var noVUConnectionReuse: js.UndefOr[Boolean] = js.undefined
  /** Start test in paused state. */
  var paused: js.UndefOr[Boolean] = js.undefined
  /** Maximum requests per second across all VUs. */
  var rps: js.UndefOr[Double] = js.undefined
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
  @scala.inline
  def apply(
    batch: js.UndefOr[Double] = js.undefined,
    batchPerHost: js.UndefOr[Double] = js.undefined,
    blacklistIPs: js.Array[String] = null,
    discardResponseBodies: js.UndefOr[Boolean] = js.undefined,
    duration: String = null,
    ext: StringDictionary[CollectorOptions] = null,
    hosts: StringDictionary[String] = null,
    httpDebug: String = null,
    insecureSkipTLSVerify: js.UndefOr[Boolean] = js.undefined,
    iterations: js.UndefOr[Double] = js.undefined,
    linger: js.UndefOr[Boolean] = js.undefined,
    maxRedirects: js.UndefOr[Double] = js.undefined,
    minIterationDuration: String = null,
    noConnectionReuse: js.UndefOr[Boolean] = js.undefined,
    noUsageReport: js.UndefOr[Boolean] = js.undefined,
    noVUConnectionReuse: js.UndefOr[Boolean] = js.undefined,
    paused: js.UndefOr[Boolean] = js.undefined,
    rps: js.UndefOr[Double] = js.undefined,
    setupTimeout: String = null,
    stages: js.Array[Stage] = null,
    summaryTrendStats: js.Array[String] = null,
    systemTags: js.Array[String] = null,
    tags: StringDictionary[String] = null,
    teardownTimeout: String = null,
    thresholds: StringDictionary[js.Array[Threshold]] = null,
    `throw`: js.UndefOr[Boolean] = js.undefined,
    tlsAuth: js.Array[Certificate] = null,
    tlsCipherSuites: js.Array[CipherSuite] = null,
    tlsVersion: String | Max = null,
    userAgent: String = null,
    vus: js.UndefOr[Double] = js.undefined,
    vusMax: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batch)) __obj.updateDynamic("batch")(batch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(batchPerHost)) __obj.updateDynamic("batchPerHost")(batchPerHost.get.asInstanceOf[js.Any])
    if (blacklistIPs != null) __obj.updateDynamic("blacklistIPs")(blacklistIPs.asInstanceOf[js.Any])
    if (!js.isUndefined(discardResponseBodies)) __obj.updateDynamic("discardResponseBodies")(discardResponseBodies.get.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (hosts != null) __obj.updateDynamic("hosts")(hosts.asInstanceOf[js.Any])
    if (httpDebug != null) __obj.updateDynamic("httpDebug")(httpDebug.asInstanceOf[js.Any])
    if (!js.isUndefined(insecureSkipTLSVerify)) __obj.updateDynamic("insecureSkipTLSVerify")(insecureSkipTLSVerify.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iterations)) __obj.updateDynamic("iterations")(iterations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(linger)) __obj.updateDynamic("linger")(linger.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRedirects)) __obj.updateDynamic("maxRedirects")(maxRedirects.get.asInstanceOf[js.Any])
    if (minIterationDuration != null) __obj.updateDynamic("minIterationDuration")(minIterationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(noConnectionReuse)) __obj.updateDynamic("noConnectionReuse")(noConnectionReuse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noUsageReport)) __obj.updateDynamic("noUsageReport")(noUsageReport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noVUConnectionReuse)) __obj.updateDynamic("noVUConnectionReuse")(noVUConnectionReuse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rps)) __obj.updateDynamic("rps")(rps.get.asInstanceOf[js.Any])
    if (setupTimeout != null) __obj.updateDynamic("setupTimeout")(setupTimeout.asInstanceOf[js.Any])
    if (stages != null) __obj.updateDynamic("stages")(stages.asInstanceOf[js.Any])
    if (summaryTrendStats != null) __obj.updateDynamic("summaryTrendStats")(summaryTrendStats.asInstanceOf[js.Any])
    if (systemTags != null) __obj.updateDynamic("systemTags")(systemTags.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (teardownTimeout != null) __obj.updateDynamic("teardownTimeout")(teardownTimeout.asInstanceOf[js.Any])
    if (thresholds != null) __obj.updateDynamic("thresholds")(thresholds.asInstanceOf[js.Any])
    if (!js.isUndefined(`throw`)) __obj.updateDynamic("throw")(`throw`.get.asInstanceOf[js.Any])
    if (tlsAuth != null) __obj.updateDynamic("tlsAuth")(tlsAuth.asInstanceOf[js.Any])
    if (tlsCipherSuites != null) __obj.updateDynamic("tlsCipherSuites")(tlsCipherSuites.asInstanceOf[js.Any])
    if (tlsVersion != null) __obj.updateDynamic("tlsVersion")(tlsVersion.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    if (!js.isUndefined(vus)) __obj.updateDynamic("vus")(vus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vusMax)) __obj.updateDynamic("vusMax")(vusMax.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

