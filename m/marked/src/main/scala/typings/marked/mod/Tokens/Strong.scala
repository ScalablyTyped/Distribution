package typings.marked.mod.Tokens

import typings.marked.markedStrings.strong
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Strong extends Token {
  
  var raw: String = js.native
  
  var text: String = js.native
  
  var `type`: strong = js.native
}
object Strong {
  
  @scala.inline
  def apply(raw: String, text: String, `type`: strong): Strong = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Strong]
  }
  
  @scala.inline
  implicit class StrongMutableBuilder[Self <: Strong] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: strong): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
