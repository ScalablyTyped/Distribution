package typings.i18nAbide.mod

import typings.i18nAbide.anon.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbideOptions extends js.Object {
  var debug_lang: js.UndefOr[String] = js.native
  var default_lang: js.UndefOr[String] = js.native
  var disable_locale_check: js.UndefOr[Boolean] = js.native
  var gettext_alias: js.UndefOr[String] = js.native
  var logger: js.UndefOr[Error] = js.native
  var supported_languages: js.UndefOr[js.Array[String]] = js.native
  var translation_directory: js.UndefOr[String] = js.native
}

object AbideOptions {
  @scala.inline
  def apply(): AbideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbideOptions]
  }
  @scala.inline
  implicit class AbideOptionsOps[Self <: AbideOptions] (val x: Self) extends AnyVal {
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
    def setDebug_lang(value: String): Self = this.set("debug_lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug_lang: Self = this.set("debug_lang", js.undefined)
    @scala.inline
    def setDefault_lang(value: String): Self = this.set("default_lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault_lang: Self = this.set("default_lang", js.undefined)
    @scala.inline
    def setDisable_locale_check(value: Boolean): Self = this.set("disable_locale_check", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisable_locale_check: Self = this.set("disable_locale_check", js.undefined)
    @scala.inline
    def setGettext_alias(value: String): Self = this.set("gettext_alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGettext_alias: Self = this.set("gettext_alias", js.undefined)
    @scala.inline
    def setLogger(value: Error): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setSupported_languagesVarargs(value: String*): Self = this.set("supported_languages", js.Array(value :_*))
    @scala.inline
    def setSupported_languages(value: js.Array[String]): Self = this.set("supported_languages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupported_languages: Self = this.set("supported_languages", js.undefined)
    @scala.inline
    def setTranslation_directory(value: String): Self = this.set("translation_directory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslation_directory: Self = this.set("translation_directory", js.undefined)
  }
  
}

