package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapLayerDefaultsMarkerTooltipContent extends StObject {
  
  var url: js.UndefOr[String] = js.native
}
object MapLayerDefaultsMarkerTooltipContent {
  
  @scala.inline
  def apply(): MapLayerDefaultsMarkerTooltipContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerDefaultsMarkerTooltipContent]
  }
  
  @scala.inline
  implicit class MapLayerDefaultsMarkerTooltipContentMutableBuilder[Self <: MapLayerDefaultsMarkerTooltipContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
