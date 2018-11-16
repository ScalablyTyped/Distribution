package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFlatMapDepth2x4[T] extends js.Object {
  def apply(iteratee: lodashLib.lodashMod.underscoreNs.`__`, depth: scala.Double): LodashFlatMapDepth2x6[T] = js.native
  def apply[TResult](
    iteratee: js.Function1[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) *//* value */ js.Any, 
      lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): LodashFlatMapDepth2x5[TResult] = js.native
  def apply[TResult](
    iteratee: js.Function1[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) *//* value */ js.Any, 
      lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: scala.Double
  ): js.Array[TResult] = js.native
}

