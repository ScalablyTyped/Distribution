package typings.inboxsdk.mod.ButterBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadingMessageDescriptorBase extends js.Object {
  var className: js.UndefOr[String] = js.native
  var hideOnViewChanged: js.UndefOr[Boolean] = js.native
  var messageKey: js.UndefOr[js.Object | String] = js.native
  var persistent: js.UndefOr[Boolean] = js.native
  var priority: js.UndefOr[Double] = js.native
}

object LoadingMessageDescriptorBase {
  @scala.inline
  def apply(): LoadingMessageDescriptorBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadingMessageDescriptorBase]
  }
  @scala.inline
  implicit class LoadingMessageDescriptorBaseOps[Self <: LoadingMessageDescriptorBase] (val x: Self) extends AnyVal {
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
  }
  
}

