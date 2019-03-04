package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOmitBy extends js.Object {
  def apply[T](predicate: lodashLib.lodashMod.underscoreNs.ValueKeyIteratee[T]): lodashLib.lodashMod.underscoreNs.NumericDictionary[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: lodashLib.lodashMod.underscoreNs.ValueKeyIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any],
    `object`: T
  ): lodashLib.lodashMod.underscoreNs.PartialObject[T] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.underscoreNs.ValueKeyIteratee[T],
    `object`: lodashLib.lodashMod.underscoreNs.Dictionary[T]
  ): lodashLib.lodashMod.underscoreNs.Dictionary[T] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.underscoreNs.ValueKeyIteratee[T],
    `object`: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
  ): lodashLib.lodashMod.underscoreNs.NumericDictionary[T] = js.native
  def apply[T](predicate: lodashLib.lodashMod.underscoreNs.__): LodashOmitBy1x2[T] = js.native
  def apply[T /* <: js.Object */](predicate: lodashLib.lodashMod.underscoreNs.__, `object`: T): LodashOmitBy3x2[T] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.underscoreNs.__,
    `object`: lodashLib.lodashMod.underscoreNs.Dictionary[T]
  ): LodashOmitBy1x2[T] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.underscoreNs.__,
    `object`: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
  ): LodashOmitBy2x2[T] = js.native
}

