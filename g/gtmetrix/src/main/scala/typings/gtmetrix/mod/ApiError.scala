package typings.gtmetrix.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * API returned an error
  */
trait ApiError
  extends Error
     with _MetricsError {
  val contentType: String
  val statusCode: Double
}

object ApiError {
  @scala.inline
  def apply(contentType: String, message: String, name: String, statusCode: Double, stack: String = null): ApiError = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiError]
  }
}

