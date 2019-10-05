package typings.ioDashTs.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "recursion")
@js.native
object recursion extends js.Object {
  def apply[A, O, I, C /* <: Type[A, O, I] */](name: String, definition: js.Function1[/* self */ C, C]): RecursiveType[C, A, O, I] = js.native
}

