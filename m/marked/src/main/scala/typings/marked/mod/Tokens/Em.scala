package typings.marked.mod.Tokens

import typings.marked.markedStrings.em
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Em extends Token {
  
  var raw: String = js.native
  
  var text: String = js.native
  
  var `type`: em = js.native
}
object Em {
  
  @scala.inline
  def apply(raw: String, text: String, `type`: em): Em = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Em]
  }
  
  @scala.inline
  implicit class EmMutableBuilder[Self <: Em] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: em): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
