package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLayerTooltipContent extends StObject {
  
  var url: js.UndefOr[String] = js.undefined
}
object MapLayerTooltipContent {
  
  inline def apply(): MapLayerTooltipContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerTooltipContent]
  }
  
  extension [Self <: MapLayerTooltipContent](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
