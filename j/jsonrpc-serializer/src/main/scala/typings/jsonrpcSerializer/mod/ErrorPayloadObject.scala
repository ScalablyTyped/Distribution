package typings.jsonrpcSerializer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorPayloadObject extends PayloadObject {
  @JSName("error")
  var error_ErrorPayloadObject: SerializerError
  @JSName("id")
  var id_ErrorPayloadObject: String | Double
}

object ErrorPayloadObject {
  @scala.inline
  def apply(
    error: SerializerError,
    id: String | Double,
    method: String = null,
    params: js.Any = null,
    result: js.Any = null
  ): ErrorPayloadObject = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorPayloadObject]
  }
}

