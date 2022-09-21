package typings.maplibreGl.mod

import typings.mapboxPointGeometry.mod.^
import typings.mapboxVectorTile.mod.VectorTileFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "FillStyleLayer")
@js.native
open class FillStyleLayer protected ()
  extends StyleLayer
     with TypedStyleLayer {
  def this(layer: LayerSpecification) = this()
  
  @JSName("_transitionablePaint")
  var _transitionablePaint_FillStyleLayer: Transitionable[FillPaintProps] = js.native
  
  @JSName("_transitioningPaint")
  var _transitioningPaint_FillStyleLayer: Transitioning[FillPaintProps] = js.native
  
  @JSName("_unevaluatedLayout")
  var _unevaluatedLayout_FillStyleLayer: Layout[FillLayoutProps] = js.native
  
  def createBucket(parameters: BucketParameters[Any]): FillBucket = js.native
  
  @JSName("layout")
  var layout_FillStyleLayer: PossiblyEvaluated[FillLayoutProps, FillLayoutPropsPossiblyEvaluated] = js.native
  
  @JSName("paint")
  var paint_FillStyleLayer: PossiblyEvaluated[FillPaintProps, FillPaintPropsPossiblyEvaluated] = js.native
  
  @JSName("queryIntersectsFeature")
  def queryIntersectsFeature_MFillStyleLayer(
    queryGeometry: js.Array[^],
    feature: VectorTileFeature,
    featureState: FeatureState,
    geometry: js.Array[js.Array[^]],
    zoom: Double,
    transform: Transform,
    pixelsToTileUnits: Double
  ): Boolean = js.native
  
  @JSName("queryRadius")
  def queryRadius_MFillStyleLayer(): Double = js.native
}
