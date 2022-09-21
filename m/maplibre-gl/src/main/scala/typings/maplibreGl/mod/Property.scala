package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Property[T, R] extends StObject {
  
  def interpolate(a: R, b: R, t: Double): R = js.native
  
  def possiblyEvaluate(value: PropertyValue[T, R], parameters: EvaluationParameters): R = js.native
  def possiblyEvaluate(
    value: PropertyValue[T, R],
    parameters: EvaluationParameters,
    canonical: scala.Unit,
    availableImages: js.Array[String]
  ): R = js.native
  def possiblyEvaluate(value: PropertyValue[T, R], parameters: EvaluationParameters, canonical: CanonicalTileID): R = js.native
  def possiblyEvaluate(
    value: PropertyValue[T, R],
    parameters: EvaluationParameters,
    canonical: CanonicalTileID,
    availableImages: js.Array[String]
  ): R = js.native
  
  var specification: StylePropertySpecification = js.native
}
