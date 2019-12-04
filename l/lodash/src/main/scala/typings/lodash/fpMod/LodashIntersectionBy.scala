package typings.lodash.fpMod

import typings.lodash.lodashMod.List
import typings.lodash.lodashMod.ValueIteratee
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashIntersectionBy extends js.Object {
  def apply[T1](iteratee: __): LodashIntersectionBy1x2[T1] = js.native
  def apply[T1](iteratee: __, array: List[T1]): LodashIntersectionBy1x2[T1] = js.native
  def apply[T2](iteratee: __, array: __, values: List[T2]): LodashIntersectionBy1x4[T2] = js.native
  def apply[T1, T2](iteratee: ValueIteratee[T1 | T2]): LodashIntersectionBy1x1[T1, T2] = js.native
  def apply[T1, T2](iteratee: ValueIteratee[T1 | T2], array: Null, values: List[T2]): js.Array[T1] = js.native
  def apply[T1, T2](iteratee: ValueIteratee[T1 | T2], array: List[T1]): LodashIntersectionBy1x3[T1, T2] = js.native
  def apply[T1, T2](iteratee: ValueIteratee[T1 | T2], array: List[T1], values: List[T2]): js.Array[T1] = js.native
  def apply[T1, T2](iteratee: ValueIteratee[T1 | T2], array: __, values: List[T2]): LodashIntersectionBy1x5[T1] = js.native
  def apply[T1, T2](iteratee: __, array: Null, values: List[T2]): LodashIntersectionBy1x6[T1, T2] = js.native
  def apply[T1, T2](iteratee: __, array: List[T1], values: List[T2]): LodashIntersectionBy1x6[T1, T2] = js.native
}

