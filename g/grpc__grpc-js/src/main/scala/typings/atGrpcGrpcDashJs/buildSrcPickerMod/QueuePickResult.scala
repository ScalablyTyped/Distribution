package typings.atGrpcGrpcDashJs.buildSrcPickerMod

import typings.atGrpcGrpcDashJs.buildSrcPickerMod.PickResultType.QUEUE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueuePickResult extends PickResult {
  @JSName("pickResultType")
  var pickResultType_QueuePickResult: QUEUE
  @JSName("status")
  var status_QueuePickResult: Null
  @JSName("subchannel")
  var subchannel_QueuePickResult: Null
}

object QueuePickResult {
  @scala.inline
  def apply(pickResultType: QUEUE, status: Null, subchannel: Null): QueuePickResult = {
    val __obj = js.Dynamic.literal(pickResultType = pickResultType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subchannel = subchannel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueuePickResult]
  }
}

