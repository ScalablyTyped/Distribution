package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPickBy extends js.Object {
  def apply[T](predicate: lodashLib.lodashMod.underscoreNs.ValueKeyIteratee[T]): lodashLib.lodashMod.underscoreNs.NumericDictionary[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: lodashLib.lodashMod.underscoreNs.ValueKeyIteratee[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ],
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
  def apply[T](predicate: lodashLib.lodashMod.underscoreNs.`__`): LodashPickBy2x2[T] = js.native
  def apply[T /* <: js.Object */](predicate: lodashLib.lodashMod.underscoreNs.`__`, `object`: T): LodashPickBy5x2[T] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.underscoreNs.`__`,
    `object`: lodashLib.lodashMod.underscoreNs.Dictionary[T]
  ): LodashPickBy1x2[T] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.underscoreNs.`__`,
    `object`: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
  ): LodashPickBy2x2[T] = js.native
  def apply[T, S /* <: T */](predicate: lodashLib.lodashMod.underscoreNs.ValueKeyIterateeTypeGuard[T, S]): LodashPickBy1x1[T, S] = js.native
  def apply[T, S /* <: T */](
    predicate: lodashLib.lodashMod.underscoreNs.ValueKeyIterateeTypeGuard[T, S],
    `object`: lodashLib.lodashMod.underscoreNs.Dictionary[T]
  ): lodashLib.lodashMod.underscoreNs.Dictionary[S] = js.native
  def apply[T, S /* <: T */](
    predicate: lodashLib.lodashMod.underscoreNs.ValueKeyIterateeTypeGuard[T, S],
    `object`: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
  ): lodashLib.lodashMod.underscoreNs.NumericDictionary[S] = js.native
}

