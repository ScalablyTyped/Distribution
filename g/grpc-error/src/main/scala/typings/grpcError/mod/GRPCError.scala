package typings.grpcError.mod

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
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[GRPCError]
  }
}

