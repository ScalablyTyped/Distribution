package typings.grecaptcha.ReCaptchaV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameters extends js.Object {
  /**
    * Optional. The badge location for g-recaptcha with size of "invisible".
    *
    * @default "bottomright"
    */
  var badge: js.UndefOr[Badge] = js.undefined
  /**
    * Optional. Your callback function that's executed when the user submits a successful CAPTCHA response.
    * The user's response, g-recaptcha-response, will be the input for your callback function.
    */
  var callback: js.UndefOr[js.Function1[/* response */ String, Unit]] = js.undefined
  /**
    * Optional. Your callback function that's executed when reCAPTCHA encounters an error (usually network connectivity) and cannot continue until connectivity is restored.
    * If you specify this function, you are responsible for informing the user that they should retry.
    */
  // Notice to the reader
  // I need to surround this object with quotes, this will however break intellisense in VS 2013.
  var `error-callback`: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Optional. Your callback function that's executed when the reCAPTCHA response expires and the user needs to solve a new CAPTCHA.
    */
  // Notice to the reader
  // I need to surround this object with quotes, this will however break intellisense in VS 2013.
  var `expired-callback`: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Optional. Invisible reCAPTCHA only. For plugin owners to not interfere with existing reCAPTCHA installations on a page.
    * If true, this reCAPTCHA instance will be part of a separate ID space.
    *
    * @default false
    */
  var isolated: js.UndefOr[Boolean] = js.undefined
  /**
    * Your sitekey.
    */
  var sitekey: js.UndefOr[String] = js.undefined
  /**
    * Optional. The size of the widget.
    * Accepted values: "compact", "normal", "invisible".
    * @default "compact"
    */
  var size: js.UndefOr[Size] = js.undefined
  /**
    * Optional. The tabindex of the widget and challenge.
    * If other elements in your page use tabindex, it should be set to make user navigation easier.
    */
  var tabindex: js.UndefOr[Double] = js.undefined
  /**
    * Optional. The color theme of the widget.
    * Accepted values: "light", "dark"
    * @default "light"
    */
  var theme: js.UndefOr[Theme] = js.undefined
  /**
    * Optional. The type of CAPTCHA to serve.
    * Accepted values: "audio", "image"
    * @default "image"
    */
  var `type`: js.UndefOr[Type] = js.undefined
}

object Parameters {
  @scala.inline
  def apply(
    badge: Badge = null,
    callback: /* response */ String => Unit = null,
    `error-callback`: () => Unit = null,
    `expired-callback`: () => Unit = null,
    isolated: js.UndefOr[Boolean] = js.undefined,
    sitekey: String = null,
    size: Size = null,
    tabindex: js.UndefOr[Double] = js.undefined,
    theme: Theme = null,
    `type`: Type = null
  ): Parameters = {
    val __obj = js.Dynamic.literal()
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (`error-callback` != null) __obj.updateDynamic("error-callback")(js.Any.fromFunction0(`error-callback`))
    if (`expired-callback` != null) __obj.updateDynamic("expired-callback")(js.Any.fromFunction0(`expired-callback`))
    if (!js.isUndefined(isolated)) __obj.updateDynamic("isolated")(isolated.get.asInstanceOf[js.Any])
    if (sitekey != null) __obj.updateDynamic("sitekey")(sitekey.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(tabindex)) __obj.updateDynamic("tabindex")(tabindex.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
}

