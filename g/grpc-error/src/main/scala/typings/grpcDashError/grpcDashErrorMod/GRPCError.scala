package typings.grpcDashError.grpcDashErrorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GRPCError extends Error {
  var code: Double
  var metadata: js.Object
}

object GRPCError {
  @scala.inline
  def apply(code: Double, message: String, metadata: js.Object, name: String, stack: String = null): GRPCError = {
    val __obj = js.Dynamic.literal(code = code, message = message, metadata = metadata, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[GRPCError]
  }
}

