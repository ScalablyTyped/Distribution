package typings.i18next.mod

import typings.i18next.i18nextBooleans.`true`
import typings.i18next.i18nextStrings.languageDetector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to detect language in user land.
  * Can be provided as a singleton or as a prototype constructor (preferred for supporting multiple instances of i18next).
  * For singleton set property `type` to `'languageDetector'` For a prototype constructor set static property.
  */
trait LanguageDetectorAsyncModule extends Module {
  /** Set to true to enable async detection */
  var async: `true`
  @JSName("type")
  var type_LanguageDetectorAsyncModule: languageDetector
  def cacheUserLanguage(lng: String): Unit
  /** Must call callback passing detected language */
  def detect(callback: js.Function1[/* lng */ String, Unit]): Unit
  def init(services: Services, detectorOptions: js.Object, i18nextOptions: InitOptions): Unit
}

object LanguageDetectorAsyncModule {
  @scala.inline
  def apply(
    async: `true`,
    cacheUserLanguage: String => Unit,
    detect: js.Function1[/* lng */ String, Unit] => Unit,
    init: (Services, js.Object, InitOptions) => Unit,
    `type`: languageDetector
  ): LanguageDetectorAsyncModule = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], cacheUserLanguage = js.Any.fromFunction1(cacheUserLanguage), detect = js.Any.fromFunction1(detect), init = js.Any.fromFunction3(init))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageDetectorAsyncModule]
  }
}

