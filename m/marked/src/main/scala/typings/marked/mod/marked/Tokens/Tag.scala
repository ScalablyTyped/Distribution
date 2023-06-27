package typings.marked.mod.marked.Tokens

import typings.marked.markedBooleans.`false`
import typings.marked.markedStrings.html
import typings.marked.markedStrings.text
import typings.marked.mod.marked.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag
  extends StObject
     with Token {
  
  var block: `false`
  
  var inLink: Boolean
  
  var inRawBlock: Boolean
  
  var raw: String
  
  var text: String
  
  var `type`: text | html
}
object Tag {
  
  inline def apply(inLink: Boolean, inRawBlock: Boolean, raw: String, text: String, `type`: text | html): Tag = {
    val __obj = js.Dynamic.literal(block = false, inLink = inLink.asInstanceOf[js.Any], inRawBlock = inRawBlock.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
    
    inline def setBlock(value: `false`): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setInLink(value: Boolean): Self = StObject.set(x, "inLink", value.asInstanceOf[js.Any])
    
    inline def setInRawBlock(value: Boolean): Self = StObject.set(x, "inRawBlock", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: text | html): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
