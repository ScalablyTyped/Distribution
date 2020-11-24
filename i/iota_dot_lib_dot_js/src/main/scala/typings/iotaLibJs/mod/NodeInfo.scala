package typings.iotaLibJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeInfo extends js.Object {
  
  var appName: String = js.native
  
  var appVersion: String = js.native
  
  var duration: Double = js.native
  
  var jreAvailableProcessors: Double = js.native
  
  var jreFreeMemory: Double = js.native
  
  var jreMaxMemory: Double = js.native
  
  var jreTotalMemory: Double = js.native
  
  var jreVersion: String = js.native
  
  var latestMilestone: String = js.native
  
  var latestMilestoneIndex: Double = js.native
  
  var latestSolidSubtangleMilestone: String = js.native
  
  var latestSolidSubtangleMilestoneIndex: Double = js.native
  
  var neighbors: Double = js.native
  
  var packetsQueueSize: Double = js.native
  
  var time: Double = js.native
  
  var tips: Double = js.native
  
  var transactionsToRequest: Double = js.native
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
  
  @scala.inline
  implicit class NodeInfoOps[Self <: NodeInfo] (val x: Self) extends AnyVal {
    
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
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppVersion(value: String): Self = this.set("appVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJreAvailableProcessors(value: Double): Self = this.set("jreAvailableProcessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJreFreeMemory(value: Double): Self = this.set("jreFreeMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJreMaxMemory(value: Double): Self = this.set("jreMaxMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJreTotalMemory(value: Double): Self = this.set("jreTotalMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJreVersion(value: String): Self = this.set("jreVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestMilestone(value: String): Self = this.set("latestMilestone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestMilestoneIndex(value: Double): Self = this.set("latestMilestoneIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestSolidSubtangleMilestone(value: String): Self = this.set("latestSolidSubtangleMilestone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestSolidSubtangleMilestoneIndex(value: Double): Self = this.set("latestSolidSubtangleMilestoneIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeighbors(value: Double): Self = this.set("neighbors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketsQueueSize(value: Double): Self = this.set("packetsQueueSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTips(value: Double): Self = this.set("tips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionsToRequest(value: Double): Self = this.set("transactionsToRequest", value.asInstanceOf[js.Any])
  }
}
