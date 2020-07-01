package typings.jsCaptcha.mod

import typings.jsCaptcha.anon.FillStyle
import typings.jsCaptcha.jsCaptchaStrings.error
import typings.jsCaptcha.jsCaptchaStrings.success
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the base jCaptcha class. Derived from https://github.com/robiveli/js-captcha#options
  */
trait Options extends js.Object {
  var callback: js.UndefOr[
    js.Function3[
      /* response */ success | error, 
      /* captcha */ Element, 
      /* numberOfTries */ Double, 
      Unit
    ]
  ] = js.undefined
  var canvasClass: js.UndefOr[String] = js.undefined
  var canvasStyle: FillStyle
  var clearOnSubmit: js.UndefOr[Boolean] = js.undefined
  var el: js.UndefOr[String] = js.undefined
  var focusOnError: js.UndefOr[Boolean] = js.undefined
  var requiredValue: js.UndefOr[String] = js.undefined
  var resetOnError: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    canvasStyle: FillStyle,
    callback: (/* response */ success | error, /* captcha */ Element, /* numberOfTries */ Double) => Unit = null,
    canvasClass: String = null,
    clearOnSubmit: js.UndefOr[Boolean] = js.undefined,
    el: String = null,
    focusOnError: js.UndefOr[Boolean] = js.undefined,
    requiredValue: String = null,
    resetOnError: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(canvasStyle = canvasStyle.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3(callback))
    if (canvasClass != null) __obj.updateDynamic("canvasClass")(canvasClass.asInstanceOf[js.Any])
    if (!js.isUndefined(clearOnSubmit)) __obj.updateDynamic("clearOnSubmit")(clearOnSubmit.get.asInstanceOf[js.Any])
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnError)) __obj.updateDynamic("focusOnError")(focusOnError.get.asInstanceOf[js.Any])
    if (requiredValue != null) __obj.updateDynamic("requiredValue")(requiredValue.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnError)) __obj.updateDynamic("resetOnError")(resetOnError.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

