package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOrderBy1x2 extends js.Object {
  def apply[T](
    iteratees: lodashLib.lodashMod.underscoreNs.Many[lodashLib.lodashMod.underscoreNs.ValueIteratee[T]]
  ): LodashOrderBy2x3[T] = js.native
  def apply[T /* <: js.Object */](
    iteratees: lodashLib.lodashMod.underscoreNs.Many[
      (lodashLib.lodashMod.underscoreNs.ValueIteratee[
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
      ]) | (js.Function1[
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) *//* value */ js.Any, 
        lodashLib.lodashMod.underscoreNs.NotVoid
      ])
    ],
    collection: T
  ): js.Array[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
  ] = js.native
  def apply[T](
    iteratees: lodashLib.lodashMod.underscoreNs.Many[
      lodashLib.lodashMod.underscoreNs.ValueIteratee[T] | (js.Function1[/* value */ T, lodashLib.lodashMod.underscoreNs.NotVoid])
    ],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): js.Array[T] = js.native
  def apply[T /* <: js.Object */](iteratees: lodashLib.lodashMod.underscoreNs.`__`): LodashOrderBy3x6[T] = js.native
  def apply[T /* <: js.Object */](iteratees: lodashLib.lodashMod.underscoreNs.`__`, collection: T): LodashOrderBy3x6[T] = js.native
  def apply[T](
    iteratees: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashOrderBy1x6[T] = js.native
}

