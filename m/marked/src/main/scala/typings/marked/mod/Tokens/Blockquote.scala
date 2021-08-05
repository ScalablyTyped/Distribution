package typings.marked.mod.Tokens

import typings.marked.markedStrings.blockquote
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blockquote
  extends StObject
     with Token {
  
  var raw: String
  
  var text: String
  
  var `type`: blockquote
}
object Blockquote {
  
  inline def apply(raw: String, text: String): Blockquote = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("blockquote")
    __obj.asInstanceOf[Blockquote]
  }
  
  extension [Self <: Blockquote](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: blockquote): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
