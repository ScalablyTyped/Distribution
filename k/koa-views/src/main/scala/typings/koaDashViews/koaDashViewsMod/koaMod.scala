package typings.koaDashViews.koaDashViewsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("koa", JSImport.Namespace)
@js.native
object koaMod extends js.Object {
  @js.native
  trait Context extends js.Object {
    def render(viewPath: String): js.Promise[Unit] = js.native
    def render(viewPath: String, locals: js.Any): js.Promise[Unit] = js.native
  }
  
}

