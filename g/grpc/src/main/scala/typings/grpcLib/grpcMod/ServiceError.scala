package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceError
  extends stdLib.Error {
  /**
    * The error code, a key of {@link grpc.status} that is not `grpc.status.OK`
    */
  var code: js.UndefOr[status] = js.undefined
  /**
    * Original status details string
    */
  var details: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Trailing metadata sent with the status, if applicable
    */
  var metadata: js.UndefOr[Metadata] = js.undefined
}

object ServiceError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: java.lang.String,
    code: status = null,
    details: java.lang.String = null,
    metadata: Metadata = null,
    stack: java.lang.String = null
  ): ServiceError = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (code != null) __obj.updateDynamic("code")(code)
    if (details != null) __obj.updateDynamic("details")(details)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ServiceError]
  }
}

