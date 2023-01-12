package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.map
import typings.maplibreGl.maplibreGlStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillPaintProps extends StObject {
  
  var `fill-antialias`: DataConstantProperty[Boolean]
  
  var `fill-color`: DataDrivenProperty[Color]
  
  var `fill-opacity`: DataDrivenProperty[Double]
  
  var `fill-outline-color`: DataDrivenProperty[Color]
  
  var `fill-pattern`: CrossFadedDataDrivenProperty[ResolvedImage]
  
  var `fill-translate`: DataConstantProperty[js.Tuple2[Double, Double]]
  
  var `fill-translate-anchor`: DataConstantProperty[map | viewport]
}
object FillPaintProps {
  
  inline def apply(
    `fill-antialias`: DataConstantProperty[Boolean],
    `fill-color`: DataDrivenProperty[Color],
    `fill-opacity`: DataDrivenProperty[Double],
    `fill-outline-color`: DataDrivenProperty[Color],
    `fill-pattern`: CrossFadedDataDrivenProperty[ResolvedImage],
    `fill-translate`: DataConstantProperty[js.Tuple2[Double, Double]],
    `fill-translate-anchor`: DataConstantProperty[map | viewport]
  ): FillPaintProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fill-antialias")(`fill-antialias`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-color")(`fill-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-opacity")(`fill-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-outline-color")(`fill-outline-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-pattern")(`fill-pattern`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-translate")(`fill-translate`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-translate-anchor")(`fill-translate-anchor`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillPaintProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FillPaintProps] (val x: Self) extends AnyVal {
    
    inline def `setFill-antialias`(value: DataConstantProperty[Boolean]): Self = StObject.set(x, "fill-antialias", value.asInstanceOf[js.Any])
    
    inline def `setFill-color`(value: DataDrivenProperty[Color]): Self = StObject.set(x, "fill-color", value.asInstanceOf[js.Any])
    
    inline def `setFill-opacity`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "fill-opacity", value.asInstanceOf[js.Any])
    
    inline def `setFill-outline-color`(value: DataDrivenProperty[Color]): Self = StObject.set(x, "fill-outline-color", value.asInstanceOf[js.Any])
    
    inline def `setFill-pattern`(value: CrossFadedDataDrivenProperty[ResolvedImage]): Self = StObject.set(x, "fill-pattern", value.asInstanceOf[js.Any])
    
    inline def `setFill-translate`(value: DataConstantProperty[js.Tuple2[Double, Double]]): Self = StObject.set(x, "fill-translate", value.asInstanceOf[js.Any])
    
    inline def `setFill-translate-anchor`(value: DataConstantProperty[map | viewport]): Self = StObject.set(x, "fill-translate-anchor", value.asInstanceOf[js.Any])
  }
}
