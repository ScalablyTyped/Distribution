package typings.i18next.i18nextMod

import typings.i18next.i18nextStrings.languageDetector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to detect language in user land.
  * Can be provided as a singleton or as a prototype constructor (preferred for supporting multiple instances of i18next).
  * For singleton set property `type` to `'languageDetector'` For a prototype constructor set static property.
  */
trait LanguageDetectorModule extends Module {
  @JSName("type")
  var type_LanguageDetectorModule: languageDetector
  def cacheUserLanguage(lng: String): Unit
  /** Must return detected language */
  def detect(): js.UndefOr[String]
  def init(services: Services, detectorOptions: js.Object, i18nextOptions: InitOptions): Unit
}

object LanguageDetectorModule {
  @scala.inline
  def apply(
    cacheUserLanguage: String => Unit,
    detect: () => js.UndefOr[String],
    init: (Services, js.Object, InitOptions) => Unit,
    `type`: languageDetector
  ): LanguageDetectorModule = {
    val __obj = js.Dynamic.literal(cacheUserLanguage = js.Any.fromFunction1(cacheUserLanguage), detect = js.Any.fromFunction0(detect), init = js.Any.fromFunction3(init))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LanguageDetectorModule]
  }
}

