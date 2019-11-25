package typings.jqueryDashToastDashPlugin

import typings.jqueryDashToastDashPlugin.jqueryDashToastDashPluginNumbers.`false`
import typings.jqueryDashToastDashPlugin.jqueryDashToastDashPluginStrings.`bottom-center`
import typings.jqueryDashToastDashPlugin.jqueryDashToastDashPluginStrings.`bottom-left`
import typings.jqueryDashToastDashPlugin.jqueryDashToastDashPluginStrings.`bottom-right`
import typings.jqueryDashToastDashPlugin.jqueryDashToastDashPluginStrings.`mid-center`
import typings.jqueryDashToastDashPlugin.jqueryDashToastDashPluginStrings.`top-center`
import typings.jqueryDashToastDashPlugin.jqueryDashToastDashPluginStrings.`top-left`
import typings.jqueryDashToastDashPlugin.jqueryDashToastDashPluginStrings.`top-right`
import typings.jqueryDashToastDashPlugin.jqueryDashToastDashPluginStrings.center
import typings.jqueryDashToastDashPlugin.jqueryDashToastDashPluginStrings.error
import typings.jqueryDashToastDashPlugin.jqueryDashToastDashPluginStrings.fade
import typings.jqueryDashToastDashPlugin.jqueryDashToastDashPluginStrings.info
import typings.jqueryDashToastDashPlugin.jqueryDashToastDashPluginStrings.left
import typings.jqueryDashToastDashPlugin.jqueryDashToastDashPluginStrings.plain
import typings.jqueryDashToastDashPlugin.jqueryDashToastDashPluginStrings.right
import typings.jqueryDashToastDashPlugin.jqueryDashToastDashPluginStrings.slide
import typings.jqueryDashToastDashPlugin.jqueryDashToastDashPluginStrings.success
import typings.jqueryDashToastDashPlugin.jqueryDashToastDashPluginStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait toastOptions extends js.Object {
  var afterHidden: js.UndefOr[js.Function0[_]] = js.undefined
  var afterShown: js.UndefOr[js.Function0[_]] = js.undefined
  var allowToastClose: js.UndefOr[Boolean] = js.undefined
  var beforeHide: js.UndefOr[js.Function0[_]] = js.undefined
  var beforeShow: js.UndefOr[js.Function0[_]] = js.undefined
  var bgColor: js.UndefOr[String] = js.undefined
  var heading: js.UndefOr[String] = js.undefined
  var hideAfter: js.UndefOr[Double | `false`] = js.undefined
  var icon: js.UndefOr[info | warning | error | success] = js.undefined
  var loader: js.UndefOr[Boolean] = js.undefined
  var loaderBg: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[
    `bottom-left` | `bottom-right` | `bottom-center` | `top-right` | `top-left` | `top-center` | `mid-center` | CustomPosition
  ] = js.undefined
  var showHideTransition: js.UndefOr[fade | slide | plain] = js.undefined
  var stack: js.UndefOr[Double | `false`] = js.undefined
  var text: String
  var textAlign: js.UndefOr[left | right | center] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object toastOptions {
  @scala.inline
  def apply(
    text: String,
    afterHidden: () => _ = null,
    afterShown: () => _ = null,
    allowToastClose: js.UndefOr[Boolean] = js.undefined,
    beforeHide: () => _ = null,
    beforeShow: () => _ = null,
    bgColor: String = null,
    heading: String = null,
    hideAfter: Double | `false` = null,
    icon: info | warning | error | success = null,
    loader: js.UndefOr[Boolean] = js.undefined,
    loaderBg: String = null,
    position: `bottom-left` | `bottom-right` | `bottom-center` | `top-right` | `top-left` | `top-center` | `mid-center` | CustomPosition = null,
    showHideTransition: fade | slide | plain = null,
    stack: Double | `false` = null,
    textAlign: left | right | center = null,
    textColor: String = null
  ): toastOptions = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (afterHidden != null) __obj.updateDynamic("afterHidden")(js.Any.fromFunction0(afterHidden))
    if (afterShown != null) __obj.updateDynamic("afterShown")(js.Any.fromFunction0(afterShown))
    if (!js.isUndefined(allowToastClose)) __obj.updateDynamic("allowToastClose")(allowToastClose.asInstanceOf[js.Any])
    if (beforeHide != null) __obj.updateDynamic("beforeHide")(js.Any.fromFunction0(beforeHide))
    if (beforeShow != null) __obj.updateDynamic("beforeShow")(js.Any.fromFunction0(beforeShow))
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (hideAfter != null) __obj.updateDynamic("hideAfter")(hideAfter.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(loader)) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (loaderBg != null) __obj.updateDynamic("loaderBg")(loaderBg.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (showHideTransition != null) __obj.updateDynamic("showHideTransition")(showHideTransition.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[toastOptions]
  }
}

