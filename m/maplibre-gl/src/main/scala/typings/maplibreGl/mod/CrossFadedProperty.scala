package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "CrossFadedProperty")
@js.native
open class CrossFadedProperty[T] protected ()
  extends StObject
     with Property[T, CrossFaded[T]] {
  def this(specification: StylePropertySpecification) = this()
  
  def _calculate(min: T, mid: T, max: T, parameters: EvaluationParameters): CrossFaded[T] = js.native
  
  def interpolate(): CrossFaded[T] = js.native
  def interpolate(a: CrossFaded[T]): CrossFaded[T] = js.native
}
