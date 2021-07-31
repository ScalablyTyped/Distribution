package typings.koaFavicon

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaFavicon.anon.Maxage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a middleware serving the favicon found on the given path.
    */
  @scala.inline
  def apply(path: String): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  @scala.inline
  def apply(path: String, options: Maxage): Middleware[DefaultState, DefaultContext] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  @JSImport("koa-favicon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
