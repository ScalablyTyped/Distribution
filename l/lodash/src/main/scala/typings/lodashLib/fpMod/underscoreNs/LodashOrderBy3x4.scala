package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOrderBy3x4[T] extends js.Object {
  def apply(
    iteratees: lodashLib.lodashMod.underscoreNs.Many[
      lodashLib.lodashMod.underscoreNs.ValueIteratee[
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
      ]
    ]
  ): LodashOrderBy4x5[T] = js.native
  def apply(
    iteratees: lodashLib.lodashMod.underscoreNs.Many[
      (lodashLib.lodashMod.underscoreNs.ValueIteratee[
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
      ]) | (js.Function1[
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) *//* value */ js.Any, 
        lodashLib.lodashMod.underscoreNs.NotVoid
      ])
    ],
    orders: lodashLib.lodashMod.underscoreNs.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc]
  ): js.Array[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
  ] = js.native
  def apply(
    iteratees: lodashLib.lodashMod.underscoreNs.`__`,
    orders: lodashLib.lodashMod.underscoreNs.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc]
  ): LodashOrderBy3x6[T] = js.native
}

