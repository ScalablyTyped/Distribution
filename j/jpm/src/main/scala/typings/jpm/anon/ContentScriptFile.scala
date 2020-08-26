package typings.jpm.anon

import typings.jpm.jpmStrings.end
import typings.jpm.jpmStrings.ready
import typings.jpm.jpmStrings.start
import typings.jpm.panelMod.PanelPosition
import typings.std.Error
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentScriptFile extends js.Object {
  var allow: js.UndefOr[`0`] = js.native
  var contentScript: js.UndefOr[String | js.Array[String]] = js.native
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.native
  var contentScriptOptions: js.UndefOr[js.Any] = js.native
  var contentScriptWhen: js.UndefOr[start | ready | end] = js.native
  var contentStyle: js.UndefOr[String | js.Array[String]] = js.native
  var contentStyleFile: js.UndefOr[String | js.Array[String]] = js.native
  var contentURL: js.UndefOr[String | URL] = js.native
  var contextMenu: js.UndefOr[Boolean] = js.native
  var focus: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var onError: js.UndefOr[js.Function1[/* error */ Error, _]] = js.native
  var onHide: js.UndefOr[js.Function0[_]] = js.native
  var onMessage: js.UndefOr[js.Function1[/* message */ String, _]] = js.native
  var onShow: js.UndefOr[js.Function0[_]] = js.native
  var position: js.UndefOr[PanelPosition] = js.native
  var width: js.UndefOr[Double] = js.native
}

object ContentScriptFile {
  @scala.inline
  def apply(): ContentScriptFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentScriptFile]
  }
  @scala.inline
  implicit class ContentScriptFileOps[Self <: ContentScriptFile] (val x: Self) extends AnyVal {
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
    def setAllow(value: `0`): Self = this.set("allow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow: Self = this.set("allow", js.undefined)
    @scala.inline
    def setContentScriptVarargs(value: String*): Self = this.set("contentScript", js.Array(value :_*))
    @scala.inline
    def setContentScript(value: String | js.Array[String]): Self = this.set("contentScript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentScript: Self = this.set("contentScript", js.undefined)
    @scala.inline
    def setContentScriptFileVarargs(value: String*): Self = this.set("contentScriptFile", js.Array(value :_*))
    @scala.inline
    def setContentScriptFile(value: String | js.Array[String]): Self = this.set("contentScriptFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentScriptFile: Self = this.set("contentScriptFile", js.undefined)
    @scala.inline
    def setContentScriptOptions(value: js.Any): Self = this.set("contentScriptOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentScriptOptions: Self = this.set("contentScriptOptions", js.undefined)
    @scala.inline
    def setContentScriptWhen(value: start | ready | end): Self = this.set("contentScriptWhen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentScriptWhen: Self = this.set("contentScriptWhen", js.undefined)
    @scala.inline
    def setContentStyleVarargs(value: String*): Self = this.set("contentStyle", js.Array(value :_*))
    @scala.inline
    def setContentStyle(value: String | js.Array[String]): Self = this.set("contentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentStyle: Self = this.set("contentStyle", js.undefined)
    @scala.inline
    def setContentStyleFileVarargs(value: String*): Self = this.set("contentStyleFile", js.Array(value :_*))
    @scala.inline
    def setContentStyleFile(value: String | js.Array[String]): Self = this.set("contentStyleFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentStyleFile: Self = this.set("contentStyleFile", js.undefined)
    @scala.inline
    def setContentURL(value: String | URL): Self = this.set("contentURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentURL: Self = this.set("contentURL", js.undefined)
    @scala.inline
    def setContextMenu(value: Boolean): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    @scala.inline
    def setFocus(value: Boolean): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setOnError(value: /* error */ Error => _): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnHide(value: () => _): Self = this.set("onHide", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    @scala.inline
    def setOnMessage(value: /* message */ String => _): Self = this.set("onMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMessage: Self = this.set("onMessage", js.undefined)
    @scala.inline
    def setOnShow(value: () => _): Self = this.set("onShow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setPosition(value: PanelPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

