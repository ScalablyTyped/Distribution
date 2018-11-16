package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReject extends js.Object {
  def apply(predicate: js.Function1[/* value */ java.lang.String, scala.Boolean]): js.Array[java.lang.String] = js.native
  def apply(predicate: js.Function1[/* value */ java.lang.String, scala.Boolean], collection: java.lang.String): js.Array[java.lang.String] = js.native
  def apply(predicate: lodashLib.lodashMod.underscoreNs.`__`): LodashReject1x2 = js.native
  def apply(predicate: lodashLib.lodashMod.underscoreNs.`__`, collection: java.lang.String): LodashReject1x2 = js.native
  def apply[T](predicate: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[T, scala.Boolean]): js.Array[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any, 
      scala.Boolean
    ],
    collection: T
  ): js.Array[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
  ] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[T, scala.Boolean],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): js.Array[T] = js.native
  def apply[T /* <: js.Object */](predicate: lodashLib.lodashMod.underscoreNs.`__`, collection: T): LodashReject3x2[T] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashReject2x2[T] = js.native
}

