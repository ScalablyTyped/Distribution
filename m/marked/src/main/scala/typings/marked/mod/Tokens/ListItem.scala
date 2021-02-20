package typings.marked.mod.Tokens

import typings.marked.markedStrings.list_item
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItem extends Token {
  
  var checked: Boolean = js.native
  
  var loose: Boolean = js.native
  
  var raw: String = js.native
  
  var task: Boolean = js.native
  
  var text: String = js.native
  
  var `type`: list_item = js.native
}
object ListItem {
  
  @scala.inline
  def apply(checked: Boolean, loose: Boolean, raw: String, task: Boolean, text: String, `type`: list_item): ListItem = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], loose = loose.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
