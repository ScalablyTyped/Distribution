package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReduce1x4[T] extends js.Object {
  def apply[TResult](callback: lodashLib.lodashMod.MemoIteratorCapped[T, TResult]): LodashReduce1x5[TResult] = js.native
  def apply[TResult](callback: lodashLib.lodashMod.MemoIteratorCapped[T, TResult], accumulator: TResult): TResult = js.native
  def apply[TResult](callback: lodashLib.lodashMod.__, accumulator: TResult): LodashReduce1x6[T, TResult] = js.native
}

