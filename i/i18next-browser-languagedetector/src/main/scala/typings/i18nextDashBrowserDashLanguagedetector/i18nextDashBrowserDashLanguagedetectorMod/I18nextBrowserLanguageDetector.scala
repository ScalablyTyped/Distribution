package typings.i18nextDashBrowserDashLanguagedetector.i18nextDashBrowserDashLanguagedetectorMod

import org.scalablytyped.runtime.StringDictionary
import typings.i18next.i18nextMod.LanguageDetectorModule
import typings.i18nextDashBrowserDashLanguagedetector.i18nextDashBrowserDashLanguagedetectorStrings.cookie
import typings.i18nextDashBrowserDashLanguagedetector.i18nextDashBrowserDashLanguagedetectorStrings.htmlTag
import typings.i18nextDashBrowserDashLanguagedetector.i18nextDashBrowserDashLanguagedetectorStrings.languageDetector
import typings.i18nextDashBrowserDashLanguagedetector.i18nextDashBrowserDashLanguagedetectorStrings.localStorage
import typings.i18nextDashBrowserDashLanguagedetector.i18nextDashBrowserDashLanguagedetectorStrings.navigator
import typings.i18nextDashBrowserDashLanguagedetector.i18nextDashBrowserDashLanguagedetectorStrings.querystring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I18nextBrowserLanguageDetector extends LanguageDetectorModule {
  var detectors: StringDictionary[js.Any] = js.native
  var i18nOptions: js.Any = js.native
  var services: js.Any = js.native
  @JSName("type")
  var type_I18nextBrowserLanguageDetector: languageDetector = js.native
  /**
    * Adds detector.
    */
  def addDetector(detector: CustomDetector): I18nextBrowserLanguageDetector = js.native
  def cacheUserLanguage(lng: String, caches: js.Array[String]): Unit = js.native
  def detect(detectionOrder: js.Array[querystring | cookie | localStorage | navigator | htmlTag | String]): js.UndefOr[String] = js.native
  /**
    * Initializes detector.
    */
  def init(): Unit = js.native
  def init(services: js.Any): Unit = js.native
  def init(services: js.Any, options: DetectorOptions): Unit = js.native
}

