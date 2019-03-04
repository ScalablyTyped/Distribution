package typings
package grpcDashErrorLib.grpcDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GRPCError
  extends stdLib.Error {
  var code: scala.Double
  var metadata: js.Object
}

object GRPCError {
  @scala.inline
  def apply(
    code: scala.Double,
    message: java.lang.String,
    metadata: js.Object,
    name: java.lang.String,
    stack: java.lang.String = null
  ): GRPCError = {
    val __obj = js.Dynamic.literal(code = code, message = message, metadata = metadata, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[GRPCError]
  }
}

