package typings.marked.mod.Tokens

import typings.marked.markedStrings.em
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Em
  extends StObject
     with Token {
  
  var raw: String
  
  var text: String
  
  var `type`: em
}
object Em {
  
  inline def apply(raw: String, text: String): Em = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("em")
    __obj.asInstanceOf[Em]
  }
  
  extension [Self <: Em](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: em): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
