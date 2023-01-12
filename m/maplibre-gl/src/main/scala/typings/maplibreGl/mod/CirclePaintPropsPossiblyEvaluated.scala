package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.map
import typings.maplibreGl.maplibreGlStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CirclePaintPropsPossiblyEvaluated extends StObject {
  
  var `circle-blur`: PossiblyEvaluatedPropertyValue[Double]
  
  var `circle-color`: PossiblyEvaluatedPropertyValue[Color]
  
  var `circle-opacity`: PossiblyEvaluatedPropertyValue[Double]
  
  var `circle-pitch-alignment`: map | viewport
  
  var `circle-pitch-scale`: map | viewport
  
  var `circle-radius`: PossiblyEvaluatedPropertyValue[Double]
  
  var `circle-stroke-color`: PossiblyEvaluatedPropertyValue[Color]
  
  var `circle-stroke-opacity`: PossiblyEvaluatedPropertyValue[Double]
  
  var `circle-stroke-width`: PossiblyEvaluatedPropertyValue[Double]
  
  var `circle-translate`: js.Tuple2[Double, Double]
  
  var `circle-translate-anchor`: map | viewport
}
object CirclePaintPropsPossiblyEvaluated {
  
  inline def apply(
    `circle-blur`: PossiblyEvaluatedPropertyValue[Double],
    `circle-color`: PossiblyEvaluatedPropertyValue[Color],
    `circle-opacity`: PossiblyEvaluatedPropertyValue[Double],
    `circle-pitch-alignment`: map | viewport,
    `circle-pitch-scale`: map | viewport,
    `circle-radius`: PossiblyEvaluatedPropertyValue[Double],
    `circle-stroke-color`: PossiblyEvaluatedPropertyValue[Color],
    `circle-stroke-opacity`: PossiblyEvaluatedPropertyValue[Double],
    `circle-stroke-width`: PossiblyEvaluatedPropertyValue[Double],
    `circle-translate`: js.Tuple2[Double, Double],
    `circle-translate-anchor`: map | viewport
  ): CirclePaintPropsPossiblyEvaluated = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("circle-blur")(`circle-blur`.asInstanceOf[js.Any])
    __obj.updateDynamic("circle-color")(`circle-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("circle-opacity")(`circle-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("circle-pitch-alignment")(`circle-pitch-alignment`.asInstanceOf[js.Any])
    __obj.updateDynamic("circle-pitch-scale")(`circle-pitch-scale`.asInstanceOf[js.Any])
    __obj.updateDynamic("circle-radius")(`circle-radius`.asInstanceOf[js.Any])
    __obj.updateDynamic("circle-stroke-color")(`circle-stroke-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("circle-stroke-opacity")(`circle-stroke-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("circle-stroke-width")(`circle-stroke-width`.asInstanceOf[js.Any])
    __obj.updateDynamic("circle-translate")(`circle-translate`.asInstanceOf[js.Any])
    __obj.updateDynamic("circle-translate-anchor")(`circle-translate-anchor`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CirclePaintPropsPossiblyEvaluated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CirclePaintPropsPossiblyEvaluated] (val x: Self) extends AnyVal {
    
    inline def `setCircle-blur`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "circle-blur", value.asInstanceOf[js.Any])
    
    inline def `setCircle-color`(value: PossiblyEvaluatedPropertyValue[Color]): Self = StObject.set(x, "circle-color", value.asInstanceOf[js.Any])
    
    inline def `setCircle-opacity`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "circle-opacity", value.asInstanceOf[js.Any])
    
    inline def `setCircle-pitch-alignment`(value: map | viewport): Self = StObject.set(x, "circle-pitch-alignment", value.asInstanceOf[js.Any])
    
    inline def `setCircle-pitch-scale`(value: map | viewport): Self = StObject.set(x, "circle-pitch-scale", value.asInstanceOf[js.Any])
    
    inline def `setCircle-radius`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "circle-radius", value.asInstanceOf[js.Any])
    
    inline def `setCircle-stroke-color`(value: PossiblyEvaluatedPropertyValue[Color]): Self = StObject.set(x, "circle-stroke-color", value.asInstanceOf[js.Any])
    
    inline def `setCircle-stroke-opacity`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "circle-stroke-opacity", value.asInstanceOf[js.Any])
    
    inline def `setCircle-stroke-width`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "circle-stroke-width", value.asInstanceOf[js.Any])
    
    inline def `setCircle-translate`(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "circle-translate", value.asInstanceOf[js.Any])
    
    inline def `setCircle-translate-anchor`(value: map | viewport): Self = StObject.set(x, "circle-translate-anchor", value.asInstanceOf[js.Any])
  }
}
