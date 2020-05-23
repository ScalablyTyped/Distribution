package typings.grpcGrpcJs.pickerMod

import typings.grpcGrpcJs.callStreamMod.StatusObject
import typings.grpcGrpcJs.pickerMod.PickResultType.TRANSIENT_FAILURE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransientFailurePickResult extends PickResult {
  @JSName("pickResultType")
  var pickResultType_TransientFailurePickResult: TRANSIENT_FAILURE
  @JSName("status")
  var status_TransientFailurePickResult: StatusObject
  @JSName("subchannel")
  var subchannel_TransientFailurePickResult: Null
}

object TransientFailurePickResult {
  @scala.inline
  def apply(pickResultType: TRANSIENT_FAILURE, status: StatusObject, subchannel: Null): TransientFailurePickResult = {
    val __obj = js.Dynamic.literal(pickResultType = pickResultType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subchannel = subchannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransientFailurePickResult]
  }
}

