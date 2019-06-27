package typings
package k6Lib.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var batch: scala.Double
  var batchPerHost: scala.Double
  var blacklistIPs: js.Array[java.lang.String]
  var discardResponseBodies: scala.Boolean
  var duration: java.lang.String
  var ext: org.scalablytyped.runtime.StringDictionary[CollectorOptions]
  var hosts: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var httpDebug: java.lang.String
  var insecureSkipTLSVerify: scala.Boolean
  var iterations: scala.Double
  var linger: scala.Boolean
  var maxRedirects: scala.Double
  var minIterationDuration: java.lang.String
  var noConnectionReuse: scala.Boolean
  var noUsageReport: scala.Boolean
  var noVUConnectionReuse: scala.Boolean
  var paused: scala.Boolean
  var rps: scala.Double
  var setupTimeout: java.lang.String
  var stages: js.Array[Stage]
  var summaryTrendStats: js.Array[java.lang.String]
  var systemTags: js.Array[java.lang.String]
  var tags: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var teardownTimeout: java.lang.String
  var thresholds: org.scalablytyped.runtime.StringDictionary[js.Array[Threshold]]
  var `throw`: scala.Boolean
  var tlsAuth: js.Array[Certificate]
  var tlsCipherSuites: js.Array[java.lang.String]
  var tlsVersion: java.lang.String | k6Lib.Anon_Max
  var userAgent: java.lang.String
  var vus: scala.Double
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
    tlsCipherSuites: js.Array[java.lang.String],
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

