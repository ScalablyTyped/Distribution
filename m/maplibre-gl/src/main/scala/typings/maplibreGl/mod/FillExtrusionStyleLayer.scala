package typings.maplibreGl.mod

import typings.glMatrix.mod.mat4
import typings.mapboxPointGeometry.mod.^
import typings.mapboxVectorTile.mod.VectorTileFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "FillExtrusionStyleLayer")
@js.native
open class FillExtrusionStyleLayer protected ()
  extends StyleLayer
     with TypedStyleLayer {
  def this(layer: LayerSpecification) = this()
  
  @JSName("_transitionablePaint")
  var _transitionablePaint_FillExtrusionStyleLayer: Transitionable[FillExtrusionPaintProps] = js.native
  
  @JSName("_transitioningPaint")
  var _transitioningPaint_FillExtrusionStyleLayer: Transitioning[FillExtrusionPaintProps] = js.native
  
  def createBucket(parameters: BucketParameters[FillExtrusionStyleLayer]): FillExtrusionBucket = js.native
  
  @JSName("paint")
  var paint_FillExtrusionStyleLayer: PossiblyEvaluated[FillExtrusionPaintProps, FillExtrusionPaintPropsPossiblyEvaluated] = js.native
  
  @JSName("queryIntersectsFeature")
  def queryIntersectsFeature_MFillExtrusionStyleLayer(
    queryGeometry: js.Array[^],
    feature: VectorTileFeature,
    featureState: FeatureState,
    geometry: js.Array[js.Array[^]],
    zoom: Double,
    transform: Transform,
    pixelsToTileUnits: Double,
    pixelPosMatrix: mat4
  ): Boolean | Double = js.native
  
  @JSName("queryRadius")
  def queryRadius_MFillExtrusionStyleLayer(): Double = js.native
}
