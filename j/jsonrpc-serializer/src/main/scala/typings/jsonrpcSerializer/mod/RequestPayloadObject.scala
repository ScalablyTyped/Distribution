package typings.jsonrpcSerializer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestPayloadObject extends PayloadObject {
  @JSName("id")
  var id_RequestPayloadObject: String
  @JSName("method")
  var method_RequestPayloadObject: String
}

object RequestPayloadObject {
  @scala.inline
  def apply(
    id: String,
    method: String,
    error: SerializerError = null,
    params: js.Any = null,
    result: js.Any = null
  ): RequestPayloadObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPayloadObject]
  }
}

