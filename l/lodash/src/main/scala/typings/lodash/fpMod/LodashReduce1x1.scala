package typings.lodash.fpMod

import typings.lodash.lodashMod.List
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReduce1x1[T, TResult] extends js.Object {
  def apply(accumulator: TResult): LodashReduce1x3[T, TResult] = js.native
  def apply(accumulator: TResult, collection: js.Array[T]): TResult = js.native
  def apply(accumulator: TResult, collection: List[T]): TResult = js.native
  def apply(accumulator: __): LodashReduce2x5[TResult] = js.native
  def apply(accumulator: __, collection: js.Array[T]): LodashReduce1x5[TResult] = js.native
  def apply(accumulator: __, collection: List[T]): LodashReduce2x5[TResult] = js.native
}

