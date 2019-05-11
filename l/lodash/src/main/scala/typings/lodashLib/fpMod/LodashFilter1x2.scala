package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFilter1x2[T] extends js.Object {
  def apply(predicate: lodashLib.lodashMod.ValueIterateeCustom[T, scala.Boolean]): js.Array[T] = js.native
  def apply[S /* <: T */](predicate: lodashLib.lodashMod.ValueIteratorTypeGuard[T, S]): js.Array[S] = js.native
}

