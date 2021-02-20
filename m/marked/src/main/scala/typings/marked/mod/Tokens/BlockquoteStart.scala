package typings.marked.mod.Tokens

import typings.marked.markedStrings.blockquote_start
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockquoteStart extends Token {
  
  var raw: String = js.native
  
  var `type`: blockquote_start = js.native
}
object BlockquoteStart {
  
  @scala.inline
  def apply(raw: String, `type`: blockquote_start): BlockquoteStart = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockquoteStart]
  }
  
  @scala.inline
  implicit class BlockquoteStartMutableBuilder[Self <: BlockquoteStart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: blockquote_start): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
