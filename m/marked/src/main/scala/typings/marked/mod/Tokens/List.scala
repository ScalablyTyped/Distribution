package typings.marked.mod.Tokens

import typings.marked.markedStrings.list_start
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait List
  extends StObject
     with Token {
  
  var items: js.Array[ListItem]
  
  var loose: Boolean
  
  var ordered: Boolean
  
  var raw: String
  
  var start: Boolean
  
  var `type`: list_start
}
object List {
  
  @scala.inline
  def apply(items: js.Array[ListItem], loose: Boolean, ordered: Boolean, raw: String, start: Boolean): List = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], loose = loose.asInstanceOf[js.Any], ordered = ordered.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list_start")
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
