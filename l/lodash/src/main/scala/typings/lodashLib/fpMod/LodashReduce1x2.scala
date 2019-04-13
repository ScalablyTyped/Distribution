package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReduce1x2[TResult] extends js.Object {
  def apply[T /* <: js.Object */](
    callback: lodashLib.lodashMod.MemoIteratorCapped[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ]
  ): LodashReduce3x3[T, TResult] = js.native
  def apply[T /* <: js.Object */](
    callback: lodashLib.lodashMod.MemoIteratorCapped[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    collection: T
  ): TResult = js.native
  def apply[T](callback: lodashLib.lodashMod.MemoIteratorCapped[T, TResult], collection: js.Array[T]): TResult = js.native
  def apply[T](
    callback: lodashLib.lodashMod.MemoIteratorCapped[T, TResult],
    collection: lodashLib.lodashMod.List[T]
  ): TResult = js.native
  def apply[T /* <: js.Object */](callback: lodashLib.lodashMod.__): LodashReduce3x6[T, TResult] = js.native
  def apply[T /* <: js.Object */](callback: lodashLib.lodashMod.__, collection: T): LodashReduce3x6[T, TResult] = js.native
  def apply[T](callback: lodashLib.lodashMod.__, collection: js.Array[T]): LodashReduce1x6[T, TResult] = js.native
  def apply[T](callback: lodashLib.lodashMod.__, collection: lodashLib.lodashMod.List[T]): LodashReduce2x6[T, TResult] = js.native
}

