package typings.koaHbs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("koa", JSImport.Namespace)
@js.native
object koaAugmentingMod extends js.Object {
  @js.native
  trait Context extends js.Object {
    def render(tpl: String): js.Promise[Unit] = js.native
    def render(tpl: String, locals: StringDictionary[js.Any]): js.Promise[Unit] = js.native
  }
  
}

