package typings.koaViews

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaViews.anon.AutoRender
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(dir: String): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  @scala.inline
  def apply(dir: String, opts: AutoRender): Middleware[DefaultState, DefaultContext] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  @JSImport("koa-views", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object koaAugmentingMod {
    
    @js.native
    trait Context extends StObject {
      
      def render(viewPath: String): js.Promise[Unit] = js.native
      def render(viewPath: String, locals: js.Any): js.Promise[Unit] = js.native
    }
  }
}
