package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "PropertyValue")
@js.native
open class PropertyValue[T, R] protected () extends StObject {
  def this(property: Property[T, R], value: scala.Unit) = this()
  def this(property: Property[T, R], value: PropertyValueSpecification[T]) = this()
  
  var expression: StylePropertyExpression = js.native
  
  def isDataDriven(): Boolean = js.native
  
  def possiblyEvaluate(parameters: EvaluationParameters): R = js.native
  def possiblyEvaluate(parameters: EvaluationParameters, canonical: scala.Unit, availableImages: js.Array[String]): R = js.native
  def possiblyEvaluate(parameters: EvaluationParameters, canonical: CanonicalTileID): R = js.native
  def possiblyEvaluate(parameters: EvaluationParameters, canonical: CanonicalTileID, availableImages: js.Array[String]): R = js.native
  
  var property: Property[T, R] = js.native
  
  var value: PropertyValueSpecification[T] | scala.Unit = js.native
}
