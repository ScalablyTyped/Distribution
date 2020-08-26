package typings.inboxsdk.mod.Compose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusBarDescriptor extends js.Object {
  var height: js.UndefOr[Double] = js.native
  var orderHint: js.UndefOr[Double] = js.native
}

object StatusBarDescriptor {
  @scala.inline
  def apply(): StatusBarDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusBarDescriptor]
  }
  @scala.inline
  implicit class StatusBarDescriptorOps[Self <: StatusBarDescriptor] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setOrderHint(value: Double): Self = this.set("orderHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderHint: Self = this.set("orderHint", js.undefined)
  }
  
}

