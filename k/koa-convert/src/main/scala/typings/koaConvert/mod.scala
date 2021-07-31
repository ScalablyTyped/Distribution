package typings.koaConvert

import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koa.mod.Next
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(mw: js.Function2[/* context */ Context, /* next */ Next, Generator[js.Any, js.Any, js.Any]]): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply(mw.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  @JSImport("koa-convert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
