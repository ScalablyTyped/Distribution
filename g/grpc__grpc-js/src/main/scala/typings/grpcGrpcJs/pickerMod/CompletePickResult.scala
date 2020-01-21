package typings.grpcGrpcJs.pickerMod

import typings.grpcGrpcJs.pickerMod.PickResultType.COMPLETE
import typings.grpcGrpcJs.subchannelMod.Subchannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletePickResult extends PickResult {
  @JSName("pickResultType")
  var pickResultType_CompletePickResult: COMPLETE
  @JSName("status")
  var status_CompletePickResult: Null
}

object CompletePickResult {
  @scala.inline
  def apply(pickResultType: COMPLETE, status: Null, subchannel: Subchannel = null): CompletePickResult = {
    val __obj = js.Dynamic.literal(pickResultType = pickResultType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (subchannel != null) __obj.updateDynamic("subchannel")(subchannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletePickResult]
  }
}

