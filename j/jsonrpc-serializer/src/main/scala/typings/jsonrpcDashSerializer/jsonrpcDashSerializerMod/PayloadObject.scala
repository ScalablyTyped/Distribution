package typings.jsonrpcDashSerializer.jsonrpcDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayloadObject extends js.Object {
  var error: js.UndefOr[SerializerError] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var result: js.UndefOr[js.Any] = js.undefined
}

object PayloadObject {
  @scala.inline
  def apply(
    error: SerializerError = null,
    id: String | Double = null,
    method: String = null,
    params: js.Any = null,
    result: js.Any = null
  ): PayloadObject = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadObject]
  }
}

