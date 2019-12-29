package typings.jsforce.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchInfo extends js.Object {
  var id: String
  var jobId: String
  var numberRecordsFailed: String
  var numberRecordsProcessed: String
  var state: String
  var stateMessage: String
  var totalProcessingTime: String
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
}

