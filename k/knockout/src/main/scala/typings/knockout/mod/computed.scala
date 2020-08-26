package typings.knockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "computed")
@js.native
object computed extends js.Object {
  val fn: ComputedFunctions[js.Any] = js.native
  def apply[T](evaluator: ComputedReadFunction[T, Unit]): Computed_[T] = js.native
  def apply[T, TTarget](evaluator: ComputedReadFunction[T, TTarget], evaluatorTarget: TTarget): Computed_[T] = js.native
  def apply[T, TTarget](
    evaluator: ComputedReadFunction[T, TTarget],
    evaluatorTarget: TTarget,
    options: ComputedOptions[T, TTarget]
  ): Computed_[T] = js.native
  def apply[T, TTarget](options: ComputedOptions[T, TTarget]): Computed_[T] = js.native
}

