package typings.lodash.fpMod

import typings.lodash.mod.ValueIterateeCustom
import typings.lodash.mod.ValueIteratorTypeGuard
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFindLastFrom1x4[T] extends js.Object {
  def apply(predicate: ValueIterateeCustom[T, Boolean]): LodashFindLastFrom2x5[T] = js.native
  def apply(predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double): js.UndefOr[T] = js.native
  def apply(predicate: __, fromIndex: Double): LodashFindLastFrom1x6[T] = js.native
  def apply[S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): LodashFindLastFrom1x5[S] = js.native
  def apply[S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: Double): js.UndefOr[S] = js.native
}

