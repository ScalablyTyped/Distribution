package typings.marked.mod.Tokens

import typings.marked.markedStrings.blockquote_end
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockquoteEnd
  extends StObject
     with Token {
  
  var raw: String
  
  var `type`: blockquote_end
}
object BlockquoteEnd {
  
  inline def apply(raw: String): BlockquoteEnd = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("blockquote_end")
    __obj.asInstanceOf[BlockquoteEnd]
  }
  
  extension [Self <: BlockquoteEnd](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setType(value: blockquote_end): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
