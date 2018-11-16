package typings
package i18nextDashExpressDashMiddlewareLib.i18nextDashExpressDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i18next-express-middleware", "LanguageDetector")
@js.native
class LanguageDetector () extends js.Object {
  /**
       * @summary Constructor.
       * @constructor
       * @param {any}     services    The services.
       * @param {Object}  options     The options.
       * @param {Object}  allOptions  The all options.
       */
  def this(services: js.Any) = this()
  /**
       * @summary Constructor.
       * @constructor
       * @param {any}     services    The services.
       * @param {Object}  options     The options.
       * @param {Object}  allOptions  The all options.
       */
  def this(services: js.Any, options: js.Object) = this()
  /**
       * @summary Constructor.
       * @constructor
       * @param {any}     services    The services.
       * @param {Object}  options     The options.
       * @param {Object}  allOptions  The all options.
       */
  def this(services: js.Any, options: js.Object, allOptions: js.Object) = this()
  /**
       * @summary Adds detector.
       * @param {i18nextCustomDetection} detector The detector to add.
       */
  def addDetector(detector: i18nextCustomDetection): scala.Unit = js.native
  // NOTE: add documentation
  def cacheUserLanguage(
    req: expressLib.expressMod.eNs.Request,
    res: expressLib.expressMod.eNs.Response,
    detectionOrder: js.Any
  ): scala.Unit = js.native
  /**
       * @summary Detects the language.
       * @param {Request}         req             The HTTP request.
       * @param {Response}        res             The HTTP response.
       * @param {detectionOrder}  detectionOrder  The detection order.
       */
  def detect(
    req: expressLib.expressMod.eNs.Request,
    res: expressLib.expressMod.eNs.Response,
    detectionOrder: js.Any
  ): scala.Unit = js.native
  /**
       * @summary Initializes class.
       * @param {any}     services    The services.
       * @param {Object}  options     The options.
       * @param {Object}  allOptions  The all options.
       */
  def init(services: js.Any): scala.Unit = js.native
  /**
       * @summary Initializes class.
       * @param {any}     services    The services.
       * @param {Object}  options     The options.
       * @param {Object}  allOptions  The all options.
       */
  def init(services: js.Any, options: js.Object): scala.Unit = js.native
  /**
       * @summary Initializes class.
       * @param {any}     services    The services.
       * @param {Object}  options     The options.
       * @param {Object}  allOptions  The all options.
       */
  def init(services: js.Any, options: js.Object, allOptions: js.Object): scala.Unit = js.native
}

