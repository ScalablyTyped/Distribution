package typings
package jsonDashRpcDashWsLib.jsonDashRpcDashWsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payload[ParamType] extends js.Object {
  var error: js.UndefOr[js.Any] = js.undefined
  var id: java.lang.String
  var jsonrpc: js.UndefOr[jsonDashRpcDashWsLib.jsonDashRpcDashWsLibStrings.`2DOT0`] = js.undefined
  var method: java.lang.String
  var params: js.UndefOr[ParamType] = js.undefined
  var result: js.UndefOr[js.Any] = js.undefined
}

object Payload {
  @scala.inline
  def apply[ParamType](
    id: java.lang.String,
    method: java.lang.String,
    error: js.Any = null,
    jsonrpc: jsonDashRpcDashWsLib.jsonDashRpcDashWsLibStrings.`2DOT0` = null,
    params: ParamType = null,
    result: js.Any = null
  ): Payload[ParamType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("method")(method)
    if (error != null) __obj.updateDynamic("error")(error)
    if (jsonrpc != null) __obj.updateDynamic("jsonrpc")(jsonrpc)
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[Payload[ParamType]]
  }
}

