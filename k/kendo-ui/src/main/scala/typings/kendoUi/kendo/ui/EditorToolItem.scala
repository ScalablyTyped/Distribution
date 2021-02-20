package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorToolItem extends StObject {
  
  var context: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object EditorToolItem {
  
  @scala.inline
  def apply(): EditorToolItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorToolItem]
  }
  
  @scala.inline
  implicit class EditorToolItemMutableBuilder[Self <: EditorToolItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
