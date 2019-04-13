package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReduceRight1x2[TResult] extends js.Object {
  def apply[T](callback: lodashLib.lodashMod.MemoIteratorCappedRight[T, TResult]): LodashReduceRight1x3[T, TResult] = js.native
  def apply[T /* <: js.Object */](
    callback: lodashLib.lodashMod.MemoIteratorCappedRight[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    collection: T
  ): TResult = js.native
  def apply[T](callback: lodashLib.lodashMod.MemoIteratorCappedRight[T, TResult], collection: js.Array[T]): TResult = js.native
  def apply[T](
    callback: lodashLib.lodashMod.MemoIteratorCappedRight[T, TResult],
    collection: lodashLib.lodashMod.List[T]
  ): TResult = js.native
  def apply[T](callback: lodashLib.lodashMod.__): LodashReduceRight2x6[T, TResult] = js.native
  def apply[T /* <: js.Object */](callback: lodashLib.lodashMod.__, collection: T): LodashReduceRight3x6[T, TResult] = js.native
  def apply[T](callback: lodashLib.lodashMod.__, collection: js.Array[T]): LodashReduceRight1x6[T, TResult] = js.native
  def apply[T](callback: lodashLib.lodashMod.__, collection: lodashLib.lodashMod.List[T]): LodashReduceRight2x6[T, TResult] = js.native
}

