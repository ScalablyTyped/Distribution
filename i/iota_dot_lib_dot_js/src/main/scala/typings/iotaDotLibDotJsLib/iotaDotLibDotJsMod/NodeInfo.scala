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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appName")(appName)
    __obj.updateDynamic("appVersion")(appVersion)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("jreAvailableProcessors")(jreAvailableProcessors)
    __obj.updateDynamic("jreFreeMemory")(jreFreeMemory)
    __obj.updateDynamic("jreMaxMemory")(jreMaxMemory)
    __obj.updateDynamic("jreTotalMemory")(jreTotalMemory)
    __obj.updateDynamic("jreVersion")(jreVersion)
    __obj.updateDynamic("latestMilestone")(latestMilestone)
    __obj.updateDynamic("latestMilestoneIndex")(latestMilestoneIndex)
    __obj.updateDynamic("latestSolidSubtangleMilestone")(latestSolidSubtangleMilestone)
    __obj.updateDynamic("latestSolidSubtangleMilestoneIndex")(latestSolidSubtangleMilestoneIndex)
    __obj.updateDynamic("neighbors")(neighbors)
    __obj.updateDynamic("packetsQueueSize")(packetsQueueSize)
    __obj.updateDynamic("time")(time)
    __obj.updateDynamic("tips")(tips)
    __obj.updateDynamic("transactionsToRequest")(transactionsToRequest)
    __obj.asInstanceOf[NodeInfo]
  }
}

