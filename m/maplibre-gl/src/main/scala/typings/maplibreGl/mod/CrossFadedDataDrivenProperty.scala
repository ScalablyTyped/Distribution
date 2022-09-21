package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "CrossFadedDataDrivenProperty")
@js.native
open class CrossFadedDataDrivenProperty[T] protected () extends DataDrivenProperty[CrossFaded[T]] {
  def this(specification: StylePropertySpecification) = this()
  def this(specification: StylePropertySpecification, overrides: Any) = this()
  
  def _calculate(min: T, mid: T, max: T, parameters: EvaluationParameters): CrossFaded[T] = js.native
  
  def interpolate(a: PossiblyEvaluatedPropertyValue[CrossFaded[T]]): PossiblyEvaluatedPropertyValue[CrossFaded[T]] = js.native
}
