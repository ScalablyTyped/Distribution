package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFind extends js.Object {
  def apply[T](predicate: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[T, scala.Boolean]): js.UndefOr[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any, 
      scala.Boolean
    ],
    collection: T
  ): js.UndefOr[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
  ] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[T, scala.Boolean],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): js.UndefOr[T] = js.native
  def apply[T /* <: js.Object */](predicate: lodashLib.lodashMod.underscoreNs.`__`): LodashFind3x2[T] = js.native
  def apply[T /* <: js.Object */](predicate: lodashLib.lodashMod.underscoreNs.`__`, collection: T): LodashFind3x2[T] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashFind1x2[T] = js.native
  def apply[T, S /* <: T */](predicate: lodashLib.lodashMod.underscoreNs.ValueIteratorTypeGuard[T, S]): LodashFind1x1[T, S] = js.native
  def apply[T /* <: js.Object */, S /* <: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any */](
    predicate: lodashLib.lodashMod.underscoreNs.ValueIteratorTypeGuard[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any, 
      S
    ],
    collection: T
  ): js.UndefOr[S] = js.native
  def apply[T, S /* <: T */](
    predicate: lodashLib.lodashMod.underscoreNs.ValueIteratorTypeGuard[T, S],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): js.UndefOr[S] = js.native
}

