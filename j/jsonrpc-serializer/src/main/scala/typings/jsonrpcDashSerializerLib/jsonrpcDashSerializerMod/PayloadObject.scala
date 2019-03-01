package typings
package jsonrpcDashSerializerLib.jsonrpcDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayloadObject extends js.Object {
  var error: js.UndefOr[SerializerError] = js.undefined
  var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var result: js.UndefOr[js.Any] = js.undefined
}

object PayloadObject {
  @scala.inline
  def apply(
    error: SerializerError = null,
    id: java.lang.String | scala.Double = null,
    method: java.lang.String = null,
    params: js.Any = null,
    result: js.Any = null
  ): PayloadObject = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (params != null) __obj.updateDynamic("params")(params)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[PayloadObject]
  }
}

