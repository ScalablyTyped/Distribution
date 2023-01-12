package typings.makerjs.MakerJs.exporter

import org.scalablytyped.runtime.StringDictionary
import typings.makerjs.MakerJs.IPointMatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DXF rendering options.
  */
trait IDXFRenderOptions
  extends StObject
     with IExportOptions
     with IPointMatchOptions {
  
  /**
    * Text size for TEXT entities.
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * DXF options per layer.
    */
  var layerOptions: js.UndefOr[StringDictionary[IDXFLayerOptions]] = js.undefined
  
  /**
    * Flag to use POLYLINE
    */
  var usePOLYLINE: js.UndefOr[Boolean] = js.undefined
}
object IDXFRenderOptions {
  
  inline def apply(): IDXFRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDXFRenderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDXFRenderOptions] (val x: Self) extends AnyVal {
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setLayerOptions(value: StringDictionary[IDXFLayerOptions]): Self = StObject.set(x, "layerOptions", value.asInstanceOf[js.Any])
    
    inline def setLayerOptionsUndefined: Self = StObject.set(x, "layerOptions", js.undefined)
    
    inline def setUsePOLYLINE(value: Boolean): Self = StObject.set(x, "usePOLYLINE", value.asInstanceOf[js.Any])
    
    inline def setUsePOLYLINEUndefined: Self = StObject.set(x, "usePOLYLINE", js.undefined)
  }
}
