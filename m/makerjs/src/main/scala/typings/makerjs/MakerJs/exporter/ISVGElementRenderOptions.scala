package typings.makerjs.MakerJs.exporter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SVG rendering options.
  */
trait ISVGElementRenderOptions extends StObject {
  
  /**
    * CSS style to apply to elements.
    */
  var cssStyle: js.UndefOr[String] = js.undefined
  
  /**
    * SVG fill color.
    */
  var fill: js.UndefOr[String] = js.undefined
  
  /**
    * SVG color of the rendered paths.
    */
  var stroke: js.UndefOr[String] = js.undefined
  
  /**
    * SVG stroke width of paths. This may have a unit type suffix, if not, the value will be in the same unit system as the units property.
    */
  var strokeWidth: js.UndefOr[String] = js.undefined
}
object ISVGElementRenderOptions {
  
  inline def apply(): ISVGElementRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISVGElementRenderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISVGElementRenderOptions] (val x: Self) extends AnyVal {
    
    inline def setCssStyle(value: String): Self = StObject.set(x, "cssStyle", value.asInstanceOf[js.Any])
    
    inline def setCssStyleUndefined: Self = StObject.set(x, "cssStyle", js.undefined)
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStrokeWidth(value: String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
