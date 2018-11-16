package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFlatMapDeep extends js.Object {
  def apply(iteratee: java.lang.String): js.Array[_] = js.native
  def apply(iteratee: java.lang.String, collection: js.Object): js.Array[_] = js.native
  def apply(iteratee: js.Object): js.Array[scala.Boolean] = js.native
  def apply(iteratee: js.Object, collection: js.Object): js.Array[scala.Boolean] = js.native
  def apply(iteratee: lodashLib.lodashMod.underscoreNs.`__`): LodashFlatMapDeep3x2 = js.native
  def apply(iteratee: lodashLib.lodashMod.underscoreNs.`__`, collection: js.Object): LodashFlatMapDeep3x2 = js.native
  def apply[T /* <: js.Object */](iteratee: lodashLib.lodashMod.underscoreNs.`__`, collection: T): LodashFlatMapDeep2x2[T] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashFlatMapDeep1x2[T] = js.native
  def apply[T, TResult](
    iteratee: js.Function1[
      /* value */ T, 
      lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): js.Array[TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) *//* value */ js.Any, 
      lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    collection: T
  ): js.Array[TResult] = js.native
  def apply[T, TResult](
    iteratee: js.Function1[
      /* value */ T, 
      lodashLib.lodashMod.underscoreNs.ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): js.Array[TResult] = js.native
}

