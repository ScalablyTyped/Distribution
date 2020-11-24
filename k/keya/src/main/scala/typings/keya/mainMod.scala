package typings.keya

import typings.keya.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("keya/out/browser/main", JSImport.Namespace)
@js.native
object mainMod extends js.Object {
  
  def store[T](name: String): js.Promise[default[T] | typings.keya.localhostMod.default[T]] = js.native
  
  def stores(): js.Promise[js.Array[String]] = js.native
}
