package typings.i18nextDashExpressDashMiddleware.i18nextDashExpressDashMiddlewareMod

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i18next-express-middleware", "LanguageDetector")
@js.native
/**
  * @summary Constructor.
  * @constructor
  * @param {any}     services    The services.
  * @param {Object}  options     The options.
  * @param {Object}  allOptions  The all options.
  */
class LanguageDetector () extends js.Object {
  def this(services: js.Any) = this()
  def this(services: js.Any, options: js.Object) = this()
  def this(services: js.Any, options: js.Object, allOptions: js.Object) = this()
  /**
    * @summary Adds detector.
    * @param {i18nextCustomDetection} detector The detector to add.
    */
  def addDetector(detector: i18nextCustomDetection): Unit = js.native
  // NOTE: add documentation
  def cacheUserLanguage(req: Request, res: Response, detectionOrder: js.Any): Unit = js.native
  /**
    * @summary Detects the language.
    * @param {Request}         req             The HTTP request.
    * @param {Response}        res             The HTTP response.
    * @param {detectionOrder}  detectionOrder  The detection order.
    */
  def detect(req: Request, res: Response, detectionOrder: js.Any): Unit = js.native
  /**
    * @summary Initializes class.
    * @param {any}     services    The services.
    * @param {Object}  options     The options.
    * @param {Object}  allOptions  The all options.
    */
  def init(services: js.Any): Unit = js.native
  def init(services: js.Any, options: js.Object): Unit = js.native
  def init(services: js.Any, options: js.Object, allOptions: js.Object): Unit = js.native
}

