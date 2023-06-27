package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@maplibre/maplibre-gl-style-spec", "StyleExpression")
@js.native
open class StyleExpression protected () extends StObject {
  def this(expression: Expression_) = this()
  def this(expression: Expression_, propertySpec: StylePropertySpecification) = this()
  
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
  def evaluate(globals: GlobalProperties, feature: Unit, featureState: Unit, canonical: ICanonicalTileID): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Unit,
    featureState: Unit,
    canonical: ICanonicalTileID,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Unit,
    featureState: Unit,
    canonical: ICanonicalTileID,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Unit,
    featureState: Unit,
    canonical: ICanonicalTileID,
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
  def evaluate(globals: GlobalProperties, feature: Unit, featureState: FeatureState, canonical: ICanonicalTileID): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Unit,
    featureState: FeatureState,
    canonical: ICanonicalTileID,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Unit,
    featureState: FeatureState,
    canonical: ICanonicalTileID,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Unit,
    featureState: FeatureState,
    canonical: ICanonicalTileID,
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
  def evaluate(globals: GlobalProperties, feature: Feature, featureState: Unit, canonical: ICanonicalTileID): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: Unit,
    canonical: ICanonicalTileID,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: Unit,
    canonical: ICanonicalTileID,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: Unit,
    canonical: ICanonicalTileID,
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
    canonical: ICanonicalTileID
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: FeatureState,
    canonical: ICanonicalTileID,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: FeatureState,
    canonical: ICanonicalTileID,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: FeatureState,
    canonical: ICanonicalTileID,
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
  def evaluateWithoutErrorHandling(globals: GlobalProperties, feature: Unit, featureState: Unit, canonical: ICanonicalTileID): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Unit,
    featureState: Unit,
    canonical: ICanonicalTileID,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Unit,
    featureState: Unit,
    canonical: ICanonicalTileID,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Unit,
    featureState: Unit,
    canonical: ICanonicalTileID,
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
  def evaluateWithoutErrorHandling(globals: GlobalProperties, feature: Unit, featureState: FeatureState, canonical: ICanonicalTileID): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Unit,
    featureState: FeatureState,
    canonical: ICanonicalTileID,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Unit,
    featureState: FeatureState,
    canonical: ICanonicalTileID,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Unit,
    featureState: FeatureState,
    canonical: ICanonicalTileID,
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
  def evaluateWithoutErrorHandling(globals: GlobalProperties, feature: Feature, featureState: Unit, canonical: ICanonicalTileID): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Feature,
    featureState: Unit,
    canonical: ICanonicalTileID,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Feature,
    featureState: Unit,
    canonical: ICanonicalTileID,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Feature,
    featureState: Unit,
    canonical: ICanonicalTileID,
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
    canonical: ICanonicalTileID
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Feature,
    featureState: FeatureState,
    canonical: ICanonicalTileID,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Feature,
    featureState: FeatureState,
    canonical: ICanonicalTileID,
    availableImages: js.Array[String],
    formattedSection: FormattedSection
  ): Any = js.native
  def evaluateWithoutErrorHandling(
    globals: GlobalProperties,
    feature: Feature,
    featureState: FeatureState,
    canonical: ICanonicalTileID,
    availableImages: Unit,
    formattedSection: FormattedSection
  ): Any = js.native
  
  var expression: Expression_ = js.native
}
