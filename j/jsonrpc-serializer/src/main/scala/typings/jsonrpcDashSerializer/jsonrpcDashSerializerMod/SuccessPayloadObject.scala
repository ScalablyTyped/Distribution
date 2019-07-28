package typings.jsonrpcDashSerializer.jsonrpcDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessPayloadObject extends PayloadObject {
  @JSName("id")
  var id_SuccessPayloadObject: String | Double
}

object SuccessPayloadObject {
  @scala.inline
  def apply(
    id: String | Double,
    result: js.Any,
    error: SerializerError = null,
    method: String = null,
    params: js.Any = null
  ): SuccessPayloadObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], result = result)
    if (error != null) __obj.updateDynamic("error")(error)
    if (method != null) __obj.updateDynamic("method")(method)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[SuccessPayloadObject]
  }
}

