package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipContent extends StObject {
  
  var url: js.UndefOr[String] = js.native
}
object TooltipContent {
  
  @scala.inline
  def apply(): TooltipContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipContent]
  }
  
  @scala.inline
  implicit class TooltipContentMutableBuilder[Self <: TooltipContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
