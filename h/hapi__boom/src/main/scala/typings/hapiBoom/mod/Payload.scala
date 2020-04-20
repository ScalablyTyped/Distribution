package typings.hapiBoom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payload extends js.Object {
  /**
    * The HTTP status message derived from statusCode
    */
  var error: String
  /**
    The error message derived from error.message
    */
  var message: String
  /**
    * The HTTP status code derived from error.output.statusCode
    */
  var statusCode: Double
}

object Payload {
  @scala.inline
  def apply(error: String, message: String, statusCode: Double): Payload = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
}

