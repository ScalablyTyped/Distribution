package typings.marked.mod.Tokens

import typings.marked.markedStrings.blockquote
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Blockquote extends Token {
  
  var raw: String = js.native
  
  var text: String = js.native
  
  var `type`: blockquote = js.native
}
object Blockquote {
  
  @scala.inline
  def apply(raw: String, text: String, `type`: blockquote): Blockquote = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blockquote]
  }
  
  @scala.inline
  implicit class BlockquoteMutableBuilder[Self <: Blockquote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: blockquote): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
