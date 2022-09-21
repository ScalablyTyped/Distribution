package typings.maplibreGl.styleSpecMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleExpression extends StObject {
  
  var _defaultValue: Value = js.native
  
  var _enumValues: StringDictionary[Any] = js.native
  
  var _evaluator: EvaluationContext = js.native
  
  var _warningHistory: StringDictionary[Boolean] = js.native
  
  def evaluate(globals: GlobalProperties): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Unit,
    featureState: Unit,
    canonical: Unit,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Unit,
    featureState: Unit,
    canonical: Unit,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Unit,
    featureState: Unit,
    canonical: Unit,
    availableImages: Unit,
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluate(globals: GlobalProperties, feature: Unit, featureState: Unit, canonical: CanonicalTileID): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Unit,
    featureState: Unit,
    canonical: CanonicalTileID,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Unit,
    featureState: Unit,
    canonical: CanonicalTileID,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Unit,
    featureState: Unit,
    canonical: CanonicalTileID,
    availableImages: Unit,
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluate(globals: GlobalProperties, feature: Unit, featureState: FeatureState): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Unit,
    featureState: FeatureState,
    canonical: Unit,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Unit,
    featureState: FeatureState,
    canonical: Unit,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Unit,
    featureState: FeatureState,
    canonical: Unit,
    availableImages: Unit,
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluate(globals: GlobalProperties, feature: Unit, featureState: FeatureState, canonical: CanonicalTileID): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Unit,
    featureState: FeatureState,
    canonical: CanonicalTileID,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Unit,
    featureState: FeatureState,
    canonical: CanonicalTileID,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Unit,
    featureState: FeatureState,
    canonical: CanonicalTileID,
    availableImages: Unit,
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluate(globals: GlobalProperties, feature: Feature): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: Unit,
    canonical: Unit,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: Unit,
    canonical: Unit,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: Unit,
    canonical: Unit,
    availableImages: Unit,
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluate(globals: GlobalProperties, feature: Feature, featureState: Unit, canonical: CanonicalTileID): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: Unit,
    canonical: CanonicalTileID,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: Unit,
    canonical: CanonicalTileID,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: Unit,
    canonical: CanonicalTileID,
    availableImages: Unit,
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluate(globals: GlobalProperties, feature: Feature, featureState: FeatureState): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: FeatureState,
    canonical: Unit,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: FeatureState,
    canonical: Unit,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: FeatureState,
    canonical: Unit,
    availableImages: Unit,
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: FeatureState,
    canonical: CanonicalTileID
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: FeatureState,
    canonical: CanonicalTileID,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: FeatureState,
    canonical: CanonicalTileID,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: FeatureState,
    canonical: CanonicalTileID,
    availableImages: Unit,
    formattedSection: FormattedSection
  ): Any = js.native
  
  def evaluateWithoutErrorHandling(globals: GlobalProperties): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Unit,
    featureState: Unit,
    canonical: Unit,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Unit,
    featureState: Unit,
    canonical: Unit,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Unit,
    featureState: Unit,
    canonical: Unit,
    availableImages: Unit,
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluateWithoutErrorHandling(globals: GlobalProperties, feature: Unit, featureState: Unit, canonical: CanonicalTileID): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Unit,
    featureState: Unit,
    canonical: CanonicalTileID,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Unit,
    featureState: Unit,
    canonical: CanonicalTileID,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Unit,
    featureState: Unit,
    canonical: CanonicalTileID,
    availableImages: Unit,
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluateWithoutErrorHandling(globals: GlobalProperties, feature: Unit, featureState: FeatureState): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Unit,
    featureState: FeatureState,
    canonical: Unit,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Unit,
    featureState: FeatureState,
    canonical: Unit,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Unit,
    featureState: FeatureState,
    canonical: Unit,
    availableImages: Unit,
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluateWithoutErrorHandling(globals: GlobalProperties, feature: Unit, featureState: FeatureState, canonical: CanonicalTileID): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Unit,
    featureState: FeatureState,
    canonical: CanonicalTileID,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Unit,
    featureState: FeatureState,
    canonical: CanonicalTileID,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Unit,
    featureState: FeatureState,
    canonical: CanonicalTileID,
    availableImages: Unit,
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluateWithoutErrorHandling(globals: GlobalProperties, feature: Feature): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Feature,
    featureState: Unit,
    canonical: Unit,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Feature,
    featureState: Unit,
    canonical: Unit,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Feature,
    featureState: Unit,
    canonical: Unit,
    availableImages: Unit,
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluateWithoutErrorHandling(globals: GlobalProperties, feature: Feature, featureState: Unit, canonical: CanonicalTileID): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Feature,
    featureState: Unit,
    canonical: CanonicalTileID,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Feature,
    featureState: Unit,
    canonical: CanonicalTileID,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Feature,
    featureState: Unit,
    canonical: CanonicalTileID,
    availableImages: Unit,
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluateWithoutErrorHandling(globals: GlobalProperties, feature: Feature, featureState: FeatureState): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Feature,
    featureState: FeatureState,
    canonical: Unit,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Feature,
    featureState: FeatureState,
    canonical: Unit,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Feature,
    featureState: FeatureState,
    canonical: Unit,
    availableImages: Unit,
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Feature,
    featureState: FeatureState,
    canonical: CanonicalTileID
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Feature,
    featureState: FeatureState,
    canonical: CanonicalTileID,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Feature,
    featureState: FeatureState,
    canonical: CanonicalTileID,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Feature,
    featureState: FeatureState,
    canonical: CanonicalTileID,
    availableImages: Unit,
    formattedSection: FormattedSection
  ): Any = js.native
  
  var expression: Expression_ = js.native
}
