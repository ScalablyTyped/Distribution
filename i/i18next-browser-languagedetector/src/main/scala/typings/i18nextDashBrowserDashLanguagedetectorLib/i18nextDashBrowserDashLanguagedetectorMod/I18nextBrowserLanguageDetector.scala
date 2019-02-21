package typings
package i18nextDashBrowserDashLanguagedetectorLib.i18nextDashBrowserDashLanguagedetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I18nextBrowserLanguageDetector extends js.Object {
  var detectors: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var i18nOptions: js.Any = js.native
  var services: js.Any = js.native
  var `type`: i18nextDashBrowserDashLanguagedetectorLib.i18nextDashBrowserDashLanguagedetectorLibStrings.languageDetector = js.native
  /**
    * Adds detector.
    */
  def addDetector(
    detector: i18nextDashBrowserDashLanguagedetectorLib.i18nextDashBrowserDashLanguagedetectorMod.I18nextBrowserLanguageDetectorNs.CustomDetector
  ): I18nextBrowserLanguageDetector = js.native
  def cacheUserLanguage(lng: java.lang.String): scala.Unit = js.native
  def cacheUserLanguage(lng: java.lang.String, caches: js.Array[java.lang.String]): scala.Unit = js.native
  def detect(): js.UndefOr[java.lang.String] = js.native
  def detect(
    detectionOrder: i18nextDashBrowserDashLanguagedetectorLib.i18nextDashBrowserDashLanguagedetectorMod.I18nextBrowserLanguageDetectorNs.DetectorOptions
  ): js.UndefOr[java.lang.String] = js.native
  /**
    * Initializes detector.
    */
  def init(): scala.Unit = js.native
  def init(services: js.Any): scala.Unit = js.native
  def init(
    services: js.Any,
    options: i18nextDashBrowserDashLanguagedetectorLib.i18nextDashBrowserDashLanguagedetectorMod.I18nextBrowserLanguageDetectorNs.DetectorOptions
  ): scala.Unit = js.native
}

