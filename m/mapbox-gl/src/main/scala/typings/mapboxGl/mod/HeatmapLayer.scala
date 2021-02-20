package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.heatmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeatmapLayer
  extends LayerBase
     with Layer {
  
  var layout: js.UndefOr[HeatmapLayout] = js.native
  
  var paint: js.UndefOr[HeatmapPaint] = js.native
  
  var `type`: heatmap = js.native
}
object HeatmapLayer {
  
  @scala.inline
  def apply(id: String, `type`: heatmap): HeatmapLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
