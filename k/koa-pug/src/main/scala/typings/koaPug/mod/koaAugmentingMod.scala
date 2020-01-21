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
    def render(tpl: String): Unit = js.native
    def render(tpl: String, locals: js.Any): Unit = js.native
    def render(tpl: String, locals: js.Any, options: RenderOptions): Unit = js.native
    def render(tpl: String, locals: js.Any, options: RenderOptions, noCache: Boolean): Unit = js.native
  }
  
}

