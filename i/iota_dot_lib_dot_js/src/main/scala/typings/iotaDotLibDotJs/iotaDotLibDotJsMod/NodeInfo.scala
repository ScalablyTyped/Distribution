package typings.iotaDotLibDotJs.iotaDotLibDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeInfo extends js.Object {
  var appName: String
  var appVersion: String
  var duration: Double
  var jreAvailableProcessors: Double
  var jreFreeMemory: Double
  var jreMaxMemory: Double
  var jreTotalMemory: Double
  var jreVersion: String
  var latestMilestone: String
  var latestMilestoneIndex: Double
  var latestSolidSubtangleMilestone: String
  var latestSolidSubtangleMilestoneIndex: Double
  var neighbors: Double
  var packetsQueueSize: Double
  var time: Double
  var tips: Double
  var transactionsToRequest: Double
}

object NodeInfo {
  @scala.inline
  def apply(
    appName: String,
    appVersion: String,
    duration: Double,
    jreAvailableProcessors: Double,
    jreFreeMemory: Double,
    jreMaxMemory: Double,
    jreTotalMemory: Double,
    jreVersion: String,
    latestMilestone: String,
    latestMilestoneIndex: Double,
    latestSolidSubtangleMilestone: String,
    latestSolidSubtangleMilestoneIndex: Double,
    neighbors: Double,
    packetsQueueSize: Double,
    time: Double,
    tips: Double,
    transactionsToRequest: Double
  ): NodeInfo = {
    val __obj = js.Dynamic.literal(appName = appName, appVersion = appVersion, duration = duration, jreAvailableProcessors = jreAvailableProcessors, jreFreeMemory = jreFreeMemory, jreMaxMemory = jreMaxMemory, jreTotalMemory = jreTotalMemory, jreVersion = jreVersion, latestMilestone = latestMilestone, latestMilestoneIndex = latestMilestoneIndex, latestSolidSubtangleMilestone = latestSolidSubtangleMilestone, latestSolidSubtangleMilestoneIndex = latestSolidSubtangleMilestoneIndex, neighbors = neighbors, packetsQueueSize = packetsQueueSize, time = time, tips = tips, transactionsToRequest = transactionsToRequest)
  
    __obj.asInstanceOf[NodeInfo]
  }
}

