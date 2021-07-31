package typings.marked.mod.Tokens

import typings.marked.markedStrings.del
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Del
  extends StObject
     with Token {
  
  var raw: String
  
  var text: String
  
  var `type`: del
}
object Del {
  
  @scala.inline
  def apply(raw: String, text: String): Del = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("del")
    __obj.asInstanceOf[Del]
  }
  
  @scala.inline
  implicit class DelMutableBuilder[Self <: Del] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: del): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
