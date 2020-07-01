package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.ValueIterateeCustom
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFindLastIndex extends LodashConvertible {
  def apply[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFindLastIndex1x1[T] = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], array: List[T]): Double = js.native
  def apply[T](predicate: __): LodashFindLastIndex1x2[T] = js.native
  def apply[T](predicate: __, array: List[T]): LodashFindLastIndex1x2[T] = js.native
}

