package typings.knockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computed {
  
  inline def apply[T](evaluator: ComputedReadFunction[T, Unit]): Computed_[T] = ^.asInstanceOf[js.Dynamic].apply(evaluator.asInstanceOf[js.Any]).asInstanceOf[Computed_[T]]
  inline def apply[T, TTarget](evaluator: ComputedReadFunction[T, TTarget], evaluatorTarget: TTarget): Computed_[T] = (^.asInstanceOf[js.Dynamic].apply(evaluator.asInstanceOf[js.Any], evaluatorTarget.asInstanceOf[js.Any])).asInstanceOf[Computed_[T]]
  inline def apply[T, TTarget](
    evaluator: ComputedReadFunction[T, TTarget],
    evaluatorTarget: TTarget,
    options: ComputedOptions[T, TTarget]
  ): Computed_[T] = (^.asInstanceOf[js.Dynamic].apply(evaluator.asInstanceOf[js.Any], evaluatorTarget.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Computed_[T]]
  inline def apply[T, TTarget](options: ComputedOptions[T, TTarget]): Computed_[T] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Computed_[T]]
  
  @JSImport("knockout", "computed")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("knockout", "computed.fn")
  @js.native
  val fn: ComputedFunctions[Any] = js.native
}
