package typings.marked.mod.Tokens

import typings.marked.markedStrings.html
import typings.marked.markedStrings.text
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag
  extends StObject
     with Token {
  
  var inLink: Boolean
  
  var inRawBlock: Boolean
  
  var raw: String
  
  var text: String
  
  var `type`: text | html
}
object Tag {
  
  @scala.inline
  def apply(inLink: Boolean, inRawBlock: Boolean, raw: String, text: String, `type`: text | html): Tag = {
    val __obj = js.Dynamic.literal(inLink = inLink.asInstanceOf[js.Any], inRawBlock = inRawBlock.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  @scala.inline
  implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInLink(value: Boolean): Self = StObject.set(x, "inLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInRawBlock(value: Boolean): Self = StObject.set(x, "inRawBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: text | html): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
