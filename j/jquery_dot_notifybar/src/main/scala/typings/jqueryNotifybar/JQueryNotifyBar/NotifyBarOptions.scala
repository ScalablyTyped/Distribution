package typings.jqueryNotifybar.JQueryNotifyBar

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyBarOptions extends js.Object {
  /**
    * How long this bar will be slided up and down.
    *
    * Default: "normal"
    */
  var animationSpeed: js.UndefOr[String | Double] = js.undefined
  /**
    * If set to true close button will be displayed.
    */
  var close: js.UndefOr[Boolean] = js.undefined
  /**
    * If enabled, user can hide notify bar just by click on it.
    */
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  /**
    * If enabled, user can hide notify bar just by moving mouse cursor on it.
    */
  var closeOnOver: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the text to close button.
    */
  var closeText: js.UndefOr[String] = js.undefined
  /**
    * You can define own CSS class for Notify bar. There are too premade classes "error", "warning" and "success".
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /**
    * How long bar will be delayed, doesn't count animation time.
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * What text will be inside bar. Can be HTML or just text.
    */
  var html: js.UndefOr[String] = js.undefined
  /**
    * Custom jQuery object for notify bar.
    */
  var jqObject: js.UndefOr[JQuery[HTMLElement]] = js.undefined
  /**
    * Callback on before hide.
    */
  var onBeforeHide: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Callback on before show.
    */
  var onBeforeShow: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Callback on hide.
    */
  var onHide: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Callback on show.
    */
  var onShow: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Set the position of notify bar. Possible values are "top", "bottom".
    */
  var position: js.UndefOr[String] = js.undefined
}

object NotifyBarOptions {
  @scala.inline
  def apply(
    animationSpeed: String | Double = null,
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
  ): NotifyBarOptions = {
    val __obj = js.Dynamic.literal()
    if (animationSpeed != null) __obj.updateDynamic("animationSpeed")(animationSpeed.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[NotifyBarOptions]
  }
}

