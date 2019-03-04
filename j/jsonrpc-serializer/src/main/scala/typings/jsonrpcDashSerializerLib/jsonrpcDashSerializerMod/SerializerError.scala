package typings
package jsonrpcDashSerializerLib.jsonrpcDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializerError
  extends stdLib.Error {
  var code: scala.Double
  var data: js.UndefOr[js.Array[_]] = js.undefined
}

object SerializerError {
  @scala.inline
  def apply(
    code: scala.Double,
    message: java.lang.String,
    name: java.lang.String,
    data: js.Array[_] = null,
    stack: java.lang.String = null
  ): SerializerError = {
    val __obj = js.Dynamic.literal(code = code, message = message, name = name)
    if (data != null) __obj.updateDynamic("data")(data)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[SerializerError]
  }
}

