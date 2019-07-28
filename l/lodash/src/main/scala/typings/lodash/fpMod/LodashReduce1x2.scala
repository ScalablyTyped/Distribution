package typings.lodash.fpMod

import typings.lodash.lodashMod.List
import typings.lodash.lodashMod.MemoIteratorCapped
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReduce1x2[TResult] extends js.Object {
  def apply[T /* <: js.Object */](
    callback: MemoIteratorCapped[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ]
  ): LodashReduce3x3[T, TResult] = js.native
  def apply[T /* <: js.Object */](
    callback: MemoIteratorCapped[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    collection: T
  ): TResult = js.native
  def apply[T](callback: MemoIteratorCapped[T, TResult], collection: js.Array[T]): TResult = js.native
  def apply[T](callback: MemoIteratorCapped[T, TResult], collection: List[T]): TResult = js.native
  def apply[T /* <: js.Object */](callback: __): LodashReduce3x6[T, TResult] = js.native
  def apply[T /* <: js.Object */](callback: __, collection: T): LodashReduce3x6[T, TResult] = js.native
  def apply[T](callback: __, collection: js.Array[T]): LodashReduce1x6[T, TResult] = js.native
  def apply[T](callback: __, collection: List[T]): LodashReduce2x6[T, TResult] = js.native
}

