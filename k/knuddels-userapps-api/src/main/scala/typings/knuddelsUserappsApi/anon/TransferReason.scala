package typings.knuddelsUserappsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferReason extends js.Object {
  var onError: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
  var onSuccess: js.UndefOr[js.Function0[Unit]] = js.native
  var transferReason: js.UndefOr[String] = js.native
}

object TransferReason {
  @scala.inline
  def apply(): TransferReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferReason]
  }
  @scala.inline
  implicit class TransferReasonOps[Self <: TransferReason] (val x: Self) extends AnyVal {
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
    def setOnError(value: /* message */ String => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnSuccess(value: () => Unit): Self = this.set("onSuccess", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
    @scala.inline
    def setTransferReason(value: String): Self = this.set("transferReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferReason: Self = this.set("transferReason", js.undefined)
  }
  
}

