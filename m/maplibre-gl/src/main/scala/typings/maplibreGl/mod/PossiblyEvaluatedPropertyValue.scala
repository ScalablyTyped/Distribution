package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "PossiblyEvaluatedPropertyValue")
@js.native
open class PossiblyEvaluatedPropertyValue[T] protected () extends StObject {
  def this(
    property: DataDrivenProperty[T],
    value: PossiblyEvaluatedValue[T],
    parameters: EvaluationParameters
  ) = this()
  
  def constantOr(value: T): T = js.native
  
  def evaluate(feature: Feature, featureState: FeatureState): T = js.native
  def evaluate(
    feature: Feature,
    featureState: FeatureState,
    canonical: scala.Unit,
    availableImages: js.Array[String]
  ): T = js.native
  def evaluate(feature: Feature, featureState: FeatureState, canonical: CanonicalTileID): T = js.native
  def evaluate(
    feature: Feature,
    featureState: FeatureState,
    canonical: CanonicalTileID,
    availableImages: js.Array[String]
  ): T = js.native
  
  def isConstant(): Boolean = js.native
  
  var parameters: EvaluationParameters = js.native
  
  var property: DataDrivenProperty[T] = js.native
  
  var value: PossiblyEvaluatedValue[T] = js.native
}
