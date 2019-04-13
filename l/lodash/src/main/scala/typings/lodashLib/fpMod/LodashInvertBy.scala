package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashInvertBy extends js.Object {
  def apply[T](interatee: lodashLib.lodashMod.ValueIteratee[T]): LodashInvertBy1x1[T] = js.native
  def apply[T /* <: js.Object */](
    interatee: lodashLib.lodashMod.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any],
    `object`: T
  ): lodashLib.lodashMod.Dictionary[js.Array[java.lang.String]] = js.native
  def apply[T](interatee: lodashLib.lodashMod.ValueIteratee[T], `object`: lodashLib.lodashMod.Dictionary[T]): lodashLib.lodashMod.Dictionary[js.Array[java.lang.String]] = js.native
  def apply[T](interatee: lodashLib.lodashMod.ValueIteratee[T], `object`: lodashLib.lodashMod.List[T]): lodashLib.lodashMod.Dictionary[js.Array[java.lang.String]] = js.native
  def apply[T](
    interatee: lodashLib.lodashMod.ValueIteratee[T],
    `object`: lodashLib.lodashMod.NumericDictionary[T]
  ): lodashLib.lodashMod.Dictionary[js.Array[java.lang.String]] = js.native
  def apply[T /* <: js.Object */](interatee: lodashLib.lodashMod.__): LodashInvertBy2x2[T] = js.native
  def apply[T /* <: js.Object */](interatee: lodashLib.lodashMod.__, `object`: T): LodashInvertBy2x2[T] = js.native
  def apply[T](interatee: lodashLib.lodashMod.__, `object`: lodashLib.lodashMod.Dictionary[T]): LodashInvertBy1x2[T] = js.native
  def apply[T](interatee: lodashLib.lodashMod.__, `object`: lodashLib.lodashMod.List[T]): LodashInvertBy1x2[T] = js.native
  def apply[T](interatee: lodashLib.lodashMod.__, `object`: lodashLib.lodashMod.NumericDictionary[T]): LodashInvertBy1x2[T] = js.native
}

