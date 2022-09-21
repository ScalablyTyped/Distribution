package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "TransitionablePropertyValue")
@js.native
open class TransitionablePropertyValue[T, R] protected () extends StObject {
  def this(property: Property[T, R]) = this()
  
  var property: Property[T, R] = js.native
  
  var transition: TransitionSpecification | scala.Unit = js.native
  
  def transitioned(parameters: TransitionParameters, prior: TransitioningPropertyValue[T, R]): TransitioningPropertyValue[T, R] = js.native
  
  def untransitioned(): TransitioningPropertyValue[T, R] = js.native
  
  var value: PropertyValue[T, R] = js.native
}
