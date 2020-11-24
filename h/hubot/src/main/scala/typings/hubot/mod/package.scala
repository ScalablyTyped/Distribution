package typings.hubot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DoneFunction = js.Function0[scala.Unit]
  
  type ListenerCallback[A /* <: typings.hubot.mod.Adapter */, M /* <: typings.hubot.mod.Message */] = js.Function1[/* response */ typings.hubot.mod.Response[A, M], scala.Unit]
  
  type MiddlewareHandler[T /* <: typings.hubot.mod.Adapter */] = js.Function3[
    /* context */ typings.hubot.mod.MiddlewareContext[T], 
    /* next */ typings.hubot.mod.NextFunction, 
    /* done */ typings.hubot.mod.DoneFunction, 
    scala.Unit
  ]
  
  type NextFunction = js.Function1[/* done */ typings.hubot.mod.DoneFunction, scala.Unit]
}
