package typings.jsonDashRpcDashWs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonDashRpcDashWsMod {
  type Handler[TConnection /* <: Connection */, ParamType, ParamCallbackType] = js.ThisFunction2[
    /* this */ TConnection, 
    /* params */ ParamType, 
    /* reply */ ReplyCallback[ParamCallbackType], 
    Unit
  ]
  type ReplyCallback[ParamType] = js.Function2[/* error */ js.Any, /* params */ js.UndefOr[ParamType], Unit]
}
