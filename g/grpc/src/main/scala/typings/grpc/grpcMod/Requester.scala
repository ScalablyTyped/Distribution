package typings.grpc.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Requester extends js.Object {
  var cancel: js.UndefOr[CancelRequester] = js.undefined
  var getPeer: js.UndefOr[GetPeerRequester] = js.undefined
  var halfClose: js.UndefOr[CloseRequester] = js.undefined
  var sendMessage: js.UndefOr[MessageRequester] = js.undefined
  var start: js.UndefOr[MetadataRequester] = js.undefined
}

object Requester {
  @scala.inline
  def apply(
    cancel: CancelRequester = null,
    getPeer: GetPeerRequester = null,
    halfClose: CloseRequester = null,
    sendMessage: MessageRequester = null,
    start: MetadataRequester = null
  ): Requester = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (getPeer != null) __obj.updateDynamic("getPeer")(getPeer)
    if (halfClose != null) __obj.updateDynamic("halfClose")(halfClose)
    if (sendMessage != null) __obj.updateDynamic("sendMessage")(sendMessage)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Requester]
  }
}

