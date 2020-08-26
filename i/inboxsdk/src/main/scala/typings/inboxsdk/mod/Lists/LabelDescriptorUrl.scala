package typings.inboxsdk.mod.Lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelDescriptorUrl
  extends LabelDescriptorBase
     with LabelDescriptor {
  var iconClass: js.UndefOr[String] = js.native
  var iconUrl: String = js.native
}

object LabelDescriptorUrl {
  @scala.inline
  def apply(iconUrl: String, title: String): LabelDescriptorUrl = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelDescriptorUrl]
  }
  @scala.inline
  implicit class LabelDescriptorUrlOps[Self <: LabelDescriptorUrl] (val x: Self) extends AnyVal {
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
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
  }
  
}

