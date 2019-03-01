package typings
package jqueryDotNotifybarLib.JQueryNotifyBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyBarOptions extends js.Object {
  /**
    * How long this bar will be slided up and down.
    *
    * Default: "normal"
    */
  var animationSpeed: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * If set to true close button will be displayed.
    */
  var close: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If enabled, user can hide notify bar just by click on it.
    */
  var closeOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If enabled, user can hide notify bar just by moving mouse cursor on it.
    */
  var closeOnOver: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets the text to close button.
    */
  var closeText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * You can define own CSS class for Notify bar. There are too premade classes "error", "warning" and "success".
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * How long bar will be delayed, doesn't count animation time.
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * What text will be inside bar. Can be HTML or just text.
    */
  var html: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom jQuery object for notify bar.
    */
  var jqObject: js.UndefOr[jqueryLib.JQuery[stdLib.HTMLElement]] = js.undefined
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
  var position: js.UndefOr[java.lang.String] = js.undefined
}

object NotifyBarOptions {
  @scala.inline
  def apply(
    animationSpeed: java.lang.String | scala.Double = null,
    close: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnOver: js.UndefOr[scala.Boolean] = js.undefined,
    closeText: java.lang.String = null,
    cssClass: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    html: java.lang.String = null,
    jqObject: jqueryLib.JQuery[stdLib.HTMLElement] = null,
    onBeforeHide: js.Function0[_] = null,
    onBeforeShow: js.Function0[_] = null,
    onHide: js.Function0[_] = null,
    onShow: js.Function0[_] = null,
    position: java.lang.String = null
  ): NotifyBarOptions = {
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
    if (onBeforeHide != null) __obj.updateDynamic("onBeforeHide")(onBeforeHide)
    if (onBeforeShow != null) __obj.updateDynamic("onBeforeShow")(onBeforeShow)
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[NotifyBarOptions]
  }
}

