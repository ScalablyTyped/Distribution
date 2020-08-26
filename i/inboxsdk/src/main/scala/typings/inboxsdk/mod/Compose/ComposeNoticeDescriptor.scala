package typings.inboxsdk.mod.Compose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposeNoticeDescriptor extends js.Object {
  var orderHint: js.UndefOr[Double] = js.native
}

object ComposeNoticeDescriptor {
  @scala.inline
  def apply(): ComposeNoticeDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComposeNoticeDescriptor]
  }
  @scala.inline
  implicit class ComposeNoticeDescriptorOps[Self <: ComposeNoticeDescriptor] (val x: Self) extends AnyVal {
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
    def setOrderHint(value: Double): Self = this.set("orderHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderHint: Self = this.set("orderHint", js.undefined)
  }
  
}

