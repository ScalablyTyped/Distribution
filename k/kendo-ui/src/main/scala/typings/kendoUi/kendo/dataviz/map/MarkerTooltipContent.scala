package typings.kendoUi.kendo.dataviz.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerTooltipContent extends StObject {
  
  var url: js.UndefOr[String] = js.undefined
}
object MarkerTooltipContent {
  
  inline def apply(): MarkerTooltipContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerTooltipContent]
  }
  
  extension [Self <: MarkerTooltipContent](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
