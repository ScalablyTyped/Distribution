package typings.i18nextDashExpressDashMiddleware.i18nextDashExpressDashMiddlewareMod

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i18next-express-middleware", "LanguageDetector")
@js.native
class LanguageDetector () extends js.Object {
  def this(options: LanguageDetectorOptions) = this()
  def this(services: LanguageDetectorServices) = this()
  def this(options: LanguageDetectorOptions, allOptions: LanguageDetectorAllOptions) = this()
  def this(services: LanguageDetectorServices, options: LanguageDetectorOptions) = this()
  def this(
    services: LanguageDetectorServices,
    options: LanguageDetectorOptions,
    allOptions: LanguageDetectorAllOptions
  ) = this()
  def addDetector(detector: LanguageDetectorInterface): Unit = js.native
  def cacheUserLanguage(req: Request, res: Response, lng: String, caches: LanguageDetectorCaches): Unit = js.native
  def detect(req: Request, res: Response, detectionOrder: LanguageDetectorOrder): Unit = js.native
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

