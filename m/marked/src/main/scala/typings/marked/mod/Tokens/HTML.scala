package typings.marked.mod.Tokens

import typings.marked.markedStrings.html
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTML extends Token {
  
  var pre: Boolean = js.native
  
  var raw: String = js.native
  
  var text: String = js.native
  
  var `type`: html = js.native
}
object HTML {
  
  @scala.inline
  def apply(pre: Boolean, raw: String, text: String, `type`: html): HTML = {
    val __obj = js.Dynamic.literal(pre = pre.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTML]
  }
  
  @scala.inline
  implicit class HTMLMutableBuilder[Self <: HTML] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPre(value: Boolean): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: html): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
