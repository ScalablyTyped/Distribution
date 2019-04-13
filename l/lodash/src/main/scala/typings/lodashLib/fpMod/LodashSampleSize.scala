package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashSampleSize extends js.Object {
  def apply(n: scala.Double): LodashSampleSize1x1 = js.native
  def apply[T /* <: js.Object */](n: lodashLib.lodashMod.__): LodashSampleSize2x2[T] = js.native
  def apply[T /* <: js.Object */](n: lodashLib.lodashMod.__, collection: T): LodashSampleSize2x2[T] = js.native
  def apply[T](n: lodashLib.lodashMod.__, collection: lodashLib.lodashMod.Dictionary[T]): LodashSampleSize1x2[T] = js.native
  def apply[T](n: lodashLib.lodashMod.__, collection: lodashLib.lodashMod.List[T]): LodashSampleSize1x2[T] = js.native
  def apply[T](n: lodashLib.lodashMod.__, collection: lodashLib.lodashMod.NumericDictionary[T]): LodashSampleSize1x2[T] = js.native
  def apply[T /* <: js.Object */](n: scala.Double, collection: T): js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  def apply[T](n: scala.Double, collection: lodashLib.lodashMod.Dictionary[T]): js.Array[T] = js.native
  def apply[T](n: scala.Double, collection: lodashLib.lodashMod.List[T]): js.Array[T] = js.native
  def apply[T](n: scala.Double, collection: lodashLib.lodashMod.NumericDictionary[T]): js.Array[T] = js.native
}

