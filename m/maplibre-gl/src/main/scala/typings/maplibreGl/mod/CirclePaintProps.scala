package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.map
import typings.maplibreGl.maplibreGlStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CirclePaintProps extends StObject {
  
  var `circle-blur`: DataDrivenProperty[Double]
  
  var `circle-color`: DataDrivenProperty[Color]
  
  var `circle-opacity`: DataDrivenProperty[Double]
  
  var `circle-pitch-alignment`: DataConstantProperty[map | viewport]
  
  var `circle-pitch-scale`: DataConstantProperty[map | viewport]
  
  var `circle-radius`: DataDrivenProperty[Double]
  
  var `circle-stroke-color`: DataDrivenProperty[Color]
  
  var `circle-stroke-opacity`: DataDrivenProperty[Double]
  
  var `circle-stroke-width`: DataDrivenProperty[Double]
  
  var `circle-translate`: DataConstantProperty[js.Tuple2[Double, Double]]
  
  var `circle-translate-anchor`: DataConstantProperty[map | viewport]
}
object CirclePaintProps {
  
  inline def apply(
    `circle-blur`: DataDrivenProperty[Double],
    `circle-color`: DataDrivenProperty[Color],
    `circle-opacity`: DataDrivenProperty[Double],
    `circle-pitch-alignment`: DataConstantProperty[map | viewport],
    `circle-pitch-scale`: DataConstantProperty[map | viewport],
    `circle-radius`: DataDrivenProperty[Double],
    `circle-stroke-color`: DataDrivenProperty[Color],
    `circle-stroke-opacity`: DataDrivenProperty[Double],
    `circle-stroke-width`: DataDrivenProperty[Double],
    `circle-translate`: DataConstantProperty[js.Tuple2[Double, Double]],
    `circle-translate-anchor`: DataConstantProperty[map | viewport]
  ): CirclePaintProps = {
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
    __obj.asInstanceOf[CirclePaintProps]
  }
  
  extension [Self <: CirclePaintProps](x: Self) {
    
    inline def `setCircle-blur`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "circle-blur", value.asInstanceOf[js.Any])
    
    inline def `setCircle-color`(value: DataDrivenProperty[Color]): Self = StObject.set(x, "circle-color", value.asInstanceOf[js.Any])
    
    inline def `setCircle-opacity`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "circle-opacity", value.asInstanceOf[js.Any])
    
    inline def `setCircle-pitch-alignment`(value: DataConstantProperty[map | viewport]): Self = StObject.set(x, "circle-pitch-alignment", value.asInstanceOf[js.Any])
    
    inline def `setCircle-pitch-scale`(value: DataConstantProperty[map | viewport]): Self = StObject.set(x, "circle-pitch-scale", value.asInstanceOf[js.Any])
    
    inline def `setCircle-radius`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "circle-radius", value.asInstanceOf[js.Any])
    
    inline def `setCircle-stroke-color`(value: DataDrivenProperty[Color]): Self = StObject.set(x, "circle-stroke-color", value.asInstanceOf[js.Any])
    
    inline def `setCircle-stroke-opacity`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "circle-stroke-opacity", value.asInstanceOf[js.Any])
    
    inline def `setCircle-stroke-width`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "circle-stroke-width", value.asInstanceOf[js.Any])
    
    inline def `setCircle-translate`(value: DataConstantProperty[js.Tuple2[Double, Double]]): Self = StObject.set(x, "circle-translate", value.asInstanceOf[js.Any])
    
    inline def `setCircle-translate-anchor`(value: DataConstantProperty[map | viewport]): Self = StObject.set(x, "circle-translate-anchor", value.asInstanceOf[js.Any])
  }
}
