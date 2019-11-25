package typings.jsonDashServer.jsonDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewaresOptions extends js.Object {
  /**
    * Enable body-parser middleware
    * @default true
    */
  var bodyParser: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable logger middleware
    * @default true
    */
  var logger: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable CORS
    * @default false
    */
  var noCors: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable compression
    * @default false
    */
  var noGzip: js.UndefOr[Boolean] = js.undefined
  /**
    * Accept only GET requests
    * @default false
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Path to static files
    * @default "public" (if folder exists)
    */
  var static: js.UndefOr[String] = js.undefined
}

object MiddlewaresOptions {
  @scala.inline
  def apply(
    bodyParser: js.UndefOr[Boolean] = js.undefined,
    logger: js.UndefOr[Boolean] = js.undefined,
    noCors: js.UndefOr[Boolean] = js.undefined,
    noGzip: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    static: String = null
  ): MiddlewaresOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bodyParser)) __obj.updateDynamic("bodyParser")(bodyParser.asInstanceOf[js.Any])
    if (!js.isUndefined(logger)) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (!js.isUndefined(noCors)) __obj.updateDynamic("noCors")(noCors.asInstanceOf[js.Any])
    if (!js.isUndefined(noGzip)) __obj.updateDynamic("noGzip")(noGzip.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (static != null) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiddlewaresOptions]
  }
}

