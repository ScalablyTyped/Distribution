package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatmapPaintPropsPossiblyEvaluated extends StObject {
  
  var `heatmap-color`: ColorRampProperty
  
  var `heatmap-intensity`: Double
  
  var `heatmap-opacity`: Double
  
  var `heatmap-radius`: PossiblyEvaluatedPropertyValue[Double]
  
  var `heatmap-weight`: PossiblyEvaluatedPropertyValue[Double]
}
object HeatmapPaintPropsPossiblyEvaluated {
  
  inline def apply(
    `heatmap-color`: ColorRampProperty,
    `heatmap-intensity`: Double,
    `heatmap-opacity`: Double,
    `heatmap-radius`: PossiblyEvaluatedPropertyValue[Double],
    `heatmap-weight`: PossiblyEvaluatedPropertyValue[Double]
  ): HeatmapPaintPropsPossiblyEvaluated = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("heatmap-color")(`heatmap-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("heatmap-intensity")(`heatmap-intensity`.asInstanceOf[js.Any])
    __obj.updateDynamic("heatmap-opacity")(`heatmap-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("heatmap-radius")(`heatmap-radius`.asInstanceOf[js.Any])
    __obj.updateDynamic("heatmap-weight")(`heatmap-weight`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapPaintPropsPossiblyEvaluated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeatmapPaintPropsPossiblyEvaluated] (val x: Self) extends AnyVal {
    
    inline def `setHeatmap-color`(value: ColorRampProperty): Self = StObject.set(x, "heatmap-color", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-intensity`(value: Double): Self = StObject.set(x, "heatmap-intensity", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-opacity`(value: Double): Self = StObject.set(x, "heatmap-opacity", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-radius`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "heatmap-radius", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-weight`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "heatmap-weight", value.asInstanceOf[js.Any])
  }
}
