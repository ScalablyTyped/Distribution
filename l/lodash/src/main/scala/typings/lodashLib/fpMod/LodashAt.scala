package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashAt extends js.Object {
  def apply(props: lodashLib.lodashMod.PropertyPath): LodashAt1x1 = js.native
  def apply[T /* <: js.Object */](props: lodashLib.lodashMod.Many[java.lang.String], `object`: T): js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  def apply[T](props: lodashLib.lodashMod.PropertyPath, `object`: lodashLib.lodashMod.Dictionary[T]): js.Array[T] = js.native
  def apply[T](props: lodashLib.lodashMod.PropertyPath, `object`: lodashLib.lodashMod.List[T]): js.Array[T] = js.native
  def apply[T](props: lodashLib.lodashMod.PropertyPath, `object`: lodashLib.lodashMod.NumericDictionary[T]): js.Array[T] = js.native
  def apply[T](props: lodashLib.lodashMod.__): LodashAt1x2[T] = js.native
  def apply[T /* <: js.Object */](props: lodashLib.lodashMod.__, `object`: T): LodashAt2x2[T] = js.native
  def apply[T](props: lodashLib.lodashMod.__, `object`: lodashLib.lodashMod.Dictionary[T]): LodashAt1x2[T] = js.native
  def apply[T](props: lodashLib.lodashMod.__, `object`: lodashLib.lodashMod.List[T]): LodashAt1x2[T] = js.native
  def apply[T](props: lodashLib.lodashMod.__, `object`: lodashLib.lodashMod.NumericDictionary[T]): LodashAt1x2[T] = js.native
}

