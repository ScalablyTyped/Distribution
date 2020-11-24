package typings.koaViews.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("koa", JSImport.Namespace)
@js.native
object koaAugmentingMod extends js.Object {
  
  @js.native
  trait Context extends js.Object {
    
    def render(viewPath: String): js.Promise[Unit] = js.native
    def render(viewPath: String, locals: js.Any): js.Promise[Unit] = js.native
  }
}
