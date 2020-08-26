package typings.inboxsdk.mod.Widgets

import typings.inboxsdk.mod.Compose.ComposeView
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerOptions extends js.Object {
  var chrome: js.UndefOr[Boolean] = js.native
  var closeWithCompose: js.UndefOr[Boolean] = js.native
  var composeView: js.UndefOr[ComposeView] = js.native
  var el: HTMLElement = js.native
  var title: js.UndefOr[String] = js.native
}

object DrawerOptions {
  @scala.inline
  def apply(el: HTMLElement): DrawerOptions = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerOptions]
  }
  @scala.inline
  implicit class DrawerOptionsOps[Self <: DrawerOptions] (val x: Self) extends AnyVal {
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
    def setChrome(value: Boolean): Self = this.set("chrome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChrome: Self = this.set("chrome", js.undefined)
    @scala.inline
    def setCloseWithCompose(value: Boolean): Self = this.set("closeWithCompose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseWithCompose: Self = this.set("closeWithCompose", js.undefined)
    @scala.inline
    def setComposeView(value: ComposeView): Self = this.set("composeView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComposeView: Self = this.set("composeView", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

