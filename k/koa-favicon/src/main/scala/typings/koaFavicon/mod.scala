package typings.koaFavicon

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaFavicon.anon.Maxage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a middleware serving the favicon found on the given path.
    */
  @JSImport("koa-favicon", JSImport.Namespace)
  @js.native
  def apply(path: String): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-favicon", JSImport.Namespace)
  @js.native
  def apply(path: String, options: Maxage): Middleware[DefaultState, DefaultContext] = js.native
}
