package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WMSOptions extends TileLayerOptions {
  
  var crs: js.UndefOr[CRS] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var layers: js.UndefOr[String] = js.native
  
  var styles: js.UndefOr[String] = js.native
  
  var transparent: js.UndefOr[Boolean] = js.native
  
  var uppercase: js.UndefOr[Boolean] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object WMSOptions {
  
  @scala.inline
  def apply(): WMSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WMSOptions]
  }
  
  @scala.inline
  implicit class WMSOptionsMutableBuilder[Self <: WMSOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrs(value: CRS): Self = StObject.set(x, "crs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrsUndefined: Self = StObject.set(x, "crs", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setLayers(value: String): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    @scala.inline
    def setUppercase(value: Boolean): Self = StObject.set(x, "uppercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUppercaseUndefined: Self = StObject.set(x, "uppercase", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
