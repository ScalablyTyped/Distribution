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

