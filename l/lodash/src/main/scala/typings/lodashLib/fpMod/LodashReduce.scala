package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReduce extends js.Object {
  def apply[TResult](callback: lodashLib.lodashMod.__, accumulator: TResult): LodashReduce1x2[TResult] = js.native
  def apply[T /* <: js.Object */](callback: lodashLib.lodashMod.__, accumulator: lodashLib.lodashMod.__): LodashReduce3x4[T] = js.native
  def apply[T /* <: js.Object */](callback: lodashLib.lodashMod.__, accumulator: lodashLib.lodashMod.__, collection: T): LodashReduce3x4[T] = js.native
  def apply[T](callback: lodashLib.lodashMod.__, accumulator: lodashLib.lodashMod.__, collection: js.Array[T]): LodashReduce1x4[T] = js.native
  def apply[T](
    callback: lodashLib.lodashMod.__,
    accumulator: lodashLib.lodashMod.__,
    collection: lodashLib.lodashMod.List[T]
  ): LodashReduce2x4[T] = js.native
  def apply[T, TResult](callback: lodashLib.lodashMod.MemoIteratorCapped[T, TResult]): LodashReduce1x1[T, TResult] = js.native
  def apply[T, TResult](callback: lodashLib.lodashMod.MemoIteratorCapped[T, TResult], accumulator: TResult): TResult = js.native
  def apply[T /* <: js.Object */, TResult](
    callback: lodashLib.lodashMod.MemoIteratorCapped[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: TResult,
    collection: T
  ): TResult = js.native
  def apply[T, TResult](
    callback: lodashLib.lodashMod.MemoIteratorCapped[T, TResult],
    accumulator: TResult,
    collection: js.Array[T]
  ): TResult = js.native
  def apply[T, TResult](
    callback: lodashLib.lodashMod.MemoIteratorCapped[T, TResult],
    accumulator: TResult,
    collection: lodashLib.lodashMod.List[T]
  ): TResult = js.native
  def apply[T, TResult](callback: lodashLib.lodashMod.MemoIteratorCapped[T, TResult], accumulator: lodashLib.lodashMod.__): LodashReduce2x5[TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    callback: lodashLib.lodashMod.MemoIteratorCapped[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: lodashLib.lodashMod.__,
    collection: T
  ): LodashReduce3x5[TResult] = js.native
  def apply[T, TResult](
    callback: lodashLib.lodashMod.MemoIteratorCapped[T, TResult],
    accumulator: lodashLib.lodashMod.__,
    collection: js.Array[T]
  ): LodashReduce1x5[TResult] = js.native
  def apply[T, TResult](
    callback: lodashLib.lodashMod.MemoIteratorCapped[T, TResult],
    accumulator: lodashLib.lodashMod.__,
    collection: lodashLib.lodashMod.List[T]
  ): LodashReduce2x5[TResult] = js.native
  def apply[T /* <: js.Object */, TResult](callback: lodashLib.lodashMod.__, accumulator: TResult, collection: T): LodashReduce3x6[T, TResult] = js.native
  def apply[T, TResult](callback: lodashLib.lodashMod.__, accumulator: TResult, collection: js.Array[T]): LodashReduce1x6[T, TResult] = js.native
  def apply[T, TResult](callback: lodashLib.lodashMod.__, accumulator: TResult, collection: lodashLib.lodashMod.List[T]): LodashReduce2x6[T, TResult] = js.native
}

