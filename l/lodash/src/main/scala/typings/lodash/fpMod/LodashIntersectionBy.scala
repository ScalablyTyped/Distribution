package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.ValueIteratee
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashIntersectionBy extends LodashConvertible {
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

