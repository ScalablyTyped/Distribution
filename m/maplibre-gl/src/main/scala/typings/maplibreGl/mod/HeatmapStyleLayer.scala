package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "HeatmapStyleLayer")
@js.native
open class HeatmapStyleLayer protected ()
  extends StyleLayer
     with TypedStyleLayer {
  def this(layer: LayerSpecification) = this()
  
  @JSName("_transitionablePaint")
  var _transitionablePaint_HeatmapStyleLayer: Transitionable[HeatmapPaintProps] = js.native
  
  @JSName("_transitioningPaint")
  var _transitioningPaint_HeatmapStyleLayer: Transitioning[HeatmapPaintProps] = js.native
  
  def _updateColorRamp(): scala.Unit = js.native
  
  var colorRamp: RGBAImage = js.native
  
  var colorRampTexture: Texture = js.native
  
  def createBucket(options: Any): HeatmapBucket = js.native
  
  var heatmapFbo: Framebuffer = js.native
  
  @JSName("paint")
  var paint_HeatmapStyleLayer: PossiblyEvaluated[HeatmapPaintProps, HeatmapPaintPropsPossiblyEvaluated] = js.native
  
  @JSName("queryIntersectsFeature")
  def queryIntersectsFeature_MHeatmapStyleLayer(): Boolean = js.native
  
  @JSName("queryRadius")
  def queryRadius_MHeatmapStyleLayer(): Double = js.native
}
