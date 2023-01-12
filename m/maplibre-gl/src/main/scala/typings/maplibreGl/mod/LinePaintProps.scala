package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.map
import typings.maplibreGl.maplibreGlStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinePaintProps extends StObject {
  
  var `line-blur`: DataDrivenProperty[Double]
  
  var `line-color`: DataDrivenProperty[Color]
  
  var `line-dasharray`: CrossFadedProperty[js.Array[Double]]
  
  var `line-gap-width`: DataDrivenProperty[Double]
  
  var `line-gradient`: ColorRampProperty
  
  var `line-offset`: DataDrivenProperty[Double]
  
  var `line-opacity`: DataDrivenProperty[Double]
  
  var `line-pattern`: CrossFadedDataDrivenProperty[ResolvedImage]
  
  var `line-translate`: DataConstantProperty[js.Tuple2[Double, Double]]
  
  var `line-translate-anchor`: DataConstantProperty[map | viewport]
  
  var `line-width`: DataDrivenProperty[Double]
}
object LinePaintProps {
  
  inline def apply(
    `line-blur`: DataDrivenProperty[Double],
    `line-color`: DataDrivenProperty[Color],
    `line-dasharray`: CrossFadedProperty[js.Array[Double]],
    `line-gap-width`: DataDrivenProperty[Double],
    `line-gradient`: ColorRampProperty,
    `line-offset`: DataDrivenProperty[Double],
    `line-opacity`: DataDrivenProperty[Double],
    `line-pattern`: CrossFadedDataDrivenProperty[ResolvedImage],
    `line-translate`: DataConstantProperty[js.Tuple2[Double, Double]],
    `line-translate-anchor`: DataConstantProperty[map | viewport],
    `line-width`: DataDrivenProperty[Double]
  ): LinePaintProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("line-blur")(`line-blur`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-color")(`line-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-dasharray")(`line-dasharray`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-gap-width")(`line-gap-width`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-gradient")(`line-gradient`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-offset")(`line-offset`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-opacity")(`line-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-pattern")(`line-pattern`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-translate")(`line-translate`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-translate-anchor")(`line-translate-anchor`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-width")(`line-width`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinePaintProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinePaintProps] (val x: Self) extends AnyVal {
    
    inline def `setLine-blur`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "line-blur", value.asInstanceOf[js.Any])
    
    inline def `setLine-color`(value: DataDrivenProperty[Color]): Self = StObject.set(x, "line-color", value.asInstanceOf[js.Any])
    
    inline def `setLine-dasharray`(value: CrossFadedProperty[js.Array[Double]]): Self = StObject.set(x, "line-dasharray", value.asInstanceOf[js.Any])
    
    inline def `setLine-gap-width`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "line-gap-width", value.asInstanceOf[js.Any])
    
    inline def `setLine-gradient`(value: ColorRampProperty): Self = StObject.set(x, "line-gradient", value.asInstanceOf[js.Any])
    
    inline def `setLine-offset`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "line-offset", value.asInstanceOf[js.Any])
    
    inline def `setLine-opacity`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "line-opacity", value.asInstanceOf[js.Any])
    
    inline def `setLine-pattern`(value: CrossFadedDataDrivenProperty[ResolvedImage]): Self = StObject.set(x, "line-pattern", value.asInstanceOf[js.Any])
    
    inline def `setLine-translate`(value: DataConstantProperty[js.Tuple2[Double, Double]]): Self = StObject.set(x, "line-translate", value.asInstanceOf[js.Any])
    
    inline def `setLine-translate-anchor`(value: DataConstantProperty[map | viewport]): Self = StObject.set(x, "line-translate-anchor", value.asInstanceOf[js.Any])
    
    inline def `setLine-width`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "line-width", value.asInstanceOf[js.Any])
  }
}
