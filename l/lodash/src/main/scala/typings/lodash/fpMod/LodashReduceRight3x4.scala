package typings.lodash.fpMod

import typings.lodash.lodashMod.MemoIteratorCappedRight
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReduceRight3x4[T] extends js.Object {
  def apply[TResult](
    callback: MemoIteratorCappedRight[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ]
  ): LodashReduceRight3x5[TResult] = js.native
  def apply[TResult](
    callback: MemoIteratorCappedRight[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: TResult
  ): TResult = js.native
  def apply[TResult](callback: __, accumulator: TResult): LodashReduceRight3x6[T, TResult] = js.native
}

