package typings.jsonrpcDashSerializer.jsonrpcDashSerializerMod

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
  def apply(id: String, method: String, params: js.Any, error: SerializerError = null, result: js.Any = null): RequestPayloadObject = {
    val __obj = js.Dynamic.literal(id = id, method = method, params = params)
    if (error != null) __obj.updateDynamic("error")(error)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[RequestPayloadObject]
  }
}

