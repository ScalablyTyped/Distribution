package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatmapPaintProps extends StObject {
  
  var `heatmap-color`: ColorRampProperty
  
  var `heatmap-intensity`: DataConstantProperty[Double]
  
  var `heatmap-opacity`: DataConstantProperty[Double]
  
  var `heatmap-radius`: DataDrivenProperty[Double]
  
  var `heatmap-weight`: DataDrivenProperty[Double]
}
object HeatmapPaintProps {
  
  inline def apply(
    `heatmap-color`: ColorRampProperty,
    `heatmap-intensity`: DataConstantProperty[Double],
    `heatmap-opacity`: DataConstantProperty[Double],
    `heatmap-radius`: DataDrivenProperty[Double],
    `heatmap-weight`: DataDrivenProperty[Double]
  ): HeatmapPaintProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("heatmap-color")(`heatmap-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("heatmap-intensity")(`heatmap-intensity`.asInstanceOf[js.Any])
    __obj.updateDynamic("heatmap-opacity")(`heatmap-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("heatmap-radius")(`heatmap-radius`.asInstanceOf[js.Any])
    __obj.updateDynamic("heatmap-weight")(`heatmap-weight`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapPaintProps]
  }
  
  extension [Self <: HeatmapPaintProps](x: Self) {
    
    inline def `setHeatmap-color`(value: ColorRampProperty): Self = StObject.set(x, "heatmap-color", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-intensity`(value: DataConstantProperty[Double]): Self = StObject.set(x, "heatmap-intensity", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-opacity`(value: DataConstantProperty[Double]): Self = StObject.set(x, "heatmap-opacity", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-radius`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "heatmap-radius", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-weight`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "heatmap-weight", value.asInstanceOf[js.Any])
  }
}
