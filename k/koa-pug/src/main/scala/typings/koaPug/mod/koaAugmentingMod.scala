package typings.koaPug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("koa", JSImport.Namespace)
@js.native
object koaAugmentingMod extends js.Object {
  
  @js.native
  trait BaseContext extends js.Object {
    
    def render(tpl: String): js.Promise[Unit] = js.native
    def render(
      tpl: String,
      locals: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      noCache: Boolean
    ): js.Promise[Unit] = js.native
    def render(tpl: String, locals: js.UndefOr[scala.Nothing], options: RenderOptions): js.Promise[Unit] = js.native
    def render(tpl: String, locals: js.UndefOr[scala.Nothing], options: RenderOptions, noCache: Boolean): js.Promise[Unit] = js.native
    def render(tpl: String, locals: js.Any): js.Promise[Unit] = js.native
    def render(tpl: String, locals: js.Any, options: js.UndefOr[scala.Nothing], noCache: Boolean): js.Promise[Unit] = js.native
    def render(tpl: String, locals: js.Any, options: RenderOptions): js.Promise[Unit] = js.native
    def render(tpl: String, locals: js.Any, options: RenderOptions, noCache: Boolean): js.Promise[Unit] = js.native
  }
}
