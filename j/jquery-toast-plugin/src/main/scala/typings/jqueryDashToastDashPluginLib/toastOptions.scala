package typings
package jqueryDashToastDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait toastOptions extends js.Object {
  var afterHidden: js.UndefOr[js.Function0[_]] = js.undefined
  var afterShown: js.UndefOr[js.Function0[_]] = js.undefined
  var allowToastClose: js.UndefOr[scala.Boolean] = js.undefined
  var beforeHide: js.UndefOr[js.Function0[_]] = js.undefined
  var beforeShow: js.UndefOr[js.Function0[_]] = js.undefined
  var bgColor: js.UndefOr[java.lang.String] = js.undefined
  var heading: js.UndefOr[java.lang.String] = js.undefined
  var hideAfter: js.UndefOr[
    scala.Double | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibNumbers.`false`
  ] = js.undefined
  var icon: js.UndefOr[
    jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.info | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.warning | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.error | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.success
  ] = js.undefined
  var loader: js.UndefOr[scala.Boolean] = js.undefined
  var loaderBg: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[
    jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.`bottom-left` | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.`bottom-right` | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.`bottom-center` | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.`top-right` | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.`top-left` | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.`top-center` | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.`mid-center` | CustomPosition
  ] = js.undefined
  var showHideTransition: js.UndefOr[
    jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.fade | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.slide | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.plain
  ] = js.undefined
  var stack: js.UndefOr[
    scala.Double | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibNumbers.`false`
  ] = js.undefined
  var text: java.lang.String
  var textAlign: js.UndefOr[
    jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.left | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.right | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.center
  ] = js.undefined
  var textColor: js.UndefOr[java.lang.String] = js.undefined
}

object toastOptions {
  @scala.inline
  def apply(
    text: java.lang.String,
    afterHidden: js.Function0[_] = null,
    afterShown: js.Function0[_] = null,
    allowToastClose: js.UndefOr[scala.Boolean] = js.undefined,
    beforeHide: js.Function0[_] = null,
    beforeShow: js.Function0[_] = null,
    bgColor: java.lang.String = null,
    heading: java.lang.String = null,
    hideAfter: scala.Double | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibNumbers.`false` = null,
    icon: jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.info | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.warning | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.error | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.success = null,
    loader: js.UndefOr[scala.Boolean] = js.undefined,
    loaderBg: java.lang.String = null,
    position: jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.`bottom-left` | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.`bottom-right` | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.`bottom-center` | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.`top-right` | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.`top-left` | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.`top-center` | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.`mid-center` | CustomPosition = null,
    showHideTransition: jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.fade | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.slide | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.plain = null,
    stack: scala.Double | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibNumbers.`false` = null,
    textAlign: jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.left | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.right | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.center = null,
    textColor: java.lang.String = null
  ): toastOptions = {
    val __obj = js.Dynamic.literal(text = text)
    if (afterHidden != null) __obj.updateDynamic("afterHidden")(afterHidden)
    if (afterShown != null) __obj.updateDynamic("afterShown")(afterShown)
    if (!js.isUndefined(allowToastClose)) __obj.updateDynamic("allowToastClose")(allowToastClose)
    if (beforeHide != null) __obj.updateDynamic("beforeHide")(beforeHide)
    if (beforeShow != null) __obj.updateDynamic("beforeShow")(beforeShow)
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor)
    if (heading != null) __obj.updateDynamic("heading")(heading)
    if (hideAfter != null) __obj.updateDynamic("hideAfter")(hideAfter.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(loader)) __obj.updateDynamic("loader")(loader)
    if (loaderBg != null) __obj.updateDynamic("loaderBg")(loaderBg)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (showHideTransition != null) __obj.updateDynamic("showHideTransition")(showHideTransition.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[toastOptions]
  }
}

