package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapLayerDefaultsTile extends StObject {
  
  var attribution: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var subdomains: js.UndefOr[js.Any] = js.native
  
  var urlTemplate: js.UndefOr[String] = js.native
}
object MapLayerDefaultsTile {
  
  @scala.inline
  def apply(): MapLayerDefaultsTile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerDefaultsTile]
  }
  
  @scala.inline
  implicit class MapLayerDefaultsTileMutableBuilder[Self <: MapLayerDefaultsTile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setSubdomains(value: js.Any): Self = StObject.set(x, "subdomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdomainsUndefined: Self = StObject.set(x, "subdomains", js.undefined)
    
    @scala.inline
    def setUrlTemplate(value: String): Self = StObject.set(x, "urlTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlTemplateUndefined: Self = StObject.set(x, "urlTemplate", js.undefined)
  }
}
