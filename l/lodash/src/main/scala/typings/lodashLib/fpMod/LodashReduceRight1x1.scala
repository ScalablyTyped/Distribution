package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReduceRight1x1[T, TResult] extends js.Object {
  def apply(accumulator: TResult): LodashReduceRight1x3[T, TResult] = js.native
  def apply(accumulator: TResult, collection: js.Array[T]): TResult = js.native
  def apply(accumulator: TResult, collection: lodashLib.lodashMod.List[T]): TResult = js.native
  def apply(accumulator: lodashLib.lodashMod.__): LodashReduceRight2x5[TResult] = js.native
  def apply(accumulator: lodashLib.lodashMod.__, collection: js.Array[T]): LodashReduceRight1x5[TResult] = js.native
  def apply(accumulator: lodashLib.lodashMod.__, collection: lodashLib.lodashMod.List[T]): LodashReduceRight2x5[TResult] = js.native
}

