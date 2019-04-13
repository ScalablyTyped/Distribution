package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPickBy extends js.Object {
  def apply[T](predicate: lodashLib.lodashMod.ValueKeyIteratee[T]): LodashPickBy3x1[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: lodashLib.lodashMod.ValueKeyIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any],
    `object`: T
  ): lodashLib.lodashMod.PartialObject[T] = js.native
  def apply[T](predicate: lodashLib.lodashMod.ValueKeyIteratee[T], `object`: lodashLib.lodashMod.Dictionary[T]): lodashLib.lodashMod.Dictionary[T] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.ValueKeyIteratee[T],
    `object`: lodashLib.lodashMod.NumericDictionary[T]
  ): lodashLib.lodashMod.NumericDictionary[T] = js.native
  def apply[T](predicate: lodashLib.lodashMod.__): LodashPickBy2x2[T] = js.native
  def apply[T /* <: js.Object */](predicate: lodashLib.lodashMod.__, `object`: T): LodashPickBy5x2[T] = js.native
  def apply[T](predicate: lodashLib.lodashMod.__, `object`: lodashLib.lodashMod.Dictionary[T]): LodashPickBy1x2[T] = js.native
  def apply[T](predicate: lodashLib.lodashMod.__, `object`: lodashLib.lodashMod.NumericDictionary[T]): LodashPickBy2x2[T] = js.native
  def apply[T, S /* <: T */](predicate: lodashLib.lodashMod.ValueKeyIterateeTypeGuard[T, S]): lodashLib.lodashMod.Dictionary[S] = js.native
  def apply[T, S /* <: T */](
    predicate: lodashLib.lodashMod.ValueKeyIterateeTypeGuard[T, S],
    `object`: lodashLib.lodashMod.Dictionary[T]
  ): lodashLib.lodashMod.Dictionary[S] = js.native
  def apply[T, S /* <: T */](
    predicate: lodashLib.lodashMod.ValueKeyIterateeTypeGuard[T, S],
    `object`: lodashLib.lodashMod.NumericDictionary[T]
  ): lodashLib.lodashMod.NumericDictionary[S] = js.native
}

