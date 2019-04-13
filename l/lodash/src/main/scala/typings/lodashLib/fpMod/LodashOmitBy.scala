package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOmitBy extends js.Object {
  def apply[T](predicate: lodashLib.lodashMod.ValueKeyIteratee[T]): LodashOmitBy1x1[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: lodashLib.lodashMod.ValueKeyIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any],
    `object`: T
  ): lodashLib.lodashMod.PartialObject[T] = js.native
  def apply[T](predicate: lodashLib.lodashMod.ValueKeyIteratee[T], `object`: lodashLib.lodashMod.Dictionary[T]): lodashLib.lodashMod.Dictionary[T] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.ValueKeyIteratee[T],
    `object`: lodashLib.lodashMod.NumericDictionary[T]
  ): lodashLib.lodashMod.NumericDictionary[T] = js.native
  def apply[T](predicate: lodashLib.lodashMod.__): LodashOmitBy1x2[T] = js.native
  def apply[T /* <: js.Object */](predicate: lodashLib.lodashMod.__, `object`: T): LodashOmitBy3x2[T] = js.native
  def apply[T](predicate: lodashLib.lodashMod.__, `object`: lodashLib.lodashMod.Dictionary[T]): LodashOmitBy1x2[T] = js.native
  def apply[T](predicate: lodashLib.lodashMod.__, `object`: lodashLib.lodashMod.NumericDictionary[T]): LodashOmitBy2x2[T] = js.native
}

