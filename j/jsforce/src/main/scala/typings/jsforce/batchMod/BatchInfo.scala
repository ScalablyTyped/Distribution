package typings.jsforce.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchInfo extends js.Object {
  
  var id: String = js.native
  
  var jobId: String = js.native
  
  var numberRecordsFailed: String = js.native
  
  var numberRecordsProcessed: String = js.native
  
  var state: String = js.native
  
  var stateMessage: String = js.native
  
  var totalProcessingTime: String = js.native
}
object BatchInfo {
  
  @scala.inline
  def apply(
    id: String,
    jobId: String,
    numberRecordsFailed: String,
    numberRecordsProcessed: String,
    state: String,
    stateMessage: String,
    totalProcessingTime: String
  ): BatchInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], numberRecordsFailed = numberRecordsFailed.asInstanceOf[js.Any], numberRecordsProcessed = numberRecordsProcessed.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateMessage = stateMessage.asInstanceOf[js.Any], totalProcessingTime = totalProcessingTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchInfo]
  }
  
  @scala.inline
  implicit class BatchInfoOps[Self <: BatchInfo] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberRecordsFailed(value: String): Self = this.set("numberRecordsFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberRecordsProcessed(value: String): Self = this.set("numberRecordsProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMessage(value: String): Self = this.set("stateMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalProcessingTime(value: String): Self = this.set("totalProcessingTime", value.asInstanceOf[js.Any])
  }
}
