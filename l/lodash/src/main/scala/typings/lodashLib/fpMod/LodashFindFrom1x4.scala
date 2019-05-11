package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFindFrom1x4[T] extends js.Object {
  def apply(predicate: lodashLib.lodashMod.ValueIterateeCustom[T, scala.Boolean]): LodashFindFrom2x5[T] = js.native
  def apply(predicate: lodashLib.lodashMod.ValueIterateeCustom[T, scala.Boolean], fromIndex: scala.Double): js.UndefOr[T] = js.native
  def apply(predicate: lodashLib.lodashMod.__, fromIndex: scala.Double): LodashFindFrom1x6[T] = js.native
  def apply[S /* <: T */](predicate: lodashLib.lodashMod.ValueIteratorTypeGuard[T, S]): LodashFindFrom1x5[S] = js.native
  def apply[S /* <: T */](predicate: lodashLib.lodashMod.ValueIteratorTypeGuard[T, S], fromIndex: scala.Double): js.UndefOr[S] = js.native
}

