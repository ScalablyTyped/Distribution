package typings.jqueryToastPlugin

import typings.jqueryToastPlugin.jqueryToastPluginBooleans.`false`
import typings.jqueryToastPlugin.jqueryToastPluginStrings.`bottom-center`
import typings.jqueryToastPlugin.jqueryToastPluginStrings.`bottom-left`
import typings.jqueryToastPlugin.jqueryToastPluginStrings.`bottom-right`
import typings.jqueryToastPlugin.jqueryToastPluginStrings.`mid-center`
import typings.jqueryToastPlugin.jqueryToastPluginStrings.`top-center`
import typings.jqueryToastPlugin.jqueryToastPluginStrings.`top-left`
import typings.jqueryToastPlugin.jqueryToastPluginStrings.`top-right`
import typings.jqueryToastPlugin.jqueryToastPluginStrings.center
import typings.jqueryToastPlugin.jqueryToastPluginStrings.error
import typings.jqueryToastPlugin.jqueryToastPluginStrings.fade
import typings.jqueryToastPlugin.jqueryToastPluginStrings.info
import typings.jqueryToastPlugin.jqueryToastPluginStrings.left
import typings.jqueryToastPlugin.jqueryToastPluginStrings.plain
import typings.jqueryToastPlugin.jqueryToastPluginStrings.right
import typings.jqueryToastPlugin.jqueryToastPluginStrings.slide
import typings.jqueryToastPlugin.jqueryToastPluginStrings.success
import typings.jqueryToastPlugin.jqueryToastPluginStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait toastOptions extends js.Object {
  var afterHidden: js.UndefOr[js.Function0[_]] = js.native
  var afterShown: js.UndefOr[js.Function0[_]] = js.native
  var allowToastClose: js.UndefOr[Boolean] = js.native
  var beforeHide: js.UndefOr[js.Function0[_]] = js.native
  var beforeShow: js.UndefOr[js.Function0[_]] = js.native
  var bgColor: js.UndefOr[String] = js.native
  var heading: js.UndefOr[String] = js.native
  var hideAfter: js.UndefOr[Double | `false`] = js.native
  var icon: js.UndefOr[info | warning | error | success] = js.native
  var loader: js.UndefOr[Boolean] = js.native
  var loaderBg: js.UndefOr[String] = js.native
  var position: js.UndefOr[
    `bottom-left` | `bottom-right` | `bottom-center` | `top-right` | `top-left` | `top-center` | `mid-center` | CustomPosition
  ] = js.native
  var showHideTransition: js.UndefOr[fade | slide | plain] = js.native
  var stack: js.UndefOr[Double | `false`] = js.native
  var text: String = js.native
  var textAlign: js.UndefOr[left | right | center] = js.native
  var textColor: js.UndefOr[String] = js.native
}

object toastOptions {
  @scala.inline
  def apply(text: String): toastOptions = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[toastOptions]
  }
  @scala.inline
  implicit class toastOptionsOps[Self <: toastOptions] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setAfterHidden(value: () => _): Self = this.set("afterHidden", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterHidden: Self = this.set("afterHidden", js.undefined)
    @scala.inline
    def setAfterShown(value: () => _): Self = this.set("afterShown", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterShown: Self = this.set("afterShown", js.undefined)
    @scala.inline
    def setAllowToastClose(value: Boolean): Self = this.set("allowToastClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowToastClose: Self = this.set("allowToastClose", js.undefined)
    @scala.inline
    def setBeforeHide(value: () => _): Self = this.set("beforeHide", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeHide: Self = this.set("beforeHide", js.undefined)
    @scala.inline
    def setBeforeShow(value: () => _): Self = this.set("beforeShow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeShow: Self = this.set("beforeShow", js.undefined)
    @scala.inline
    def setBgColor(value: String): Self = this.set("bgColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgColor: Self = this.set("bgColor", js.undefined)
    @scala.inline
    def setHeading(value: String): Self = this.set("heading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    @scala.inline
    def setHideAfter(value: Double | `false`): Self = this.set("hideAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideAfter: Self = this.set("hideAfter", js.undefined)
    @scala.inline
    def setIcon(value: info | warning | error | success): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLoader(value: Boolean): Self = this.set("loader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoader: Self = this.set("loader", js.undefined)
    @scala.inline
    def setLoaderBg(value: String): Self = this.set("loaderBg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoaderBg: Self = this.set("loaderBg", js.undefined)
    @scala.inline
    def setPosition(
      value: `bottom-left` | `bottom-right` | `bottom-center` | `top-right` | `top-left` | `top-center` | `mid-center` | CustomPosition
    ): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShowHideTransition(value: fade | slide | plain): Self = this.set("showHideTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHideTransition: Self = this.set("showHideTransition", js.undefined)
    @scala.inline
    def setStack(value: Double | `false`): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    @scala.inline
    def setTextAlign(value: left | right | center): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
  }
  
}

