package typings
package k6Lib.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Maximum parallel `http.batch()` connections per VU. */
  var batch: scala.Double
  /** Maximum parallel `http.batch()` host connections per VU. */
  var batchPerHost: scala.Double
  /** Blacklist IP ranges from being called. */
  var blacklistIPs: js.Array[java.lang.String]
  /** Discard response bodies. */
  var discardResponseBodies: scala.Boolean
  /** Test duration. */
  var duration: java.lang.String
  /** Third party collector configuration. */
  var ext: org.scalablytyped.runtime.StringDictionary[CollectorOptions]
  /** Static hostname mapping. */
  var hosts: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /** Log all HTTP requests and responses. */
  var httpDebug: java.lang.String
  /** Disable TLS verification. Insecure. */
  var insecureSkipTLSVerify: scala.Boolean
  /** Iterations to execute. */
  var iterations: scala.Double
  /** Persist the k6 process after test completion. */
  var linger: scala.Boolean
  /** Maximum HTTP redirects to follow. */
  var maxRedirects: scala.Double
  /** Minimum test iteration duration. */
  var minIterationDuration: java.lang.String
  /** Disable keepalive connections. */
  var noConnectionReuse: scala.Boolean
  /** Disable usage reports. */
  var noUsageReport: scala.Boolean
  /** Disable cross-VU TCP connection reuse. */
  var noVUConnectionReuse: scala.Boolean
  /** Start test in paused state. */
  var paused: scala.Boolean
  /** Maximum requests per second across all VUs. */
  var rps: scala.Double
  /** Setup function timeout. */
  var setupTimeout: java.lang.String
  /** Test stage specifications. Program of target VU stages. */
  var stages: js.Array[Stage]
  /** Define stats for trend metrics. */
  var summaryTrendStats: js.Array[java.lang.String]
  /** Which system tags to include in collected metrics. */
  var systemTags: js.Array[java.lang.String]
  /** Tags to set test wide across all metrics. */
  var tags: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /** Teardown function timeout. */
  var teardownTimeout: java.lang.String
  /** Threshold specifications. Defines pass and fail conditions. */
  var thresholds: org.scalablytyped.runtime.StringDictionary[js.Array[Threshold]]
  /** Throw error on failed HTTP request. */
  var `throw`: scala.Boolean
  /** TLS client certificates. */
  var tlsAuth: js.Array[Certificate]
  /** Allowed TLS cipher suites. */
  var tlsCipherSuites: js.Array[k6Lib.httpMod.CipherSuite]
  /** Allowed TLS version. Use `http.SSL_*` `http.TLS_*` constants. */
  var tlsVersion: java.lang.String | k6Lib.Anon_Max
  /** User agent string to include in HTTP requests. */
  var userAgent: java.lang.String
  /** Number of VUs to run concurrently. */
  var vus: scala.Double
  /** Maximum VUs. Preallocates VUs to enable faster scaling. */
  var vusMax: scala.Double
}

object Options {
  @scala.inline
  def apply(
    batch: scala.Double,
    batchPerHost: scala.Double,
    blacklistIPs: js.Array[java.lang.String],
    discardResponseBodies: scala.Boolean,
    duration: java.lang.String,
    ext: org.scalablytyped.runtime.StringDictionary[CollectorOptions],
    hosts: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    httpDebug: java.lang.String,
    insecureSkipTLSVerify: scala.Boolean,
    iterations: scala.Double,
    linger: scala.Boolean,
    maxRedirects: scala.Double,
    minIterationDuration: java.lang.String,
    noConnectionReuse: scala.Boolean,
    noUsageReport: scala.Boolean,
    noVUConnectionReuse: scala.Boolean,
    paused: scala.Boolean,
    rps: scala.Double,
    setupTimeout: java.lang.String,
    stages: js.Array[Stage],
    summaryTrendStats: js.Array[java.lang.String],
    systemTags: js.Array[java.lang.String],
    tags: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    teardownTimeout: java.lang.String,
    thresholds: org.scalablytyped.runtime.StringDictionary[js.Array[Threshold]],
    `throw`: scala.Boolean,
    tlsAuth: js.Array[Certificate],
    tlsCipherSuites: js.Array[k6Lib.httpMod.CipherSuite],
    tlsVersion: java.lang.String | k6Lib.Anon_Max,
    userAgent: java.lang.String,
    vus: scala.Double,
    vusMax: scala.Double
  ): Options = {
    val __obj = js.Dynamic.literal(batch = batch, batchPerHost = batchPerHost, blacklistIPs = blacklistIPs, discardResponseBodies = discardResponseBodies, duration = duration, ext = ext, hosts = hosts, httpDebug = httpDebug, insecureSkipTLSVerify = insecureSkipTLSVerify, iterations = iterations, linger = linger, maxRedirects = maxRedirects, minIterationDuration = minIterationDuration, noConnectionReuse = noConnectionReuse, noUsageReport = noUsageReport, noVUConnectionReuse = noVUConnectionReuse, paused = paused, rps = rps, setupTimeout = setupTimeout, stages = stages, summaryTrendStats = summaryTrendStats, systemTags = systemTags, tags = tags, teardownTimeout = teardownTimeout, thresholds = thresholds, tlsAuth = tlsAuth, tlsCipherSuites = tlsCipherSuites, tlsVersion = tlsVersion.asInstanceOf[js.Any], userAgent = userAgent, vus = vus, vusMax = vusMax)
    __obj.updateDynamic("throw")(`throw`)
    __obj.asInstanceOf[Options]
  }
}

