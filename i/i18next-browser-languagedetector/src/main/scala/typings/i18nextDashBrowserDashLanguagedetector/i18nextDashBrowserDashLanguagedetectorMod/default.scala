package typings.i18nextDashBrowserDashLanguagedetector.i18nextDashBrowserDashLanguagedetectorMod

import typings.i18next.i18nextMod.InitOptions
import typings.i18next.i18nextMod.Services
import typings.i18next.i18nextStrings.`3rdParty`
import typings.i18next.i18nextStrings.backend
import typings.i18next.i18nextStrings.i18nFormat
import typings.i18next.i18nextStrings.languageDetector
import typings.i18next.i18nextStrings.logger
import typings.i18next.i18nextStrings.postProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i18next-browser-languagedetector", JSImport.Default)
@js.native
class default () extends I18nextBrowserLanguageDetector {
  def this(services: js.Any) = this()
  def this(services: js.Any, options: DetectorOptions) = this()
  /* CompleteClass */
  override var `type`: backend | logger | languageDetector | postProcessor | i18nFormat | `3rdParty` = js.native
  /* CompleteClass */
  @JSName("type")
  override var type_LanguageDetectorModule: languageDetector = js.native
  /* CompleteClass */
  override def cacheUserLanguage(lng: String): Unit = js.native
  /** Must return detected language */
  /* CompleteClass */
  override def detect(): js.UndefOr[String] = js.native
  /* CompleteClass */
  override def init(services: Services, detectorOptions: js.Object, i18nextOptions: InitOptions): Unit = js.native
}

