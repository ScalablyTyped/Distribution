package typings.inboxsdk.mod.Conversations

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentPanelDescriptor extends js.Object {
  var appIconUrl: js.UndefOr[String] = js.native
  var appName: js.UndefOr[String] = js.native
  var el: HTMLElement = js.native
  var hideTitleBar: js.UndefOr[Boolean] = js.native
  var iconUrl: String = js.native
  var id: js.UndefOr[String] = js.native
  var orderHint: js.UndefOr[Double] = js.native
  var title: String = js.native
}

object ContentPanelDescriptor {
  @scala.inline
  def apply(el: HTMLElement, iconUrl: String, title: String): ContentPanelDescriptor = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentPanelDescriptor]
  }
  @scala.inline
  implicit class ContentPanelDescriptorOps[Self <: ContentPanelDescriptor] (val x: Self) extends AnyVal {
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
    def setEl(value: HTMLElement): Self = this.set("el", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppIconUrl(value: String): Self = this.set("appIconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppIconUrl: Self = this.set("appIconUrl", js.undefined)
    @scala.inline
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppName: Self = this.set("appName", js.undefined)
    @scala.inline
    def setHideTitleBar(value: Boolean): Self = this.set("hideTitleBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideTitleBar: Self = this.set("hideTitleBar", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOrderHint(value: Double): Self = this.set("orderHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderHint: Self = this.set("orderHint", js.undefined)
  }
  
}

