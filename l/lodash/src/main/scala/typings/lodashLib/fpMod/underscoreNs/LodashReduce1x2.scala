package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReduce1x2[TResult] extends js.Object {
  def apply[T](callback: lodashLib.lodashMod.underscoreNs.MemoIteratorCapped[T, TResult]): LodashReduce1x3[T, TResult] = js.native
  def apply[T /* <: js.Object */](
    callback: lodashLib.lodashMod.underscoreNs.MemoIteratorCapped[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any, 
      TResult
    ],
    collection: T
  ): TResult = js.native
  def apply[T](callback: lodashLib.lodashMod.underscoreNs.MemoIteratorCapped[T, TResult], collection: js.Array[T]): TResult = js.native
  def apply[T](
    callback: lodashLib.lodashMod.underscoreNs.MemoIteratorCapped[T, TResult],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): TResult = js.native
  def apply[T /* <: js.Object */](callback: lodashLib.lodashMod.underscoreNs.`__`): LodashReduce3x6[T, TResult] = js.native
  def apply[T /* <: js.Object */](callback: lodashLib.lodashMod.underscoreNs.`__`, collection: T): LodashReduce3x6[T, TResult] = js.native
  def apply[T](callback: lodashLib.lodashMod.underscoreNs.`__`, collection: js.Array[T]): LodashReduce1x6[T, TResult] = js.native
  def apply[T](
    callback: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashReduce2x6[T, TResult] = js.native
}

