package typings.knuddelsUserappsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomMessage extends js.Object {
  var customMessage: js.UndefOr[String] = js.native
  var toAccount: js.UndefOr[Boolean] = js.native
  var transferReason: js.UndefOr[String] = js.native
}

object CustomMessage {
  @scala.inline
  def apply(): CustomMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomMessage]
  }
  @scala.inline
  implicit class CustomMessageOps[Self <: CustomMessage] (val x: Self) extends AnyVal {
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
    def setCustomMessage(value: String): Self = this.set("customMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomMessage: Self = this.set("customMessage", js.undefined)
    @scala.inline
    def setToAccount(value: Boolean): Self = this.set("toAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToAccount: Self = this.set("toAccount", js.undefined)
    @scala.inline
    def setTransferReason(value: String): Self = this.set("transferReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferReason: Self = this.set("transferReason", js.undefined)
  }
  
}

