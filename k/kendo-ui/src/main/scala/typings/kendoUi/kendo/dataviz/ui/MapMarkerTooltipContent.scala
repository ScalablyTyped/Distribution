package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapMarkerTooltipContent extends StObject {
  
  var url: js.UndefOr[String] = js.undefined
}
object MapMarkerTooltipContent {
  
  inline def apply(): MapMarkerTooltipContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapMarkerTooltipContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapMarkerTooltipContent] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
