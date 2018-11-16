package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashEvery extends js.Object {
  def apply[T](predicate: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[T, scala.Boolean]): LodashEvery1x1[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any, 
      scala.Boolean
    ],
    collection: T
  ): scala.Boolean = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[T, scala.Boolean],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): scala.Boolean = js.native
  def apply[T /* <: js.Object */](predicate: lodashLib.lodashMod.underscoreNs.`__`): LodashEvery2x2[T] = js.native
  def apply[T /* <: js.Object */](predicate: lodashLib.lodashMod.underscoreNs.`__`, collection: T): LodashEvery2x2[T] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashEvery1x2[T] = js.native
}

