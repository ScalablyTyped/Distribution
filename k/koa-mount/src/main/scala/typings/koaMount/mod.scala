package typings.koaMount

import typings.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[StateT, CustomT](app: Middleware[StateT, CustomT]): Middleware[StateT, CustomT] = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Middleware[StateT, CustomT]]
  @scala.inline
  def apply[StateT, CustomT](app: typings.koa.mod.^[StateT, CustomT]): Middleware[StateT, CustomT] = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Middleware[StateT, CustomT]]
  @scala.inline
  def apply[StateT, CustomT](prefix: String, app: Middleware[StateT, CustomT]): Middleware[StateT, CustomT] = (^.asInstanceOf[js.Dynamic].apply(prefix.asInstanceOf[js.Any], app.asInstanceOf[js.Any])).asInstanceOf[Middleware[StateT, CustomT]]
  @scala.inline
  def apply[StateT, CustomT](prefix: String, app: typings.koa.mod.^[StateT, CustomT]): Middleware[StateT, CustomT] = (^.asInstanceOf[js.Dynamic].apply(prefix.asInstanceOf[js.Any], app.asInstanceOf[js.Any])).asInstanceOf[Middleware[StateT, CustomT]]
  
  @JSImport("koa-mount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
