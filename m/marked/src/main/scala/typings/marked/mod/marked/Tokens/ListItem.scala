package typings.marked.mod.marked.Tokens

import typings.marked.markedStrings.list_item
import typings.marked.mod.marked.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItem
  extends StObject
     with Token {
  
  var checked: js.UndefOr[Boolean] = js.undefined
  
  var loose: Boolean
  
  var raw: String
  
  var task: Boolean
  
  var text: String
  
  var tokens: js.Array[Token]
  
  var `type`: list_item
}
object ListItem {
  
  inline def apply(loose: Boolean, raw: String, task: Boolean, text: String, tokens: js.Array[Token]): ListItem = {
    val __obj = js.Dynamic.literal(loose = loose.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list_item")
    __obj.asInstanceOf[ListItem]
  }
  
  extension [Self <: ListItem](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setTask(value: Boolean): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTokens(value: js.Array[Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensVarargs(value: Token*): Self = StObject.set(x, "tokens", js.Array(value*))
    
    inline def setType(value: list_item): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
