package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashSlice extends js.Object {
  def apply(start: lodashLib.lodashMod.__, end: scala.Double): LodashSlice1x2 = js.native
  def apply(start: scala.Double): LodashSlice1x1 = js.native
  def apply(start: scala.Double, end: scala.Double): LodashSlice1x3 = js.native
  def apply[T](start: lodashLib.lodashMod.__, end: lodashLib.lodashMod.__): LodashSlice1x4[T] = js.native
  def apply[T](start: lodashLib.lodashMod.__, end: lodashLib.lodashMod.__, array: lodashLib.lodashMod.List[T]): LodashSlice1x4[T] = js.native
  def apply[T](start: lodashLib.lodashMod.__, end: scala.Double, array: lodashLib.lodashMod.List[T]): LodashSlice1x6[T] = js.native
  def apply[T](start: scala.Double, end: lodashLib.lodashMod.__): LodashSlice1x5[T] = js.native
  def apply[T](start: scala.Double, end: lodashLib.lodashMod.__, array: lodashLib.lodashMod.List[T]): LodashSlice1x5[T] = js.native
  def apply[T](start: scala.Double, end: scala.Double, array: lodashLib.lodashMod.List[T]): js.Array[T] = js.native
}

