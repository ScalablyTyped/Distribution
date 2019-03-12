package typings
package jqueryDotNotifybarLib.JQueryNotifyBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyBarOptionsForAnimationSpeedString extends NotifyBarOptions {
  /**
    * How long this bar will be slided up and down. Possible values are "slow", "default", "normal", "fast".
    */
  @JSName("animationSpeed")
  var animationSpeed_NotifyBarOptionsForAnimationSpeedString: js.UndefOr[java.lang.String] = js.undefined
}

object NotifyBarOptionsForAnimationSpeedString {
  @scala.inline
  def apply(
    animationSpeed: java.lang.String = null,
    close: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnOver: js.UndefOr[scala.Boolean] = js.undefined,
    closeText: java.lang.String = null,
    cssClass: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    html: java.lang.String = null,
    jqObject: jqueryLib.JQuery[stdLib.HTMLElement] = null,
    onBeforeHide: () => _ = null,
    onBeforeShow: () => _ = null,
    onHide: () => _ = null,
    onShow: () => _ = null,
    position: java.lang.String = null
  ): NotifyBarOptionsForAnimationSpeedString = {
    val __obj = js.Dynamic.literal()
    if (animationSpeed != null) __obj.updateDynamic("animationSpeed")(animationSpeed)
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close)
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (!js.isUndefined(closeOnOver)) __obj.updateDynamic("closeOnOver")(closeOnOver)
    if (closeText != null) __obj.updateDynamic("closeText")(closeText)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html)
    if (jqObject != null) __obj.updateDynamic("jqObject")(jqObject)
    if (onBeforeHide != null) __obj.updateDynamic("onBeforeHide")(js.Any.fromFunction0(onBeforeHide))
    if (onBeforeShow != null) __obj.updateDynamic("onBeforeShow")(js.Any.fromFunction0(onBeforeShow))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[NotifyBarOptionsForAnimationSpeedString]
  }
}

