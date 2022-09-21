package typings.koaMount

import typings.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[StateT, ContextT](app: Middleware[StateT, ContextT, Any]): Middleware[StateT, ContextT, Any] = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Middleware[StateT, ContextT, Any]]
  inline def apply[StateT, ContextT](app: typings.koa.mod.^[StateT, ContextT]): Middleware[StateT, ContextT, Any] = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Middleware[StateT, ContextT, Any]]
  inline def apply[StateT, ContextT](prefix: String, app: Middleware[StateT, ContextT, Any]): Middleware[StateT, ContextT, Any] = (^.asInstanceOf[js.Dynamic].apply(prefix.asInstanceOf[js.Any], app.asInstanceOf[js.Any])).asInstanceOf[Middleware[StateT, ContextT, Any]]
  inline def apply[StateT, ContextT](prefix: String, app: typings.koa.mod.^[StateT, ContextT]): Middleware[StateT, ContextT, Any] = (^.asInstanceOf[js.Dynamic].apply(prefix.asInstanceOf[js.Any], app.asInstanceOf[js.Any])).asInstanceOf[Middleware[StateT, ContextT, Any]]
  
  @JSImport("koa-mount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
