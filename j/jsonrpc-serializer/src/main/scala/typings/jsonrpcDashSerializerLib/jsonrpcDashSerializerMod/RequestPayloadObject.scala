package typings
package jsonrpcDashSerializerLib.jsonrpcDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestPayloadObject extends PayloadObject {
  @JSName("id")
  var id_RequestPayloadObject: java.lang.String
  @JSName("method")
  var method_RequestPayloadObject: java.lang.String
}

object RequestPayloadObject {
  @scala.inline
  def apply(
    id: java.lang.String,
    method: java.lang.String,
    params: js.Any,
    error: SerializerError = null,
    result: js.Any = null
  ): RequestPayloadObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("params")(params)
    if (error != null) __obj.updateDynamic("error")(error)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[RequestPayloadObject]
  }
}

