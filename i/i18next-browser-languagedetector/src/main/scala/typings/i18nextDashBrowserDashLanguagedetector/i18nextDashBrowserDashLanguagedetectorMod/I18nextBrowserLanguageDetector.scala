package typings.i18nextDashBrowserDashLanguagedetector.i18nextDashBrowserDashLanguagedetectorMod

import org.scalablytyped.runtime.StringDictionary
import typings.i18nextDashBrowserDashLanguagedetector.i18nextDashBrowserDashLanguagedetectorMod.I18nextBrowserLanguageDetectorNs.CustomDetector
import typings.i18nextDashBrowserDashLanguagedetector.i18nextDashBrowserDashLanguagedetectorMod.I18nextBrowserLanguageDetectorNs.DetectorOptions
import typings.i18nextDashBrowserDashLanguagedetector.i18nextDashBrowserDashLanguagedetectorStrings.languageDetector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I18nextBrowserLanguageDetector extends js.Object {
  var detectors: StringDictionary[js.Any] = js.native
  var i18nOptions: js.Any = js.native
  var services: js.Any = js.native
  var `type`: languageDetector = js.native
  /**
    * Adds detector.
    */
  def addDetector(detector: CustomDetector): I18nextBrowserLanguageDetector = js.native
  def cacheUserLanguage(lng: String): Unit = js.native
  def cacheUserLanguage(lng: String, caches: js.Array[String]): Unit = js.native
  def detect(): js.UndefOr[String] = js.native
  def detect(detectionOrder: DetectorOptions): js.UndefOr[String] = js.native
  /**
    * Initializes detector.
    */
  def init(): Unit = js.native
  def init(services: js.Any): Unit = js.native
  def init(services: js.Any, options: DetectorOptions): Unit = js.native
}

