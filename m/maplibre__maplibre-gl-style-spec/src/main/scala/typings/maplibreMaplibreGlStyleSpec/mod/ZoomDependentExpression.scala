package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@maplibre/maplibre-gl-style-spec", "ZoomDependentExpression")
@js.native
open class ZoomDependentExpression[Kind /* <: EvaluationKind */] protected () extends StObject {
  def this(kind: Kind, expression: StyleExpression, zoomStops: js.Array[Double]) = this()
  def this(
    kind: Kind,
    expression: StyleExpression,
    zoomStops: js.Array[Double],
    interpolationType: InterpolationType
  ) = this()
  
  var _styleExpression: StyleExpression = js.native
  
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
  
  def interpolationFactor(input: Double, lower: Double, upper: Double): Double = js.native
  
  var interpolationType: InterpolationType = js.native
  
  var isStateDependent: Boolean = js.native
  
  var kind: Kind = js.native
  
  var zoomStops: js.Array[Double] = js.native
}
