package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOrderBy extends js.Object {
  def apply(
    iteratees: lodashLib.lodashMod.underscoreNs.`__`,
    orders: lodashLib.lodashMod.underscoreNs.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc]
  ): LodashOrderBy1x2 = js.native
  def apply[T](
    iteratees: lodashLib.lodashMod.underscoreNs.Many[js.Function1[/* value */ T, lodashLib.lodashMod.underscoreNs.NotVoid]]
  ): LodashOrderBy1x1[T] = js.native
  def apply[T](
    iteratees: lodashLib.lodashMod.underscoreNs.Many[lodashLib.lodashMod.underscoreNs.ValueIteratee[T]],
    orders: lodashLib.lodashMod.underscoreNs.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc]
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
    orders: lodashLib.lodashMod.underscoreNs.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc],
    collection: T
  ): js.Array[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
  ] = js.native
  def apply[T](
    iteratees: lodashLib.lodashMod.underscoreNs.Many[
      lodashLib.lodashMod.underscoreNs.ValueIteratee[T] | (js.Function1[/* value */ T, lodashLib.lodashMod.underscoreNs.NotVoid])
    ],
    orders: lodashLib.lodashMod.underscoreNs.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): js.Array[T] = js.native
  def apply[T](
    iteratees: lodashLib.lodashMod.underscoreNs.Many[lodashLib.lodashMod.underscoreNs.ValueIteratee[T]],
    orders: lodashLib.lodashMod.underscoreNs.`__`
  ): LodashOrderBy2x5[T] = js.native
  def apply[T /* <: js.Object */](
    iteratees: lodashLib.lodashMod.underscoreNs.Many[
      lodashLib.lodashMod.underscoreNs.ValueIteratee[
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
      ]
    ],
    orders: lodashLib.lodashMod.underscoreNs.`__`,
    collection: T
  ): LodashOrderBy4x5[T] = js.native
  def apply[T](
    iteratees: lodashLib.lodashMod.underscoreNs.Many[lodashLib.lodashMod.underscoreNs.ValueIteratee[T]],
    orders: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashOrderBy2x5[T] = js.native
  def apply[T /* <: js.Object */](
    iteratees: lodashLib.lodashMod.underscoreNs.`__`,
    orders: lodashLib.lodashMod.underscoreNs.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc],
    collection: T
  ): LodashOrderBy3x6[T] = js.native
  def apply[T](
    iteratees: lodashLib.lodashMod.underscoreNs.`__`,
    orders: lodashLib.lodashMod.underscoreNs.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashOrderBy1x6[T] = js.native
  def apply[T /* <: js.Object */](iteratees: lodashLib.lodashMod.underscoreNs.`__`, orders: lodashLib.lodashMod.underscoreNs.`__`): LodashOrderBy3x4[T] = js.native
  def apply[T /* <: js.Object */](
    iteratees: lodashLib.lodashMod.underscoreNs.`__`,
    orders: lodashLib.lodashMod.underscoreNs.`__`,
    collection: T
  ): LodashOrderBy3x4[T] = js.native
  def apply[T](
    iteratees: lodashLib.lodashMod.underscoreNs.`__`,
    orders: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashOrderBy1x4[T] = js.native
}

