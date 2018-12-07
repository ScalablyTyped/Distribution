package typings
package jsonDashServerLib.jsonDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MiddlewaresOptions extends js.Object {
  /**
       * Enable body-parser middleware
       * @default true
       */
  var bodyParser: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Enable logger middleware
       * @default true
       */
  var logger: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Disable CORS
       * @default false
       */
  var noCors: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Accept only GET requests
       * @default false
       */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Path to static files
       * @default "public" (if folder exists)
       */
  var static: js.UndefOr[java.lang.String] = js.undefined
}

