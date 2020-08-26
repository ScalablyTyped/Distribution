package typings.knockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "pureComputed")
@js.native
object pureComputed extends js.Object {
  def apply[T](evaluator: ComputedReadFunction[T, Unit]): PureComputed_[T] = js.native
  def apply[T, TTarget](evaluator: ComputedReadFunction[T, TTarget], evaluatorTarget: TTarget): PureComputed_[T] = js.native
  def apply[T, TTarget](options: ComputedOptions[T, TTarget]): PureComputed_[T] = js.native
}

