package typings.jsonrpcSerializer.mod

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
    error: SerializerError = null,
    method: String = null,
    params: js.Any = null,
    result: js.Any = null
  ): SuccessPayloadObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessPayloadObject]
  }
}

