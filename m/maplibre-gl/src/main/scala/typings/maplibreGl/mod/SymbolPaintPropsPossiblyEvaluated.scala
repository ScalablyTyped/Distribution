package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.map
import typings.maplibreGl.maplibreGlStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolPaintPropsPossiblyEvaluated extends StObject {
  
  var `icon-color`: PossiblyEvaluatedPropertyValue[Color]
  
  var `icon-halo-blur`: PossiblyEvaluatedPropertyValue[Double]
  
  var `icon-halo-color`: PossiblyEvaluatedPropertyValue[Color]
  
  var `icon-halo-width`: PossiblyEvaluatedPropertyValue[Double]
  
  var `icon-opacity`: PossiblyEvaluatedPropertyValue[Double]
  
  var `icon-translate`: js.Tuple2[Double, Double]
  
  var `icon-translate-anchor`: map | viewport
  
  var `text-color`: PossiblyEvaluatedPropertyValue[Color]
  
  var `text-halo-blur`: PossiblyEvaluatedPropertyValue[Double]
  
  var `text-halo-color`: PossiblyEvaluatedPropertyValue[Color]
  
  var `text-halo-width`: PossiblyEvaluatedPropertyValue[Double]
  
  var `text-opacity`: PossiblyEvaluatedPropertyValue[Double]
  
  var `text-translate`: js.Tuple2[Double, Double]
  
  var `text-translate-anchor`: map | viewport
}
object SymbolPaintPropsPossiblyEvaluated {
  
  inline def apply(
    `icon-color`: PossiblyEvaluatedPropertyValue[Color],
    `icon-halo-blur`: PossiblyEvaluatedPropertyValue[Double],
    `icon-halo-color`: PossiblyEvaluatedPropertyValue[Color],
    `icon-halo-width`: PossiblyEvaluatedPropertyValue[Double],
    `icon-opacity`: PossiblyEvaluatedPropertyValue[Double],
    `icon-translate`: js.Tuple2[Double, Double],
    `icon-translate-anchor`: map | viewport,
    `text-color`: PossiblyEvaluatedPropertyValue[Color],
    `text-halo-blur`: PossiblyEvaluatedPropertyValue[Double],
    `text-halo-color`: PossiblyEvaluatedPropertyValue[Color],
    `text-halo-width`: PossiblyEvaluatedPropertyValue[Double],
    `text-opacity`: PossiblyEvaluatedPropertyValue[Double],
    `text-translate`: js.Tuple2[Double, Double],
    `text-translate-anchor`: map | viewport
  ): SymbolPaintPropsPossiblyEvaluated = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("icon-color")(`icon-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("icon-halo-blur")(`icon-halo-blur`.asInstanceOf[js.Any])
    __obj.updateDynamic("icon-halo-color")(`icon-halo-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("icon-halo-width")(`icon-halo-width`.asInstanceOf[js.Any])
    __obj.updateDynamic("icon-opacity")(`icon-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("icon-translate")(`icon-translate`.asInstanceOf[js.Any])
    __obj.updateDynamic("icon-translate-anchor")(`icon-translate-anchor`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-color")(`text-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-halo-blur")(`text-halo-blur`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-halo-color")(`text-halo-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-halo-width")(`text-halo-width`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-opacity")(`text-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-translate")(`text-translate`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-translate-anchor")(`text-translate-anchor`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolPaintPropsPossiblyEvaluated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SymbolPaintPropsPossiblyEvaluated] (val x: Self) extends AnyVal {
    
    inline def `setIcon-color`(value: PossiblyEvaluatedPropertyValue[Color]): Self = StObject.set(x, "icon-color", value.asInstanceOf[js.Any])
    
    inline def `setIcon-halo-blur`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "icon-halo-blur", value.asInstanceOf[js.Any])
    
    inline def `setIcon-halo-color`(value: PossiblyEvaluatedPropertyValue[Color]): Self = StObject.set(x, "icon-halo-color", value.asInstanceOf[js.Any])
    
    inline def `setIcon-halo-width`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "icon-halo-width", value.asInstanceOf[js.Any])
    
    inline def `setIcon-opacity`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "icon-opacity", value.asInstanceOf[js.Any])
    
    inline def `setIcon-translate`(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "icon-translate", value.asInstanceOf[js.Any])
    
    inline def `setIcon-translate-anchor`(value: map | viewport): Self = StObject.set(x, "icon-translate-anchor", value.asInstanceOf[js.Any])
    
    inline def `setText-color`(value: PossiblyEvaluatedPropertyValue[Color]): Self = StObject.set(x, "text-color", value.asInstanceOf[js.Any])
    
    inline def `setText-halo-blur`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "text-halo-blur", value.asInstanceOf[js.Any])
    
    inline def `setText-halo-color`(value: PossiblyEvaluatedPropertyValue[Color]): Self = StObject.set(x, "text-halo-color", value.asInstanceOf[js.Any])
    
    inline def `setText-halo-width`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "text-halo-width", value.asInstanceOf[js.Any])
    
    inline def `setText-opacity`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "text-opacity", value.asInstanceOf[js.Any])
    
    inline def `setText-translate`(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "text-translate", value.asInstanceOf[js.Any])
    
    inline def `setText-translate-anchor`(value: map | viewport): Self = StObject.set(x, "text-translate-anchor", value.asInstanceOf[js.Any])
  }
}
