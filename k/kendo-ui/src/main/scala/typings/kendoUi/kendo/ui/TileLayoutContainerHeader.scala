package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLayoutContainerHeader extends StObject {
  
  var template: js.UndefOr[String | js.Function] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object TileLayoutContainerHeader {
  
  inline def apply(): TileLayoutContainerHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayoutContainerHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TileLayoutContainerHeader] (val x: Self) extends AnyVal {
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
