package typings.makerjs.MakerJs.exporter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DXF layer options.
  */
trait IDXFLayerOptions extends StObject {
  
  /**
    * DXF layer color.
    */
  var color: Double
  
  /**
    * Text size for TEXT entities.
    */
  var fontSize: js.UndefOr[Double] = js.undefined
}
object IDXFLayerOptions {
  
  inline def apply(color: Double): IDXFLayerOptions = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDXFLayerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDXFLayerOptions] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
  }
}
