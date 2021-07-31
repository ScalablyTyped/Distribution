package typings.marked.mod.Tokens

import typings.marked.markedStrings.html
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTML
  extends StObject
     with Token {
  
  var pre: Boolean
  
  var raw: String
  
  var text: String
  
  var `type`: html
}
object HTML {
  
  @scala.inline
  def apply(pre: Boolean, raw: String, text: String): HTML = {
    val __obj = js.Dynamic.literal(pre = pre.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("html")
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
