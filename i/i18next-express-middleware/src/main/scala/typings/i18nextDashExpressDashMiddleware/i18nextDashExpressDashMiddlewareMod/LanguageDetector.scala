package typings.i18nextDashExpressDashMiddleware.i18nextDashExpressDashMiddlewareMod

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.i18next.i18nextMod.Module
import typings.i18next.i18nextStrings.`3rdParty`
import typings.i18next.i18nextStrings.backend
import typings.i18next.i18nextStrings.i18nFormat
import typings.i18next.i18nextStrings.languageDetector
import typings.i18next.i18nextStrings.logger
import typings.i18next.i18nextStrings.postProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i18next-express-middleware", "LanguageDetector")
@js.native
class LanguageDetector () extends Module {
  def this(options: LanguageDetectorOptions) = this()
  def this(services: LanguageDetectorServices) = this()
  def this(options: LanguageDetectorOptions, allOptions: LanguageDetectorAllOptions) = this()
  def this(services: LanguageDetectorServices, options: LanguageDetectorOptions) = this()
  def this(
    services: LanguageDetectorServices,
    options: LanguageDetectorOptions,
    allOptions: LanguageDetectorAllOptions
  ) = this()
  /* CompleteClass */
  override var `type`: backend | logger | languageDetector | postProcessor | i18nFormat | `3rdParty` = js.native
  @JSName("type")
  var type_LanguageDetector: typings.i18nextDashExpressDashMiddleware.i18nextDashExpressDashMiddlewareStrings.languageDetector = js.native
  def addDetector(detector: LanguageDetectorInterface): Unit = js.native
  def cacheUserLanguage(req: Request[ParamsDictionary], res: Response, lng: String, caches: LanguageDetectorCaches): Unit = js.native
  def detect(req: Request[ParamsDictionary], res: Response, detectionOrder: LanguageDetectorOrder): Unit = js.native
  def init(): Unit = js.native
  def init(options: LanguageDetectorOptions): Unit = js.native
  def init(options: LanguageDetectorOptions, allOptions: LanguageDetectorAllOptions): Unit = js.native
  def init(services: LanguageDetectorServices): Unit = js.native
  def init(services: LanguageDetectorServices, options: LanguageDetectorOptions): Unit = js.native
  def init(
    services: LanguageDetectorServices,
    options: LanguageDetectorOptions,
    allOptions: LanguageDetectorAllOptions
  ): Unit = js.native
}

