package typings.i18nAbide.mod

import typings.i18nAbide.AnonError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbideOptions extends js.Object {
  var debug_lang: js.UndefOr[String] = js.undefined
  var default_lang: js.UndefOr[String] = js.undefined
  var disable_locale_check: js.UndefOr[Boolean] = js.undefined
  var gettext_alias: js.UndefOr[String] = js.undefined
  var logger: js.UndefOr[AnonError] = js.undefined
  var supported_languages: js.UndefOr[js.Array[String]] = js.undefined
  var translation_directory: js.UndefOr[String] = js.undefined
}

object AbideOptions {
  @scala.inline
  def apply(
    debug_lang: String = null,
    default_lang: String = null,
    disable_locale_check: js.UndefOr[Boolean] = js.undefined,
    gettext_alias: String = null,
    logger: AnonError = null,
    supported_languages: js.Array[String] = null,
    translation_directory: String = null
  ): AbideOptions = {
    val __obj = js.Dynamic.literal()
    if (debug_lang != null) __obj.updateDynamic("debug_lang")(debug_lang.asInstanceOf[js.Any])
    if (default_lang != null) __obj.updateDynamic("default_lang")(default_lang.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_locale_check)) __obj.updateDynamic("disable_locale_check")(disable_locale_check.asInstanceOf[js.Any])
    if (gettext_alias != null) __obj.updateDynamic("gettext_alias")(gettext_alias.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (supported_languages != null) __obj.updateDynamic("supported_languages")(supported_languages.asInstanceOf[js.Any])
    if (translation_directory != null) __obj.updateDynamic("translation_directory")(translation_directory.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbideOptions]
  }
}

