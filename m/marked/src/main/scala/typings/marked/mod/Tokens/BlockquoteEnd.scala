package typings.marked.mod.Tokens

import typings.marked.markedStrings.blockquote_end
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockquoteEnd extends Token {
  
  var raw: String = js.native
  
  var `type`: blockquote_end = js.native
}
object BlockquoteEnd {
  
  @scala.inline
  def apply(raw: String, `type`: blockquote_end): BlockquoteEnd = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockquoteEnd]
  }
  
  @scala.inline
  implicit class BlockquoteEndMutableBuilder[Self <: BlockquoteEnd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: blockquote_end): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
