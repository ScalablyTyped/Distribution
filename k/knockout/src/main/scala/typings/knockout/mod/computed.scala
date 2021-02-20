package typings.knockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computed {
  
  @JSImport("knockout", "computed")
  @js.native
  def apply[T](evaluator: ComputedReadFunction[T, Unit]): Computed_[T] = js.native
  @JSImport("knockout", "computed")
  @js.native
  def apply[T, TTarget](evaluator: ComputedReadFunction[T, TTarget], evaluatorTarget: TTarget): Computed_[T] = js.native
  @JSImport("knockout", "computed")
  @js.native
  def apply[T, TTarget](
    evaluator: ComputedReadFunction[T, TTarget],
    evaluatorTarget: TTarget,
    options: ComputedOptions[T, TTarget]
  ): Computed_[T] = js.native
  @JSImport("knockout", "computed")
  @js.native
  def apply[T, TTarget](options: ComputedOptions[T, TTarget]): Computed_[T] = js.native
  
  @JSImport("knockout", "computed.fn")
  @js.native
  val fn: ComputedFunctions[js.Any] = js.native
}
