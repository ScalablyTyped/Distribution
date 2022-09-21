package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "DataDrivenProperty")
@js.native
open class DataDrivenProperty[T] protected ()
  extends StObject
     with Property[T, PossiblyEvaluatedPropertyValue[T]] {
  def this(specification: StylePropertySpecification) = this()
  def this(specification: StylePropertySpecification, overrides: Any) = this()
  
  def evaluate(
    value: PossiblyEvaluatedValue[T],
    parameters: EvaluationParameters,
    feature: Feature,
    featureState: FeatureState
  ): T = js.native
  def evaluate(
    value: PossiblyEvaluatedValue[T],
    parameters: EvaluationParameters,
    feature: Feature,
    featureState: FeatureState,
    canonical: scala.Unit,
    availableImages: js.Array[String]
  ): T = js.native
  def evaluate(
    value: PossiblyEvaluatedValue[T],
    parameters: EvaluationParameters,
    feature: Feature,
    featureState: FeatureState,
    canonical: CanonicalTileID
  ): T = js.native
  def evaluate(
    value: PossiblyEvaluatedValue[T],
    parameters: EvaluationParameters,
    feature: Feature,
    featureState: FeatureState,
    canonical: CanonicalTileID,
    availableImages: js.Array[String]
  ): T = js.native
  
  var overrides: Any = js.native
}
