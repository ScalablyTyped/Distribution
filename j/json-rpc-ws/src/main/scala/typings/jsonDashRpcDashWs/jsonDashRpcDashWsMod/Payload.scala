package typings.jsonDashRpcDashWs.jsonDashRpcDashWsMod

import typings.jsonDashRpcDashWs.jsonDashRpcDashWsStrings.`2DOT0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payload[ParamType] extends js.Object {
  var error: js.UndefOr[js.Any] = js.undefined
  var id: String
  var jsonrpc: js.UndefOr[`2DOT0`] = js.undefined
  var method: String
  var params: js.UndefOr[ParamType] = js.undefined
  var result: js.UndefOr[js.Any] = js.undefined
}

object Payload {
  @scala.inline
  def apply[ParamType](
    id: String,
    method: String,
    error: js.Any = null,
    jsonrpc: `2DOT0` = null,
    params: ParamType = null,
    result: js.Any = null
  ): Payload[ParamType] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (jsonrpc != null) __obj.updateDynamic("jsonrpc")(jsonrpc.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload[ParamType]]
  }
}

