package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.kendo.dataviz.map.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapMarker extends StObject {
  
  var location: js.UndefOr[js.Any | Location] = js.native
  
  var shape: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var tooltip: js.UndefOr[MapMarkerTooltip] = js.native
}
object MapMarker {
  
  @scala.inline
  def apply(): MapMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapMarker]
  }
  
  @scala.inline
  implicit class MapMarkerMutableBuilder[Self <: MapMarker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: js.Any | Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTooltip(value: MapMarkerTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
