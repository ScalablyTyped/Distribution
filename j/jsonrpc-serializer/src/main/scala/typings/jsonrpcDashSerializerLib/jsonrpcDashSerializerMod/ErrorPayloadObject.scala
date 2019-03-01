package typings
package jsonrpcDashSerializerLib.jsonrpcDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorPayloadObject extends PayloadObject {
  @JSName("error")
  var error_ErrorPayloadObject: SerializerError
  @JSName("id")
  var id_ErrorPayloadObject: java.lang.String | scala.Double
}

object ErrorPayloadObject {
  @scala.inline
  def apply(
    error: SerializerError,
    id: java.lang.String | scala.Double,
    method: java.lang.String = null,
    params: js.Any = null,
    result: js.Any = null
  ): ErrorPayloadObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (params != null) __obj.updateDynamic("params")(params)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[ErrorPayloadObject]
  }
}

