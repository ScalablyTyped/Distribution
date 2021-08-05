package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileManagerContextMenuItem extends StObject {
  
  var command: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var spriteCssClass: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object FileManagerContextMenuItem {
  
  inline def apply(): FileManagerContextMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerContextMenuItem]
  }
  
  extension [Self <: FileManagerContextMenuItem](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSpriteCssClass(value: String): Self = StObject.set(x, "spriteCssClass", value.asInstanceOf[js.Any])
    
    inline def setSpriteCssClassUndefined: Self = StObject.set(x, "spriteCssClass", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
