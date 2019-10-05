package typings.jqueryDotNotifybar.JQueryNotifyBar

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyBarOptionsForAnimationSpeedNumber extends NotifyBarOptions {
  /**
    * How long this bar will be slided up and down.
    */
  @JSName("animationSpeed")
  var animationSpeed_NotifyBarOptionsForAnimationSpeedNumber: js.UndefOr[Double] = js.undefined
}

object NotifyBarOptionsForAnimationSpeedNumber {
  @scala.inline
  def apply(
    animationSpeed: Int | Double = null,
    close: js.UndefOr[Boolean] = js.undefined,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    closeOnOver: js.UndefOr[Boolean] = js.undefined,
    closeText: String = null,
    cssClass: String = null,
    delay: Int | Double = null,
    html: String = null,
    jqObject: JQuery[HTMLElement] = null,
    onBeforeHide: () => _ = null,
    onBeforeShow: () => _ = null,
    onHide: () => _ = null,
    onShow: () => _ = null,
    position: String = null
  ): NotifyBarOptionsForAnimationSpeedNumber = {
    val __obj = js.Dynamic.literal()
    if (animationSpeed != null) __obj.updateDynamic("animationSpeed")(animationSpeed.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[NotifyBarOptionsForAnimationSpeedNumber]
  }
}

