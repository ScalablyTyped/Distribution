package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WMSOptions
  extends StObject
     with TileLayerOptions {
  
  var crs: js.UndefOr[CRS] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var layers: js.UndefOr[String] = js.undefined
  
  var styles: js.UndefOr[String] = js.undefined
  
  var transparent: js.UndefOr[Boolean] = js.undefined
  
  var uppercase: js.UndefOr[Boolean] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object WMSOptions {
  
  inline def apply(): WMSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WMSOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WMSOptions] (val x: Self) extends AnyVal {
    
    inline def setCrs(value: CRS): Self = StObject.set(x, "crs", value.asInstanceOf[js.Any])
    
    inline def setCrsUndefined: Self = StObject.set(x, "crs", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLayers(value: String): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    inline def setUppercase(value: Boolean): Self = StObject.set(x, "uppercase", value.asInstanceOf[js.Any])
    
    inline def setUppercaseUndefined: Self = StObject.set(x, "uppercase", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
