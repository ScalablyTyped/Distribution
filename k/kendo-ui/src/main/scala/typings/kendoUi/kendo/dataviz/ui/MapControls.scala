package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapControls extends StObject {
  
  var attribution: js.UndefOr[Boolean | MapControlsAttribution] = js.native
  
  var navigator: js.UndefOr[Boolean | MapControlsNavigator] = js.native
  
  var zoom: js.UndefOr[Boolean | MapControlsZoom] = js.native
}
object MapControls {
  
  @scala.inline
  def apply(): MapControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapControls]
  }
  
  @scala.inline
  implicit class MapControlsMutableBuilder[Self <: MapControls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribution(value: Boolean | MapControlsAttribution): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    @scala.inline
    def setNavigator(value: Boolean | MapControlsNavigator): Self = StObject.set(x, "navigator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatorUndefined: Self = StObject.set(x, "navigator", js.undefined)
    
    @scala.inline
    def setZoom(value: Boolean | MapControlsZoom): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
