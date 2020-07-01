package typings.hcaptchaReactHcaptcha.mod

import typings.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.compact
import typings.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.dark
import typings.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.invisible
import typings.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.light
import typings.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HCaptchaProps extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var languageOverride: js.UndefOr[String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* event */ String, _]] = js.undefined
  var onExpire: js.UndefOr[js.Function0[_]] = js.undefined
  var onVerify: js.UndefOr[js.Function1[/* token */ String, _]] = js.undefined
  var sitekey: String
  var size: js.UndefOr[normal | compact | invisible] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[light | dark] = js.undefined
}

object HCaptchaProps {
  @scala.inline
  def apply(
    sitekey: String,
    id: String = null,
    languageOverride: String = null,
    onError: /* event */ String => _ = null,
    onExpire: () => _ = null,
    onVerify: /* token */ String => _ = null,
    size: normal | compact | invisible = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    theme: light | dark = null
  ): HCaptchaProps = {
    val __obj = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (languageOverride != null) __obj.updateDynamic("languageOverride")(languageOverride.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onExpire != null) __obj.updateDynamic("onExpire")(js.Any.fromFunction0(onExpire))
    if (onVerify != null) __obj.updateDynamic("onVerify")(js.Any.fromFunction1(onVerify))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[HCaptchaProps]
  }
}

