package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReduce extends js.Object {
  def apply[TResult](callback: lodashLib.lodashMod.underscoreNs.`__`, accumulator: TResult): LodashReduce1x2[TResult] = js.native
  def apply[T /* <: js.Object */](
    callback: lodashLib.lodashMod.underscoreNs.`__`,
    accumulator: lodashLib.lodashMod.underscoreNs.`__`
  ): LodashReduce3x4[T] = js.native
  def apply[T /* <: js.Object */](
    callback: lodashLib.lodashMod.underscoreNs.`__`,
    accumulator: lodashLib.lodashMod.underscoreNs.`__`,
    collection: T
  ): LodashReduce3x4[T] = js.native
  def apply[T](
    callback: lodashLib.lodashMod.underscoreNs.`__`,
    accumulator: lodashLib.lodashMod.underscoreNs.`__`,
    collection: js.Array[T]
  ): LodashReduce1x4[T] = js.native
  def apply[T](
    callback: lodashLib.lodashMod.underscoreNs.`__`,
    accumulator: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashReduce2x4[T] = js.native
  def apply[T /* <: js.Object */, TResult](
    callback: lodashLib.lodashMod.underscoreNs.MemoIteratorCapped[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any, 
      TResult
    ]
  ): LodashReduce3x1[T, TResult] = js.native
  def apply[T, TResult](callback: lodashLib.lodashMod.underscoreNs.MemoIteratorCapped[T, TResult], accumulator: TResult): TResult = js.native
  def apply[T /* <: js.Object */, TResult](
    callback: lodashLib.lodashMod.underscoreNs.MemoIteratorCapped[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any, 
      TResult
    ],
    accumulator: TResult,
    collection: T
  ): TResult = js.native
  def apply[T, TResult](
    callback: lodashLib.lodashMod.underscoreNs.MemoIteratorCapped[T, TResult],
    accumulator: TResult,
    collection: js.Array[T]
  ): TResult = js.native
  def apply[T, TResult](
    callback: lodashLib.lodashMod.underscoreNs.MemoIteratorCapped[T, TResult],
    accumulator: TResult,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): TResult = js.native
  def apply[T, TResult](
    callback: lodashLib.lodashMod.underscoreNs.MemoIteratorCapped[T, TResult],
    accumulator: lodashLib.lodashMod.underscoreNs.`__`
  ): LodashReduce1x5[TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    callback: lodashLib.lodashMod.underscoreNs.MemoIteratorCapped[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any, 
      TResult
    ],
    accumulator: lodashLib.lodashMod.underscoreNs.`__`,
    collection: T
  ): LodashReduce3x5[TResult] = js.native
  def apply[T, TResult](
    callback: lodashLib.lodashMod.underscoreNs.MemoIteratorCapped[T, TResult],
    accumulator: lodashLib.lodashMod.underscoreNs.`__`,
    collection: js.Array[T]
  ): LodashReduce1x5[TResult] = js.native
  def apply[T, TResult](
    callback: lodashLib.lodashMod.underscoreNs.MemoIteratorCapped[T, TResult],
    accumulator: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashReduce2x5[TResult] = js.native
  def apply[T /* <: js.Object */, TResult](callback: lodashLib.lodashMod.underscoreNs.`__`, accumulator: TResult, collection: T): LodashReduce3x6[T, TResult] = js.native
  def apply[T, TResult](callback: lodashLib.lodashMod.underscoreNs.`__`, accumulator: TResult, collection: js.Array[T]): LodashReduce1x6[T, TResult] = js.native
  def apply[T, TResult](
    callback: lodashLib.lodashMod.underscoreNs.`__`,
    accumulator: TResult,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashReduce2x6[T, TResult] = js.native
}

