package typings
package jsonrpcDashSerializerLib.jsonrpcDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessPayloadObject extends PayloadObject {
  @JSName("id")
  var id_SuccessPayloadObject: java.lang.String | scala.Double
}

object SuccessPayloadObject {
  @scala.inline
  def apply(
    id: java.lang.String | scala.Double,
    result: js.Any,
    error: SerializerError = null,
    method: java.lang.String = null,
    params: js.Any = null
  ): SuccessPayloadObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.updateDynamic("result")(result)
    if (error != null) __obj.updateDynamic("error")(error)
    if (method != null) __obj.updateDynamic("method")(method)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[SuccessPayloadObject]
  }
}

