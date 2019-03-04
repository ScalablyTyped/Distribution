package typings
package jsforceLib.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchInfo extends js.Object {
  var id: java.lang.String
  var jobId: java.lang.String
  var state: java.lang.String
  var stateMessage: java.lang.String
}

object BatchInfo {
  @scala.inline
  def apply(
    id: java.lang.String,
    jobId: java.lang.String,
    state: java.lang.String,
    stateMessage: java.lang.String
  ): BatchInfo = {
    val __obj = js.Dynamic.literal(id = id, jobId = jobId, state = state, stateMessage = stateMessage)
  
    __obj.asInstanceOf[BatchInfo]
  }
}

