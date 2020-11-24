package typings.lodash.fpMod

import typings.lodash.mod.MemoIteratorCappedRight
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashReduceRight1x4[T] extends js.Object {
  
  def apply[TResult](callback: MemoIteratorCappedRight[T, TResult]): LodashReduceRight1x5[TResult] = js.native
  def apply[TResult](callback: MemoIteratorCappedRight[T, TResult], accumulator: TResult): TResult = js.native
  def apply[TResult](callback: __, accumulator: TResult): LodashReduceRight1x6[T, TResult] = js.native
}
