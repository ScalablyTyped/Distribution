package typings.kendoUi.kendo.dataviz.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLayerOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var subdomains: js.UndefOr[js.Any] = js.undefined
  
  var tileSize: js.UndefOr[Double] = js.undefined
  
  var urlTemplate: js.UndefOr[String] = js.undefined
}
object TileLayerOptions {
  
  inline def apply(): TileLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayerOptions]
  }
  
  extension [Self <: TileLayerOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSubdomains(value: js.Any): Self = StObject.set(x, "subdomains", value.asInstanceOf[js.Any])
    
    inline def setSubdomainsUndefined: Self = StObject.set(x, "subdomains", js.undefined)
    
    inline def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    inline def setUrlTemplate(value: String): Self = StObject.set(x, "urlTemplate", value.asInstanceOf[js.Any])
    
    inline def setUrlTemplateUndefined: Self = StObject.set(x, "urlTemplate", js.undefined)
  }
}
