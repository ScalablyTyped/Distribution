package typings.hcaptchaReactHcaptcha.mod

import typings.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.compact
import typings.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.dark
import typings.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.invisible
import typings.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.light
import typings.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HCaptchaProps extends js.Object {
  var id: js.UndefOr[String] = js.native
  var languageOverride: js.UndefOr[String] = js.native
  var onError: js.UndefOr[js.Function1[/* event */ String, _]] = js.native
  var onExpire: js.UndefOr[js.Function0[_]] = js.native
  var onVerify: js.UndefOr[js.Function1[/* token */ String, _]] = js.native
  var sitekey: String = js.native
  var size: js.UndefOr[normal | compact | invisible] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var theme: js.UndefOr[light | dark] = js.native
}

object HCaptchaProps {
  @scala.inline
  def apply(sitekey: String): HCaptchaProps = {
    val __obj = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HCaptchaProps]
  }
  @scala.inline
  implicit class HCaptchaPropsOps[Self <: HCaptchaProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSitekey(value: String): Self = this.set("sitekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLanguageOverride(value: String): Self = this.set("languageOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageOverride: Self = this.set("languageOverride", js.undefined)
    @scala.inline
    def setOnError(value: /* event */ String => _): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnExpire(value: () => _): Self = this.set("onExpire", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnExpire: Self = this.set("onExpire", js.undefined)
    @scala.inline
    def setOnVerify(value: /* token */ String => _): Self = this.set("onVerify", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVerify: Self = this.set("onVerify", js.undefined)
    @scala.inline
    def setSize(value: normal | compact | invisible): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTheme(value: light | dark): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

