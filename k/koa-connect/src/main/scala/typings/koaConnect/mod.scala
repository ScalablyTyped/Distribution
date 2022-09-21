package typings.koaConnect

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a Koa middleware function that varies its async logic based on if the
    * given middleware function declares at least 3 parameters, i.e. includes
    * the `next` callback function.
    */
  inline def apply(connectMiddleware: ConnectMiddleware): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(connectMiddleware.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  
  @JSImport("koa-connect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type ConnectMiddleware = js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* callback */ js.Function1[/* repeated */ Any, Unit], 
    Unit
  ]
}
