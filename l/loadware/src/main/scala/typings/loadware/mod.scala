package typings.loadware

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loadware", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait RecursiveLoadable[F /* <: AnyFunction */] extends Array[F | Loadable[F]]
  
  def apply[F /* <: AnyFunction */](loadable: Loadable[F]*): js.Array[F] = js.native
  type AnyFunction = js.Function
  type Loadable[F /* <: AnyFunction */] = String | F | RecursiveLoadable[F]
}

