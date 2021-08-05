package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLayerDefaultsMarkerTooltipContent extends StObject {
  
  var url: js.UndefOr[String] = js.undefined
}
object MapLayerDefaultsMarkerTooltipContent {
  
  inline def apply(): MapLayerDefaultsMarkerTooltipContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerDefaultsMarkerTooltipContent]
  }
  
  extension [Self <: MapLayerDefaultsMarkerTooltipContent](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
