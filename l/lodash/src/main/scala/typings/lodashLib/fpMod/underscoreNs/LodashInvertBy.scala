package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashInvertBy extends js.Object {
  def apply[T](interatee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]): lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[java.lang.String]] = js.native
  def apply[T /* <: js.Object */](
    interatee: lodashLib.lodashMod.underscoreNs.ValueIteratee[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ],
    `object`: T
  ): lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[java.lang.String]] = js.native
  def apply[T](
    interatee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T],
    `object`: lodashLib.lodashMod.underscoreNs.Dictionary[T]
  ): lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[java.lang.String]] = js.native
  def apply[T](
    interatee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T],
    `object`: lodashLib.lodashMod.underscoreNs.List[T]
  ): lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[java.lang.String]] = js.native
  def apply[T](
    interatee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T],
    `object`: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
  ): lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[java.lang.String]] = js.native
  def apply[T](interatee: lodashLib.lodashMod.underscoreNs.`__`): LodashInvertBy1x2[T] = js.native
  def apply[T /* <: js.Object */](interatee: lodashLib.lodashMod.underscoreNs.`__`, `object`: T): LodashInvertBy2x2[T] = js.native
  def apply[T](
    interatee: lodashLib.lodashMod.underscoreNs.`__`,
    `object`: lodashLib.lodashMod.underscoreNs.Dictionary[T]
  ): LodashInvertBy1x2[T] = js.native
  def apply[T](
    interatee: lodashLib.lodashMod.underscoreNs.`__`,
    `object`: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashInvertBy1x2[T] = js.native
  def apply[T](
    interatee: lodashLib.lodashMod.underscoreNs.`__`,
    `object`: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
  ): LodashInvertBy1x2[T] = js.native
}

