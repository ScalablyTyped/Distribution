package typings
package iotaDotLibDotJsLib.iotaDotLibDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeInfo extends js.Object {
  var appName: java.lang.String
  var appVersion: java.lang.String
  var duration: scala.Double
  var jreAvailableProcessors: scala.Double
  var jreFreeMemory: scala.Double
  var jreMaxMemory: scala.Double
  var jreTotalMemory: scala.Double
  var jreVersion: java.lang.String
  var latestMilestone: java.lang.String
  var latestMilestoneIndex: scala.Double
  var latestSolidSubtangleMilestone: java.lang.String
  var latestSolidSubtangleMilestoneIndex: scala.Double
  var neighbors: scala.Double
  var packetsQueueSize: scala.Double
  var time: scala.Double
  var tips: scala.Double
  var transactionsToRequest: scala.Double
}

object NodeInfo {
  @scala.inline
  def apply(
    appName: java.lang.String,
    appVersion: java.lang.String,
    duration: scala.Double,
    jreAvailableProcessors: scala.Double,
    jreFreeMemory: scala.Double,
    jreMaxMemory: scala.Double,
    jreTotalMemory: scala.Double,
    jreVersion: java.lang.String,
    latestMilestone: java.lang.String,
    latestMilestoneIndex: scala.Double,
    latestSolidSubtangleMilestone: java.lang.String,
    latestSolidSubtangleMilestoneIndex: scala.Double,
    neighbors: scala.Double,
    packetsQueueSize: scala.Double,
    time: scala.Double,
    tips: scala.Double,
    transactionsToRequest: scala.Double
  ): NodeInfo = {
    val __obj = js.Dynamic.literal(appName = appName, appVersion = appVersion, duration = duration, jreAvailableProcessors = jreAvailableProcessors, jreFreeMemory = jreFreeMemory, jreMaxMemory = jreMaxMemory, jreTotalMemory = jreTotalMemory, jreVersion = jreVersion, latestMilestone = latestMilestone, latestMilestoneIndex = latestMilestoneIndex, latestSolidSubtangleMilestone = latestSolidSubtangleMilestone, latestSolidSubtangleMilestoneIndex = latestSolidSubtangleMilestoneIndex, neighbors = neighbors, packetsQueueSize = packetsQueueSize, time = time, tips = tips, transactionsToRequest = transactionsToRequest)
  
    __obj.asInstanceOf[NodeInfo]
  }
}

