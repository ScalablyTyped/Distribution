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
  
  @scala.inline
  def apply(): TileLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayerOptions]
  }
  
  @scala.inline
  implicit class TileLayerOptionsMutableBuilder[Self <: TileLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSubdomains(value: js.Any): Self = StObject.set(x, "subdomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdomainsUndefined: Self = StObject.set(x, "subdomains", js.undefined)
    
    @scala.inline
    def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    @scala.inline
    def setUrlTemplate(value: String): Self = StObject.set(x, "urlTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlTemplateUndefined: Self = StObject.set(x, "urlTemplate", js.undefined)
  }
}
