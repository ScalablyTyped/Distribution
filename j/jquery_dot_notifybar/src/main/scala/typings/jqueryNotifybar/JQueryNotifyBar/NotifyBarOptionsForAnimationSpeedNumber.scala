package typings.jqueryNotifybar.JQueryNotifyBar

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
    animationSpeed: js.UndefOr[Double] = js.undefined,
    close: js.UndefOr[Boolean] = js.undefined,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    closeOnOver: js.UndefOr[Boolean] = js.undefined,
    closeText: String = null,
    cssClass: String = null,
    delay: js.UndefOr[Double] = js.undefined,
    html: String = null,
    jqObject: JQuery[HTMLElement] = null,
    onBeforeHide: () => _ = null,
    onBeforeShow: () => _ = null,
    onHide: () => _ = null,
    onShow: () => _ = null,
    position: String = null
  ): NotifyBarOptionsForAnimationSpeedNumber = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animationSpeed)) __obj.updateDynamic("animationSpeed")(animationSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnOver)) __obj.updateDynamic("closeOnOver")(closeOnOver.get.asInstanceOf[js.Any])
    if (closeText != null) __obj.updateDynamic("closeText")(closeText.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (jqObject != null) __obj.updateDynamic("jqObject")(jqObject.asInstanceOf[js.Any])
    if (onBeforeHide != null) __obj.updateDynamic("onBeforeHide")(js.Any.fromFunction0(onBeforeHide))
    if (onBeforeShow != null) __obj.updateDynamic("onBeforeShow")(js.Any.fromFunction0(onBeforeShow))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyBarOptionsForAnimationSpeedNumber]
  }
}

