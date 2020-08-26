package typings.inboxsdk.mod.ButterBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingMessageDescriptorBase extends js.Object {
  var className: js.UndefOr[String] = js.native
  var confirmationText: js.UndefOr[String] = js.native
  var confirmationTime: js.UndefOr[Double] = js.native
  var hideOnViewChanged: js.UndefOr[Boolean] = js.native
  var messageKey: js.UndefOr[js.Object | String] = js.native
  var persistent: js.UndefOr[Boolean] = js.native
  var priority: js.UndefOr[Double] = js.native
  var showConfirmation: js.UndefOr[Boolean] = js.native
  var time: js.UndefOr[Double] = js.native
}

object SavingMessageDescriptorBase {
  @scala.inline
  def apply(): SavingMessageDescriptorBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingMessageDescriptorBase]
  }
  @scala.inline
  implicit class SavingMessageDescriptorBaseOps[Self <: SavingMessageDescriptorBase] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setConfirmationText(value: String): Self = this.set("confirmationText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmationText: Self = this.set("confirmationText", js.undefined)
    @scala.inline
    def setConfirmationTime(value: Double): Self = this.set("confirmationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmationTime: Self = this.set("confirmationTime", js.undefined)
    @scala.inline
    def setHideOnViewChanged(value: Boolean): Self = this.set("hideOnViewChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideOnViewChanged: Self = this.set("hideOnViewChanged", js.undefined)
    @scala.inline
    def setMessageKey(value: js.Object | String): Self = this.set("messageKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageKey: Self = this.set("messageKey", js.undefined)
    @scala.inline
    def setPersistent(value: Boolean): Self = this.set("persistent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistent: Self = this.set("persistent", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setShowConfirmation(value: Boolean): Self = this.set("showConfirmation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowConfirmation: Self = this.set("showConfirmation", js.undefined)
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
  
}

