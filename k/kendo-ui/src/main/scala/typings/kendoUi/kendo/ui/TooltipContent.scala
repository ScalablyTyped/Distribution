package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipContent extends StObject {
  
  var url: js.UndefOr[String] = js.undefined
}
object TooltipContent {
  
  inline def apply(): TooltipContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TooltipContent] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
