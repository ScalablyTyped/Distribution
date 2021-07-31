package typings.kendoUi.kendo.dataviz.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerTooltipContent extends StObject {
  
  var url: js.UndefOr[String] = js.undefined
}
object MarkerTooltipContent {
  
  @scala.inline
  def apply(): MarkerTooltipContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerTooltipContent]
  }
  
  @scala.inline
  implicit class MarkerTooltipContentMutableBuilder[Self <: MarkerTooltipContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
