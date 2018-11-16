package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashCountBy extends js.Object {
  def apply[T](iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]): lodashLib.lodashMod.underscoreNs.Dictionary[scala.Double] = js.native
  def apply[T /* <: js.Object */](
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
    ],
    collection: T
  ): lodashLib.lodashMod.underscoreNs.Dictionary[scala.Double] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): lodashLib.lodashMod.underscoreNs.Dictionary[scala.Double] = js.native
  def apply[T /* <: js.Object */](iteratee: lodashLib.lodashMod.underscoreNs.`__`): LodashCountBy2x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: lodashLib.lodashMod.underscoreNs.`__`, collection: T): LodashCountBy2x2[T] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashCountBy1x2[T] = js.native
}

