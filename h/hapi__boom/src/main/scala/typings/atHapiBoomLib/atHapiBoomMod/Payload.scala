package typings
package atHapiBoomLib.atHapiBoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payload extends js.Object {
  /**
    * "Every key/value pair will be included ... in the response payload under the attributes key."
    * [see docs](https://github.com/hapijs/boom#boomunauthorizedmessage-scheme-attributes)
    */
  var attributes: js.UndefOr[js.Any] = js.undefined
  /** error - the HTTP status message (e.g. 'Bad Request', 'Internal Server Error') derived from statusCode. */
  var error: java.lang.String
  /** message - the error message derived from error.message. */
  var message: java.lang.String
  /** statusCode - the HTTP status code, derived from error.output.statusCode. */
  var statusCode: scala.Double
}

object Payload {
  @scala.inline
  def apply(
    error: java.lang.String,
    message: java.lang.String,
    statusCode: scala.Double,
    attributes: js.Any = null
  ): Payload = {
    val __obj = js.Dynamic.literal(error = error, message = message, statusCode = statusCode)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    __obj.asInstanceOf[Payload]
  }
}

