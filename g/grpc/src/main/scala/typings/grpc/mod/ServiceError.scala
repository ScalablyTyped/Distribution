package typings.grpc.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceError extends Error {
  /**
    * The error code, a key of {@link grpc.status} that is not `grpc.status.OK`
    */
  var code: js.UndefOr[status] = js.undefined
  /**
    * Original status details string
    */
  var details: js.UndefOr[String] = js.undefined
  /**
    * Trailing metadata sent with the status, if applicable
    */
  var metadata: js.UndefOr[Metadata] = js.undefined
}

object ServiceError {
  @scala.inline
  def apply(
    message: String,
    name: String,
    code: status = null,
    details: String = null,
    metadata: Metadata = null,
    stack: String = null
  ): ServiceError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceError]
  }
}

