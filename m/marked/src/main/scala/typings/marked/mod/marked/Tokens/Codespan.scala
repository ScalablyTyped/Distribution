package typings.marked.mod.marked.Tokens

import typings.marked.markedStrings.codespan
import typings.marked.mod.marked.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Codespan
  extends StObject
     with Token {
  
  var raw: String
  
  var text: String
  
  var `type`: codespan
}
object Codespan {
  
  inline def apply(raw: String, text: String): Codespan = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("codespan")
    __obj.asInstanceOf[Codespan]
  }
  
  extension [Self <: Codespan](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: codespan): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
