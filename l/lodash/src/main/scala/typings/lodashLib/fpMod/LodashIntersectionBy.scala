package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashIntersectionBy extends js.Object {
  def apply[T1](iteratee: lodashLib.lodashMod.__): LodashIntersectionBy1x2[T1] = js.native
  def apply[T1](iteratee: lodashLib.lodashMod.__, array: lodashLib.lodashMod.List[T1]): LodashIntersectionBy1x2[T1] = js.native
  def apply[T2](
    iteratee: lodashLib.lodashMod.__,
    array: lodashLib.lodashMod.__,
    values: lodashLib.lodashMod.List[T2]
  ): LodashIntersectionBy1x4[T2] = js.native
  def apply[T1, T2](iteratee: lodashLib.lodashMod.ValueIteratee[T1 | T2]): LodashIntersectionBy1x1[T1, T2] = js.native
  def apply[T1, T2](iteratee: lodashLib.lodashMod.ValueIteratee[T1 | T2], array: lodashLib.lodashMod.List[T1]): LodashIntersectionBy1x3[T1, T2] = js.native
  def apply[T1, T2](
    iteratee: lodashLib.lodashMod.ValueIteratee[T1 | T2],
    array: lodashLib.lodashMod.List[T1],
    values: lodashLib.lodashMod.List[T2]
  ): js.Array[T1] = js.native
  def apply[T1, T2](
    iteratee: lodashLib.lodashMod.ValueIteratee[T1 | T2],
    array: lodashLib.lodashMod.__,
    values: lodashLib.lodashMod.List[T2]
  ): LodashIntersectionBy1x5[T1] = js.native
  def apply[T1, T2](
    iteratee: lodashLib.lodashMod.ValueIteratee[T1 | T2],
    array: scala.Null,
    values: lodashLib.lodashMod.List[T2]
  ): js.Array[T1] = js.native
  def apply[T1, T2](
    iteratee: lodashLib.lodashMod.__,
    array: lodashLib.lodashMod.List[T1],
    values: lodashLib.lodashMod.List[T2]
  ): LodashIntersectionBy1x6[T1, T2] = js.native
  def apply[T1, T2](iteratee: lodashLib.lodashMod.__, array: scala.Null, values: lodashLib.lodashMod.List[T2]): LodashIntersectionBy1x6[T1, T2] = js.native
}

