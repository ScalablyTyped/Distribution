package typings.i18nextExpressMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageDetectorAllOptions extends js.Object {
  var fallbackLng: Boolean | String | js.Array[String] = js.native
}

object LanguageDetectorAllOptions {
  @scala.inline
  def apply(fallbackLng: Boolean | String | js.Array[String]): LanguageDetectorAllOptions = {
    val __obj = js.Dynamic.literal(fallbackLng = fallbackLng.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageDetectorAllOptions]
  }
  @scala.inline
  implicit class LanguageDetectorAllOptionsOps[Self <: LanguageDetectorAllOptions] (val x: Self) extends AnyVal {
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
    def setFallbackLngVarargs(value: String*): Self = this.set("fallbackLng", js.Array(value :_*))
    @scala.inline
    def setFallbackLng(value: Boolean | String | js.Array[String]): Self = this.set("fallbackLng", value.asInstanceOf[js.Any])
  }
  
}

