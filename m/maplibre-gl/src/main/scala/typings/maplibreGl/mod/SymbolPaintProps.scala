package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.map
import typings.maplibreGl.maplibreGlStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolPaintProps extends StObject {
  
  var `icon-color`: DataDrivenProperty[Color]
  
  var `icon-halo-blur`: DataDrivenProperty[Double]
  
  var `icon-halo-color`: DataDrivenProperty[Color]
  
  var `icon-halo-width`: DataDrivenProperty[Double]
  
  var `icon-opacity`: DataDrivenProperty[Double]
  
  var `icon-translate`: DataConstantProperty[js.Tuple2[Double, Double]]
  
  var `icon-translate-anchor`: DataConstantProperty[map | viewport]
  
  var `text-color`: DataDrivenProperty[Color]
  
  var `text-halo-blur`: DataDrivenProperty[Double]
  
  var `text-halo-color`: DataDrivenProperty[Color]
  
  var `text-halo-width`: DataDrivenProperty[Double]
  
  var `text-opacity`: DataDrivenProperty[Double]
  
  var `text-translate`: DataConstantProperty[js.Tuple2[Double, Double]]
  
  var `text-translate-anchor`: DataConstantProperty[map | viewport]
}
object SymbolPaintProps {
  
  inline def apply(
    `icon-color`: DataDrivenProperty[Color],
    `icon-halo-blur`: DataDrivenProperty[Double],
    `icon-halo-color`: DataDrivenProperty[Color],
    `icon-halo-width`: DataDrivenProperty[Double],
    `icon-opacity`: DataDrivenProperty[Double],
    `icon-translate`: DataConstantProperty[js.Tuple2[Double, Double]],
    `icon-translate-anchor`: DataConstantProperty[map | viewport],
    `text-color`: DataDrivenProperty[Color],
    `text-halo-blur`: DataDrivenProperty[Double],
    `text-halo-color`: DataDrivenProperty[Color],
    `text-halo-width`: DataDrivenProperty[Double],
    `text-opacity`: DataDrivenProperty[Double],
    `text-translate`: DataConstantProperty[js.Tuple2[Double, Double]],
    `text-translate-anchor`: DataConstantProperty[map | viewport]
  ): SymbolPaintProps = {
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
    __obj.asInstanceOf[SymbolPaintProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SymbolPaintProps] (val x: Self) extends AnyVal {
    
    inline def `setIcon-color`(value: DataDrivenProperty[Color]): Self = StObject.set(x, "icon-color", value.asInstanceOf[js.Any])
    
    inline def `setIcon-halo-blur`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "icon-halo-blur", value.asInstanceOf[js.Any])
    
    inline def `setIcon-halo-color`(value: DataDrivenProperty[Color]): Self = StObject.set(x, "icon-halo-color", value.asInstanceOf[js.Any])
    
    inline def `setIcon-halo-width`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "icon-halo-width", value.asInstanceOf[js.Any])
    
    inline def `setIcon-opacity`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "icon-opacity", value.asInstanceOf[js.Any])
    
    inline def `setIcon-translate`(value: DataConstantProperty[js.Tuple2[Double, Double]]): Self = StObject.set(x, "icon-translate", value.asInstanceOf[js.Any])
    
    inline def `setIcon-translate-anchor`(value: DataConstantProperty[map | viewport]): Self = StObject.set(x, "icon-translate-anchor", value.asInstanceOf[js.Any])
    
    inline def `setText-color`(value: DataDrivenProperty[Color]): Self = StObject.set(x, "text-color", value.asInstanceOf[js.Any])
    
    inline def `setText-halo-blur`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "text-halo-blur", value.asInstanceOf[js.Any])
    
    inline def `setText-halo-color`(value: DataDrivenProperty[Color]): Self = StObject.set(x, "text-halo-color", value.asInstanceOf[js.Any])
    
    inline def `setText-halo-width`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "text-halo-width", value.asInstanceOf[js.Any])
    
    inline def `setText-opacity`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "text-opacity", value.asInstanceOf[js.Any])
    
    inline def `setText-translate`(value: DataConstantProperty[js.Tuple2[Double, Double]]): Self = StObject.set(x, "text-translate", value.asInstanceOf[js.Any])
    
    inline def `setText-translate-anchor`(value: DataConstantProperty[map | viewport]): Self = StObject.set(x, "text-translate-anchor", value.asInstanceOf[js.Any])
  }
}
