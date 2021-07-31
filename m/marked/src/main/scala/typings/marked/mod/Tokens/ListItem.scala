package typings.marked.mod.Tokens

import typings.marked.markedStrings.list_item
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItem
  extends StObject
     with Token {
  
  var checked: Boolean
  
  var loose: Boolean
  
  var raw: String
  
  var task: Boolean
  
  var text: String
  
  var `type`: list_item
}
object ListItem {
  
  @scala.inline
  def apply(checked: Boolean, loose: Boolean, raw: String, task: Boolean, text: String): ListItem = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], loose = loose.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list_item")
    __obj.asInstanceOf[ListItem]
  }
  
  @scala.inline
  implicit class ListItemMutableBuilder[Self <: ListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask(value: Boolean): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: list_item): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
