package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "TransitioningPropertyValue")
@js.native
open class TransitioningPropertyValue[T, R] protected () extends StObject {
  def this(
    property: Property[T, R],
    value: PropertyValue[T, R],
    prior: TransitioningPropertyValue[T, R],
    transition: TransitionSpecification,
    now: TimePoint
  ) = this()
  
  var begin: TimePoint = js.native
  
  var end: TimePoint = js.native
  
  def possiblyEvaluate(parameters: EvaluationParameters, canonical: CanonicalTileID, availableImages: js.Array[String]): R = js.native
  
  var prior: TransitioningPropertyValue[T, R] = js.native
  
  var property: Property[T, R] = js.native
  
  var value: PropertyValue[T, R] = js.native
}
