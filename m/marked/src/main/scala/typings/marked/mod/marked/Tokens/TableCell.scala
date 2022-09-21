package typings.marked.mod.marked.Tokens

import typings.marked.mod.marked.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableCell extends StObject {
  
  var text: String
  
  var tokens: js.Array[Token]
}
object TableCell {
  
  inline def apply(text: String, tokens: js.Array[Token]): TableCell = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCell]
  }
  
  extension [Self <: TableCell](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTokens(value: js.Array[Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensVarargs(value: Token*): Self = StObject.set(x, "tokens", js.Array(value*))
  }
}
