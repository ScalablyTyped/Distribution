package typings.lodash.fpMod

import typings.lodash.lodashMod.List
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashSlice extends js.Object {
  def apply(start: Double): LodashSlice1x1 = js.native
  def apply(start: Double, end: Double): LodashSlice1x3 = js.native
  def apply(start: __, end: Double): LodashSlice1x2 = js.native
  def apply[T](start: Double, end: Double, array: List[T]): js.Array[T] = js.native
  def apply[T](start: Double, end: __): LodashSlice1x5[T] = js.native
  def apply[T](start: Double, end: __, array: List[T]): LodashSlice1x5[T] = js.native
  def apply[T](start: __, end: Double, array: List[T]): LodashSlice1x6[T] = js.native
  def apply[T](start: __, end: __): LodashSlice1x4[T] = js.native
  def apply[T](start: __, end: __, array: List[T]): LodashSlice1x4[T] = js.native
}

