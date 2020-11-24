package typings.jsonRpcWs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Handler[TConnection /* <: typings.jsonRpcWs.mod.Connection */, ParamType, ParamCallbackType] = js.ThisFunction2[
    /* this */ TConnection, 
    /* params */ ParamType, 
    /* reply */ typings.jsonRpcWs.mod.ReplyCallback[ParamCallbackType], 
    scala.Unit
  ]
  
  type ReplyCallback[ParamType] = js.Function2[/* error */ js.Any, /* params */ js.UndefOr[ParamType], scala.Unit]
}
