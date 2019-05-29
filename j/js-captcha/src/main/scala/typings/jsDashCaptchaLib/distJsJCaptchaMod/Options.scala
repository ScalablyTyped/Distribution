package typings
package jsDashCaptchaLib.distJsJCaptchaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the base jCaptcha class. Derived from https://github.com/robiveli/js-captcha#options
  */
trait Options extends js.Object {
  var callback: js.UndefOr[
    js.Function2[
      /* response */ jsDashCaptchaLib.jsDashCaptchaLibStrings.success | jsDashCaptchaLib.jsDashCaptchaLibStrings.error, 
      /* input */ stdLib.NodeListOf[stdLib.Element], 
      scala.Unit
    ]
  ] = js.undefined
  var canvasFillStyle: js.UndefOr[java.lang.String] = js.undefined
  var canvasFontFamily: js.UndefOr[java.lang.String] = js.undefined
  var canvasFontSize: js.UndefOr[java.lang.String] = js.undefined
  var canvasHeight: js.UndefOr[scala.Double] = js.undefined
  var canvasWidth: js.UndefOr[scala.Double] = js.undefined
  var clearOnSubmit: js.UndefOr[scala.Boolean] = js.undefined
  var el: js.UndefOr[java.lang.String] = js.undefined
  var focusOnError: js.UndefOr[scala.Boolean] = js.undefined
  var requiredValue: js.UndefOr[java.lang.String] = js.undefined
  var resetOnError: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    callback: (/* response */ jsDashCaptchaLib.jsDashCaptchaLibStrings.success | jsDashCaptchaLib.jsDashCaptchaLibStrings.error, /* input */ stdLib.NodeListOf[stdLib.Element]) => scala.Unit = null,
    canvasFillStyle: java.lang.String = null,
    canvasFontFamily: java.lang.String = null,
    canvasFontSize: java.lang.String = null,
    canvasHeight: scala.Int | scala.Double = null,
    canvasWidth: scala.Int | scala.Double = null,
    clearOnSubmit: js.UndefOr[scala.Boolean] = js.undefined,
    el: java.lang.String = null,
    focusOnError: js.UndefOr[scala.Boolean] = js.undefined,
    requiredValue: java.lang.String = null,
    resetOnError: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (canvasFillStyle != null) __obj.updateDynamic("canvasFillStyle")(canvasFillStyle)
    if (canvasFontFamily != null) __obj.updateDynamic("canvasFontFamily")(canvasFontFamily)
    if (canvasFontSize != null) __obj.updateDynamic("canvasFontSize")(canvasFontSize)
    if (canvasHeight != null) __obj.updateDynamic("canvasHeight")(canvasHeight.asInstanceOf[js.Any])
    if (canvasWidth != null) __obj.updateDynamic("canvasWidth")(canvasWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(clearOnSubmit)) __obj.updateDynamic("clearOnSubmit")(clearOnSubmit)
    if (el != null) __obj.updateDynamic("el")(el)
    if (!js.isUndefined(focusOnError)) __obj.updateDynamic("focusOnError")(focusOnError)
    if (requiredValue != null) __obj.updateDynamic("requiredValue")(requiredValue)
    if (!js.isUndefined(resetOnError)) __obj.updateDynamic("resetOnError")(resetOnError)
    __obj.asInstanceOf[Options]
  }
}

