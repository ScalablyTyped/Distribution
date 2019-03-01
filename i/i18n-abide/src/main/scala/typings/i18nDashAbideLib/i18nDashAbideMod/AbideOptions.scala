package typings
package i18nDashAbideLib.i18nDashAbideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbideOptions extends js.Object {
  var debug_lang: js.UndefOr[java.lang.String] = js.undefined
  var default_lang: js.UndefOr[java.lang.String] = js.undefined
  var disable_locale_check: js.UndefOr[scala.Boolean] = js.undefined
  var gettext_alias: js.UndefOr[java.lang.String] = js.undefined
  var logger: js.UndefOr[i18nDashAbideLib.Anon_Error] = js.undefined
  var supported_languages: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var translation_directory: js.UndefOr[java.lang.String] = js.undefined
}

object AbideOptions {
  @scala.inline
  def apply(
    debug_lang: java.lang.String = null,
    default_lang: java.lang.String = null,
    disable_locale_check: js.UndefOr[scala.Boolean] = js.undefined,
    gettext_alias: java.lang.String = null,
    logger: i18nDashAbideLib.Anon_Error = null,
    supported_languages: js.Array[java.lang.String] = null,
    translation_directory: java.lang.String = null
  ): AbideOptions = {
    val __obj = js.Dynamic.literal()
    if (debug_lang != null) __obj.updateDynamic("debug_lang")(debug_lang)
    if (default_lang != null) __obj.updateDynamic("default_lang")(default_lang)
    if (!js.isUndefined(disable_locale_check)) __obj.updateDynamic("disable_locale_check")(disable_locale_check)
    if (gettext_alias != null) __obj.updateDynamic("gettext_alias")(gettext_alias)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (supported_languages != null) __obj.updateDynamic("supported_languages")(supported_languages)
    if (translation_directory != null) __obj.updateDynamic("translation_directory")(translation_directory)
    __obj.asInstanceOf[AbideOptions]
  }
}

