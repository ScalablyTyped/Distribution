package typings.marked.mod.Tokens

import typings.marked.markedStrings.list_start
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait List extends Token {
  
  var items: js.Array[ListItem] = js.native
  
  var loose: Boolean = js.native
  
  var ordered: Boolean = js.native
  
  var raw: String = js.native
  
  var start: Boolean = js.native
  
  var `type`: list_start = js.native
}
object List {
  
  @scala.inline
  def apply(
    items: js.Array[ListItem],
    loose: Boolean,
    ordered: Boolean,
    raw: String,
    start: Boolean,
    `type`: list_start
  ): List = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], loose = loose.asInstanceOf[js.Any], ordered = ordered.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
  
  @scala.inline
  implicit class ListMutableBuilder[Self <: List] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ListItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: ListItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Boolean): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: list_start): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
