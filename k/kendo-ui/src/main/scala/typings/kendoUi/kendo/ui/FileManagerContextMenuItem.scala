package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileManagerContextMenuItem extends StObject {
  
  var command: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var spriteCssClass: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object FileManagerContextMenuItem {
  
  @scala.inline
  def apply(): FileManagerContextMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerContextMenuItem]
  }
  
  @scala.inline
  implicit class FileManagerContextMenuItemMutableBuilder[Self <: FileManagerContextMenuItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSpriteCssClass(value: String): Self = StObject.set(x, "spriteCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpriteCssClassUndefined: Self = StObject.set(x, "spriteCssClass", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
