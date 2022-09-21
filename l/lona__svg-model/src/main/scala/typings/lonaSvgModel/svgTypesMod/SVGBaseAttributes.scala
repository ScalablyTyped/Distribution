package typings.lonaSvgModel.svgTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGBaseAttributes extends StObject {
  
  var fill: js.UndefOr[String] = js.undefined
  
  var `fill-opacity`: js.UndefOr[Double] = js.undefined
  
  var `fill-rule`: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var mask: js.UndefOr[String] = js.undefined
  
  var stroke: js.UndefOr[String] = js.undefined
  
  var `stroke-linecap`: js.UndefOr[String] = js.undefined
  
  var `stroke-opacity`: js.UndefOr[Double] = js.undefined
  
  var `stroke-width`: js.UndefOr[String] = js.undefined
  
  var transform: js.UndefOr[String] = js.undefined
}
object SVGBaseAttributes {
  
  inline def apply(): SVGBaseAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGBaseAttributes]
  }
  
  extension [Self <: SVGBaseAttributes](x: Self) {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def `setFill-opacity`(value: Double): Self = StObject.set(x, "fill-opacity", value.asInstanceOf[js.Any])
    
    inline def `setFill-opacityUndefined`: Self = StObject.set(x, "fill-opacity", js.undefined)
    
    inline def `setFill-rule`(value: String): Self = StObject.set(x, "fill-rule", value.asInstanceOf[js.Any])
    
    inline def `setFill-ruleUndefined`: Self = StObject.set(x, "fill-rule", js.undefined)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def `setStroke-linecap`(value: String): Self = StObject.set(x, "stroke-linecap", value.asInstanceOf[js.Any])
    
    inline def `setStroke-linecapUndefined`: Self = StObject.set(x, "stroke-linecap", js.undefined)
    
    inline def `setStroke-opacity`(value: Double): Self = StObject.set(x, "stroke-opacity", value.asInstanceOf[js.Any])
    
    inline def `setStroke-opacityUndefined`: Self = StObject.set(x, "stroke-opacity", js.undefined)
    
    inline def `setStroke-width`(value: String): Self = StObject.set(x, "stroke-width", value.asInstanceOf[js.Any])
    
    inline def `setStroke-widthUndefined`: Self = StObject.set(x, "stroke-width", js.undefined)
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
