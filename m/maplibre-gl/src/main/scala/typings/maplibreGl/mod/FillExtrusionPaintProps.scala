package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.map
import typings.maplibreGl.maplibreGlStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillExtrusionPaintProps extends StObject {
  
  var `fill-extrusion-base`: DataDrivenProperty[Double]
  
  var `fill-extrusion-color`: DataDrivenProperty[Color]
  
  var `fill-extrusion-height`: DataDrivenProperty[Double]
  
  var `fill-extrusion-opacity`: DataConstantProperty[Double]
  
  var `fill-extrusion-pattern`: CrossFadedDataDrivenProperty[ResolvedImage]
  
  var `fill-extrusion-translate`: DataConstantProperty[js.Tuple2[Double, Double]]
  
  var `fill-extrusion-translate-anchor`: DataConstantProperty[map | viewport]
  
  var `fill-extrusion-vertical-gradient`: DataConstantProperty[Boolean]
}
object FillExtrusionPaintProps {
  
  inline def apply(
    `fill-extrusion-base`: DataDrivenProperty[Double],
    `fill-extrusion-color`: DataDrivenProperty[Color],
    `fill-extrusion-height`: DataDrivenProperty[Double],
    `fill-extrusion-opacity`: DataConstantProperty[Double],
    `fill-extrusion-pattern`: CrossFadedDataDrivenProperty[ResolvedImage],
    `fill-extrusion-translate`: DataConstantProperty[js.Tuple2[Double, Double]],
    `fill-extrusion-translate-anchor`: DataConstantProperty[map | viewport],
    `fill-extrusion-vertical-gradient`: DataConstantProperty[Boolean]
  ): FillExtrusionPaintProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fill-extrusion-base")(`fill-extrusion-base`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-extrusion-color")(`fill-extrusion-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-extrusion-height")(`fill-extrusion-height`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-extrusion-opacity")(`fill-extrusion-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-extrusion-pattern")(`fill-extrusion-pattern`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-extrusion-translate")(`fill-extrusion-translate`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-extrusion-translate-anchor")(`fill-extrusion-translate-anchor`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-extrusion-vertical-gradient")(`fill-extrusion-vertical-gradient`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillExtrusionPaintProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FillExtrusionPaintProps] (val x: Self) extends AnyVal {
    
    inline def `setFill-extrusion-base`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "fill-extrusion-base", value.asInstanceOf[js.Any])
    
    inline def `setFill-extrusion-color`(value: DataDrivenProperty[Color]): Self = StObject.set(x, "fill-extrusion-color", value.asInstanceOf[js.Any])
    
    inline def `setFill-extrusion-height`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "fill-extrusion-height", value.asInstanceOf[js.Any])
    
    inline def `setFill-extrusion-opacity`(value: DataConstantProperty[Double]): Self = StObject.set(x, "fill-extrusion-opacity", value.asInstanceOf[js.Any])
    
    inline def `setFill-extrusion-pattern`(value: CrossFadedDataDrivenProperty[ResolvedImage]): Self = StObject.set(x, "fill-extrusion-pattern", value.asInstanceOf[js.Any])
    
    inline def `setFill-extrusion-translate`(value: DataConstantProperty[js.Tuple2[Double, Double]]): Self = StObject.set(x, "fill-extrusion-translate", value.asInstanceOf[js.Any])
    
    inline def `setFill-extrusion-translate-anchor`(value: DataConstantProperty[map | viewport]): Self = StObject.set(x, "fill-extrusion-translate-anchor", value.asInstanceOf[js.Any])
    
    inline def `setFill-extrusion-vertical-gradient`(value: DataConstantProperty[Boolean]): Self = StObject.set(x, "fill-extrusion-vertical-gradient", value.asInstanceOf[js.Any])
  }
}
