package typings.loadware.loadwareMod

import typings.loadware.AnyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loadware", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[F /* <: AnyFunction */](loadable: Loadable[F]*): js.Array[F] = js.native
}

