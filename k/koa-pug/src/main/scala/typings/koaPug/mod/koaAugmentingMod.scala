package typings.koaPug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("koa", JSImport.Namespace)
@js.native
object koaAugmentingMod extends js.Object {
  @js.native
  trait BaseContext extends js.Object {
    def render(tpl: String): js.Promise[Unit] = js.native
    def render(tpl: String, locals: js.Any): js.Promise[Unit] = js.native
    def render(tpl: String, locals: js.Any, options: RenderOptions): js.Promise[Unit] = js.native
    def render(tpl: String, locals: js.Any, options: RenderOptions, noCache: Boolean): js.Promise[Unit] = js.native
  }
  
}

