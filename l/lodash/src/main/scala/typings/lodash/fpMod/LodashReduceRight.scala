package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.MemoIteratorCappedRight
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReduceRight extends js.Object {
  def apply[TResult](callback: __, accumulator: TResult): LodashReduceRight1x2[TResult] = js.native
  def apply[T](callback: __, accumulator: __): LodashReduceRight1x4[T] = js.native
  def apply[T /* <: js.Object */](callback: __, accumulator: __, collection: T): LodashReduceRight3x4[T] = js.native
  def apply[T](callback: __, accumulator: __, collection: js.Array[T]): LodashReduceRight1x4[T] = js.native
  def apply[T](callback: __, accumulator: __, collection: List[T]): LodashReduceRight2x4[T] = js.native
  def apply[T, TResult](callback: MemoIteratorCappedRight[T, TResult]): LodashReduceRight1x1[T, TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    callback: MemoIteratorCappedRight[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: TResult
  ): LodashReduceRight3x3[T, TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    callback: MemoIteratorCappedRight[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: TResult,
    collection: T
  ): TResult = js.native
  def apply[T, TResult](callback: MemoIteratorCappedRight[T, TResult], accumulator: TResult, collection: js.Array[T]): TResult = js.native
  def apply[T, TResult](callback: MemoIteratorCappedRight[T, TResult], accumulator: TResult, collection: List[T]): TResult = js.native
  def apply[T, TResult](callback: MemoIteratorCappedRight[T, TResult], accumulator: __): LodashReduceRight2x5[TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    callback: MemoIteratorCappedRight[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: __,
    collection: T
  ): LodashReduceRight3x5[TResult] = js.native
  def apply[T, TResult](callback: MemoIteratorCappedRight[T, TResult], accumulator: __, collection: js.Array[T]): LodashReduceRight1x5[TResult] = js.native
  def apply[T, TResult](callback: MemoIteratorCappedRight[T, TResult], accumulator: __, collection: List[T]): LodashReduceRight2x5[TResult] = js.native
  def apply[T /* <: js.Object */, TResult](callback: __, accumulator: TResult, collection: T): LodashReduceRight3x6[T, TResult] = js.native
  def apply[T, TResult](callback: __, accumulator: TResult, collection: js.Array[T]): LodashReduceRight1x6[T, TResult] = js.native
  def apply[T, TResult](callback: __, accumulator: TResult, collection: List[T]): LodashReduceRight2x6[T, TResult] = js.native
}

