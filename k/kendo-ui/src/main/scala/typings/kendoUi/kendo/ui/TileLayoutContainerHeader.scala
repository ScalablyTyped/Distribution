package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileLayoutContainerHeader extends StObject {
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object TileLayoutContainerHeader {
  
  @scala.inline
  def apply(): TileLayoutContainerHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayoutContainerHeader]
  }
  
  @scala.inline
  implicit class TileLayoutContainerHeaderMutableBuilder[Self <: TileLayoutContainerHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
