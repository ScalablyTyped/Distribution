package typings.lodash.fpMod

import typings.lodash.mod.MemoIteratorCapped
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashReduce1x4[T] extends js.Object {
  def apply[TResult](callback: MemoIteratorCapped[T, TResult]): LodashReduce1x5[TResult] = js.native
  def apply[TResult](callback: MemoIteratorCapped[T, TResult], accumulator: TResult): TResult = js.native
  def apply[TResult](callback: __, accumulator: TResult): LodashReduce1x6[T, TResult] = js.native
}

