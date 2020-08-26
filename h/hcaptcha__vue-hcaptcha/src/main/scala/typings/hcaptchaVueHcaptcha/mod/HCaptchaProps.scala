package typings.hcaptchaVueHcaptcha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HCaptchaProps extends js.Object {
  var sitekey: String = js.native
  var size: js.UndefOr[String] = js.native
  var tabindex: js.UndefOr[String] = js.native
  var theme: js.UndefOr[String] = js.native
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
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTabindex(value: String): Self = this.set("tabindex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabindex: Self = this.set("tabindex", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

