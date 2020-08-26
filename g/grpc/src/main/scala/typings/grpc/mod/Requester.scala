package typings.grpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Requester extends js.Object {
  var cancel: js.UndefOr[CancelRequester] = js.native
  var getPeer: js.UndefOr[GetPeerRequester] = js.native
  var halfClose: js.UndefOr[CloseRequester] = js.native
  var sendMessage: js.UndefOr[MessageRequester] = js.native
  var start: js.UndefOr[MetadataRequester] = js.native
}

object Requester {
  @scala.inline
  def apply(): Requester = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Requester]
  }
  @scala.inline
  implicit class RequesterOps[Self <: Requester] (val x: Self) extends AnyVal {
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
    def setCancel(value: /* next */ js.Function => Unit): Self = this.set("cancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setGetPeer(value: /* next */ js.Function => String): Self = this.set("getPeer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPeer: Self = this.set("getPeer", js.undefined)
    @scala.inline
    def setHalfClose(value: /* next */ js.Function => Unit): Self = this.set("halfClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHalfClose: Self = this.set("halfClose", js.undefined)
    @scala.inline
    def setSendMessage(value: (/* message */ js.Any, /* next */ js.Function) => Unit): Self = this.set("sendMessage", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSendMessage: Self = this.set("sendMessage", js.undefined)
    @scala.inline
    def setStart(value: (/* metadata */ Metadata, /* listener */ Listener, /* next */ js.Function) => Unit): Self = this.set("start", js.Any.fromFunction3(value))
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

