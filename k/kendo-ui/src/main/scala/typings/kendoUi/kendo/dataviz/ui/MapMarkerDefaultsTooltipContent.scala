package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapMarkerDefaultsTooltipContent extends StObject {
  
  var url: js.UndefOr[String] = js.undefined
}
object MapMarkerDefaultsTooltipContent {
  
  inline def apply(): MapMarkerDefaultsTooltipContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapMarkerDefaultsTooltipContent]
  }
  
  extension [Self <: MapMarkerDefaultsTooltipContent](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
