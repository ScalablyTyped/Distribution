package typings.grpcGrpcJs.pickerMod

import typings.grpcGrpcJs.callStreamMod.StatusObject
import typings.grpcGrpcJs.subchannelMod.Subchannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickResult extends js.Object {
  var pickResultType: PickResultType
  /**
    * The status object to end the call with. Populated if and only if
    * `pickResultType` is TRANSIENT_FAILURE.
    */
  var status: StatusObject | Null
  /**
    * The subchannel to use as the transport for the call. Only meaningful if
    * `pickResultType` is COMPLETE. If null, indicates that the call should be
    * dropped.
    */
  var subchannel: Subchannel | Null
}

object PickResult {
  @scala.inline
  def apply(pickResultType: PickResultType, status: StatusObject = null, subchannel: Subchannel = null): PickResult = {
    val __obj = js.Dynamic.literal(pickResultType = pickResultType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subchannel != null) __obj.updateDynamic("subchannel")(subchannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickResult]
  }
}

