package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReduceRight extends js.Object {
  def apply[TResult](callback: lodashLib.lodashMod.__, accumulator: TResult): LodashReduceRight1x2[TResult] = js.native
  def apply[T](callback: lodashLib.lodashMod.__, accumulator: lodashLib.lodashMod.__): LodashReduceRight2x4[T] = js.native
  def apply[T /* <: js.Object */](callback: lodashLib.lodashMod.__, accumulator: lodashLib.lodashMod.__, collection: T): LodashReduceRight3x4[T] = js.native
  def apply[T](callback: lodashLib.lodashMod.__, accumulator: lodashLib.lodashMod.__, collection: js.Array[T]): LodashReduceRight1x4[T] = js.native
  def apply[T](
    callback: lodashLib.lodashMod.__,
    accumulator: lodashLib.lodashMod.__,
    collection: lodashLib.lodashMod.List[T]
  ): LodashReduceRight2x4[T] = js.native
  def apply[T, TResult](callback: lodashLib.lodashMod.MemoIteratorCappedRight[T, TResult]): LodashReduceRight1x1[T, TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    callback: lodashLib.lodashMod.MemoIteratorCappedRight[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: TResult
  ): LodashReduceRight3x3[T, TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    callback: lodashLib.lodashMod.MemoIteratorCappedRight[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: TResult,
    collection: T
  ): TResult = js.native
  def apply[T, TResult](
    callback: lodashLib.lodashMod.MemoIteratorCappedRight[T, TResult],
    accumulator: TResult,
    collection: js.Array[T]
  ): TResult = js.native
  def apply[T, TResult](
    callback: lodashLib.lodashMod.MemoIteratorCappedRight[T, TResult],
    accumulator: TResult,
    collection: lodashLib.lodashMod.List[T]
  ): TResult = js.native
  def apply[T, TResult](
    callback: lodashLib.lodashMod.MemoIteratorCappedRight[T, TResult],
    accumulator: lodashLib.lodashMod.__
  ): LodashReduceRight2x5[TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    callback: lodashLib.lodashMod.MemoIteratorCappedRight[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: lodashLib.lodashMod.__,
    collection: T
  ): LodashReduceRight3x5[TResult] = js.native
  def apply[T, TResult](
    callback: lodashLib.lodashMod.MemoIteratorCappedRight[T, TResult],
    accumulator: lodashLib.lodashMod.__,
    collection: js.Array[T]
  ): LodashReduceRight1x5[TResult] = js.native
  def apply[T, TResult](
    callback: lodashLib.lodashMod.MemoIteratorCappedRight[T, TResult],
    accumulator: lodashLib.lodashMod.__,
    collection: lodashLib.lodashMod.List[T]
  ): LodashReduceRight2x5[TResult] = js.native
  def apply[T /* <: js.Object */, TResult](callback: lodashLib.lodashMod.__, accumulator: TResult, collection: T): LodashReduceRight3x6[T, TResult] = js.native
  def apply[T, TResult](callback: lodashLib.lodashMod.__, accumulator: TResult, collection: js.Array[T]): LodashReduceRight1x6[T, TResult] = js.native
  def apply[T, TResult](callback: lodashLib.lodashMod.__, accumulator: TResult, collection: lodashLib.lodashMod.List[T]): LodashReduceRight2x6[T, TResult] = js.native
}

