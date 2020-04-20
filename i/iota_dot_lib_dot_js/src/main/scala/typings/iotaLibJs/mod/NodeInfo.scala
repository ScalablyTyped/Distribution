package typings.iotaLibJs.mod

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
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], jreAvailableProcessors = jreAvailableProcessors.asInstanceOf[js.Any], jreFreeMemory = jreFreeMemory.asInstanceOf[js.Any], jreMaxMemory = jreMaxMemory.asInstanceOf[js.Any], jreTotalMemory = jreTotalMemory.asInstanceOf[js.Any], jreVersion = jreVersion.asInstanceOf[js.Any], latestMilestone = latestMilestone.asInstanceOf[js.Any], latestMilestoneIndex = latestMilestoneIndex.asInstanceOf[js.Any], latestSolidSubtangleMilestone = latestSolidSubtangleMilestone.asInstanceOf[js.Any], latestSolidSubtangleMilestoneIndex = latestSolidSubtangleMilestoneIndex.asInstanceOf[js.Any], neighbors = neighbors.asInstanceOf[js.Any], packetsQueueSize = packetsQueueSize.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any], transactionsToRequest = transactionsToRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInfo]
  }
}

