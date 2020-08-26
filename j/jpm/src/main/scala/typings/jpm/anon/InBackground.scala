package typings.jpm.anon

import typings.jpm.FFAddonSDK.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InBackground extends js.Object {
  var inBackground: js.UndefOr[Boolean] = js.native
  var inNewWindow: js.UndefOr[Boolean] = js.native
  var isPinned: js.UndefOr[Boolean] = js.native
  var onActivate: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.native
  var onClose: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.native
  var onDeactivate: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.native
  var onLoad: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.native
  var onOpen: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.native
  var onPageShow: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.native
  var onReady: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.native
  var url: String = js.native
}

object InBackground {
  @scala.inline
  def apply(url: String): InBackground = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[InBackground]
  }
  @scala.inline
  implicit class InBackgroundOps[Self <: InBackground] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setInBackground(value: Boolean): Self = this.set("inBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInBackground: Self = this.set("inBackground", js.undefined)
    @scala.inline
    def setInNewWindow(value: Boolean): Self = this.set("inNewWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInNewWindow: Self = this.set("inNewWindow", js.undefined)
    @scala.inline
    def setIsPinned(value: Boolean): Self = this.set("isPinned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPinned: Self = this.set("isPinned", js.undefined)
    @scala.inline
    def setOnActivate(value: /* tab */ Tab => _): Self = this.set("onActivate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnActivate: Self = this.set("onActivate", js.undefined)
    @scala.inline
    def setOnClose(value: /* tab */ Tab => _): Self = this.set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnDeactivate(value: /* tab */ Tab => _): Self = this.set("onDeactivate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDeactivate: Self = this.set("onDeactivate", js.undefined)
    @scala.inline
    def setOnLoad(value: /* tab */ Tab => _): Self = this.set("onLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOnOpen(value: /* tab */ Tab => _): Self = this.set("onOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    @scala.inline
    def setOnPageShow(value: /* tab */ Tab => _): Self = this.set("onPageShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPageShow: Self = this.set("onPageShow", js.undefined)
    @scala.inline
    def setOnReady(value: /* tab */ Tab => _): Self = this.set("onReady", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
  }
  
}

