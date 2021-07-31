package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.heatmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatmapLayer
  extends StObject
     with LayerBase
     with Layer {
  
  var layout: js.UndefOr[HeatmapLayout] = js.undefined
  
  var paint: js.UndefOr[HeatmapPaint] = js.undefined
  
  var `type`: heatmap
}
object HeatmapLayer {
  
  @scala.inline
  def apply(id: String): HeatmapLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heatmap")
    __obj.asInstanceOf[HeatmapLayer]
  }
  
  @scala.inline
  implicit class HeatmapLayerMutableBuilder[Self <: HeatmapLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayout(value: HeatmapLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setPaint(value: HeatmapPaint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    @scala.inline
    def setType(value: heatmap): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
