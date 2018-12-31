package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReduceRight1x2[TResult] extends js.Object {
  def apply[T](callback: lodashLib.lodashMod.underscoreNs.MemoIteratorCappedRight[T, TResult]): TResult = js.native
  def apply[T /* <: js.Object */](
    callback: lodashLib.lodashMod.underscoreNs.MemoIteratorCappedRight[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    collection: T
  ): TResult = js.native
  def apply[T](
    callback: lodashLib.lodashMod.underscoreNs.MemoIteratorCappedRight[T, TResult],
    collection: js.Array[T]
  ): TResult = js.native
  def apply[T](
    callback: lodashLib.lodashMod.underscoreNs.MemoIteratorCappedRight[T, TResult],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): TResult = js.native
  def apply[T /* <: js.Object */](callback: lodashLib.lodashMod.underscoreNs.`__`): LodashReduceRight3x6[T, TResult] = js.native
  def apply[T /* <: js.Object */](callback: lodashLib.lodashMod.underscoreNs.`__`, collection: T): LodashReduceRight3x6[T, TResult] = js.native
  def apply[T](callback: lodashLib.lodashMod.underscoreNs.`__`, collection: js.Array[T]): LodashReduceRight1x6[T, TResult] = js.native
  def apply[T](
    callback: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashReduceRight2x6[T, TResult] = js.native
}

