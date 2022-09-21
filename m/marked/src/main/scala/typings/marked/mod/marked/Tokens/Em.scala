package typings.marked.mod.marked.Tokens

import typings.marked.markedStrings.em
import typings.marked.mod.marked.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Em
  extends StObject
     with Token {
  
  var raw: String
  
  var text: String
  
  var tokens: js.Array[Token]
  
  var `type`: em
}
object Em {
  
  inline def apply(raw: String, text: String, tokens: js.Array[Token]): Em = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("em")
    __obj.asInstanceOf[Em]
  }
  
  extension [Self <: Em](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTokens(value: js.Array[Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensVarargs(value: Token*): Self = StObject.set(x, "tokens", js.Array(value*))
    
    inline def setType(value: em): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
