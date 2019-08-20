package typings.i18next.i18nextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modules extends js.Object {
  var backend: js.UndefOr[BackendModule[js.Object]] = js.undefined
  var external: js.Array[ThirdPartyModule]
  var i18nFormat: js.UndefOr[I18nFormatModule] = js.undefined
  var languageDetector: js.UndefOr[LanguageDetectorModule | LanguageDetectorAsyncModule] = js.undefined
  var logger: js.UndefOr[LoggerModule] = js.undefined
}

object Modules {
  @scala.inline
  def apply(
    external: js.Array[ThirdPartyModule],
    backend: BackendModule[js.Object] = null,
    i18nFormat: I18nFormatModule = null,
    languageDetector: LanguageDetectorModule | LanguageDetectorAsyncModule = null,
    logger: LoggerModule = null
  ): Modules = {
    val __obj = js.Dynamic.literal(external = external)
    if (backend != null) __obj.updateDynamic("backend")(backend)
    if (i18nFormat != null) __obj.updateDynamic("i18nFormat")(i18nFormat)
    if (languageDetector != null) __obj.updateDynamic("languageDetector")(languageDetector.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger)
    __obj.asInstanceOf[Modules]
  }
}

