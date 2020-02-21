package typings.koaEjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("Koa", JSImport.Namespace)
@js.native
object koaAugmentingMod extends js.Object {
  @js.native
  trait ExtendableContext extends js.Object {
    def render(template: String): js.Promise[String] = js.native
    def render(template: String, properties: StringDictionary[String]): js.Promise[String] = js.native
  }
  
}

