package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPullAllBy extends js.Object {
  def apply[T](iteratee: lodashLib.lodashMod.ValueIteratee[T]): LodashPullAllBy1x1[T] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.ValueIteratee[T], values: lodashLib.lodashMod.List[T]): LodashPullAllBy1x3[T] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.ValueIteratee[T],
    values: lodashLib.lodashMod.List[T],
    array: js.Array[T]
  ): js.Array[T] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.ValueIteratee[T],
    values: lodashLib.lodashMod.List[T],
    array: lodashLib.lodashMod.List[T]
  ): lodashLib.lodashMod.List[T] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.ValueIteratee[T], values: lodashLib.lodashMod.__, array: js.Array[T]): LodashPullAllBy1x5[T] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.ValueIteratee[T],
    values: lodashLib.lodashMod.__,
    array: lodashLib.lodashMod.List[T]
  ): LodashPullAllBy2x5[T] = js.native
  def apply[T2](iteratee: lodashLib.lodashMod.__, values: lodashLib.lodashMod.List[T2]): LodashPullAllBy3x2[T2] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.__, values: lodashLib.lodashMod.List[T], array: js.Array[T]): LodashPullAllBy1x6[T] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.__,
    values: lodashLib.lodashMod.List[T],
    array: lodashLib.lodashMod.List[T]
  ): LodashPullAllBy2x6[T] = js.native
  def apply[T1](iteratee: lodashLib.lodashMod.__, values: lodashLib.lodashMod.__, array: js.Array[T1]): LodashPullAllBy3x4[T1] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.__,
    values: lodashLib.lodashMod.__,
    array: lodashLib.lodashMod.List[T]
  ): LodashPullAllBy2x4[T] = js.native
}

