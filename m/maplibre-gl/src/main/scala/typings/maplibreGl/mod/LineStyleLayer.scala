package typings.maplibreGl.mod

import typings.mapboxPointGeometry.mod.^
import typings.mapboxVectorTile.mod.VectorTileFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "LineStyleLayer")
@js.native
open class LineStyleLayer protected ()
  extends StyleLayer
     with TypedStyleLayer {
  def this(layer: LayerSpecification) = this()
  
  @JSName("_transitionablePaint")
  var _transitionablePaint_LineStyleLayer: Transitionable[LinePaintProps] = js.native
  
  @JSName("_transitioningPaint")
  var _transitioningPaint_LineStyleLayer: Transitioning[LinePaintProps] = js.native
  
  @JSName("_unevaluatedLayout")
  var _unevaluatedLayout_LineStyleLayer: Layout[LineLayoutProps] = js.native
  
  def createBucket(parameters: BucketParameters[Any]): LineBucket = js.native
  
  def gradientExpression(): StylePropertyExpression = js.native
  
  var gradientVersion: Double = js.native
  
  @JSName("layout")
  var layout_LineStyleLayer: PossiblyEvaluated[LineLayoutProps, LineLayoutPropsPossiblyEvaluated] = js.native
  
  @JSName("paint")
  var paint_LineStyleLayer: PossiblyEvaluated[LinePaintProps, LinePaintPropsPossiblyEvaluated] = js.native
  
  @JSName("queryIntersectsFeature")
  def queryIntersectsFeature_MLineStyleLayer(
    queryGeometry: js.Array[^],
    feature: VectorTileFeature,
    featureState: FeatureState,
    geometry: js.Array[js.Array[^]],
    zoom: Double,
    transform: Transform,
    pixelsToTileUnits: Double
  ): Boolean = js.native
  
  @JSName("queryRadius")
  def queryRadius_MLineStyleLayer(bucket: Bucket): Double = js.native
  
  var stepInterpolant: Boolean = js.native
}
