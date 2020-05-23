package typings.hcaptchaVueHcaptcha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HCaptchaProps extends js.Object {
  var sitekey: String
  var size: js.UndefOr[String] = js.undefined
  var tabindex: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
}

object HCaptchaProps {
  @scala.inline
  def apply(sitekey: String, size: String = null, tabindex: String = null, theme: String = null): HCaptchaProps = {
    val __obj = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[HCaptchaProps]
  }
}

