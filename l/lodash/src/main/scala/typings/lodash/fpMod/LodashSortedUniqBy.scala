package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.ValueIteratee
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashSortedUniqBy extends js.Object {
  def apply[T](iteratee: ValueIteratee[T]): LodashSortedUniqBy1x1[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], array: List[T]): js.Array[T] = js.native
  def apply[T](iteratee: __): LodashSortedUniqBy1x2[T] = js.native
  def apply[T](iteratee: __, array: List[T]): LodashSortedUniqBy1x2[T] = js.native
}

