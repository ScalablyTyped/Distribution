package typings.marked.mod.marked.Tokens

import typings.marked.markedStrings.blockquote
import typings.marked.mod.marked.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blockquote
  extends StObject
     with Token {
  
  var raw: String
  
  var text: String
  
  var tokens: js.Array[Token]
  
  var `type`: blockquote
}
object Blockquote {
  
  inline def apply(raw: String, text: String, tokens: js.Array[Token]): Blockquote = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("blockquote")
    __obj.asInstanceOf[Blockquote]
  }
  
  extension [Self <: Blockquote](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTokens(value: js.Array[Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensVarargs(value: Token*): Self = StObject.set(x, "tokens", js.Array(value*))
    
    inline def setType(value: blockquote): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
