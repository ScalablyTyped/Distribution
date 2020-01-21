package typings.grpc.mod

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
    cancel: /* next */ js.Function => Unit = null,
    getPeer: /* next */ js.Function => String = null,
    halfClose: /* next */ js.Function => Unit = null,
    sendMessage: (/* message */ js.Any, /* next */ js.Function) => Unit = null,
    start: (/* metadata */ Metadata, /* listener */ Listener, /* next */ js.Function) => Unit = null
  ): Requester = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1(cancel))
    if (getPeer != null) __obj.updateDynamic("getPeer")(js.Any.fromFunction1(getPeer))
    if (halfClose != null) __obj.updateDynamic("halfClose")(js.Any.fromFunction1(halfClose))
    if (sendMessage != null) __obj.updateDynamic("sendMessage")(js.Any.fromFunction2(sendMessage))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction3(start))
    __obj.asInstanceOf[Requester]
  }
}

