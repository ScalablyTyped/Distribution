package typings.marked.mod.marked.Tokens

import typings.marked.markedStrings._empty
import typings.marked.markedStrings.list
import typings.marked.mod.marked.Token
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
  
  var start: Double | _empty
  
  var `type`: list
}
object List {
  
  inline def apply(items: js.Array[ListItem], loose: Boolean, ordered: Boolean, raw: String, start: Double | _empty): List = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], loose = loose.asInstanceOf[js.Any], ordered = ordered.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list")
    __obj.asInstanceOf[List]
  }
  
  extension [Self <: List](x: Self) {
    
    inline def setItems(value: js.Array[ListItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ListItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
    
    inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double | _empty): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setType(value: list): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
