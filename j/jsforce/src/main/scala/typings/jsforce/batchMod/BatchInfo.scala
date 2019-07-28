package typings.jsforce.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchInfo extends js.Object {
  var id: String
  var jobId: String
  var state: String
  var stateMessage: String
}

object BatchInfo {
  @scala.inline
  def apply(id: String, jobId: String, state: String, stateMessage: String): BatchInfo = {
    val __obj = js.Dynamic.literal(id = id, jobId = jobId, state = state, stateMessage = stateMessage)
  
    __obj.asInstanceOf[BatchInfo]
  }
}

