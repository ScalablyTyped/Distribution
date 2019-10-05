package typings.koaDashPug.koaDashPugMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("koa", JSImport.Namespace)
@js.native
object koaMod extends js.Object {
  @js.native
  trait Context extends js.Object {
    def render(viewPath: String): Unit = js.native
    def render(viewPath: String, locals: PugLocals): Unit = js.native
    def render(viewPath: String, locals: PugLocals, overrideOpts: Boolean): Unit = js.native
    def render(viewPath: String, locals: PugLocals, overrideOpts: PugCtxOptions): Unit = js.native
    def render(viewPath: String, locals: PugLocals, overrideOpts: PugCtxOptions, noCache: Boolean): Unit = js.native
  }
  
}

