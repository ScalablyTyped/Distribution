package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextParagraph extends StObject {
  
  var text: js.UndefOr[String] = js.undefined
}
object TextParagraph {
  
  @scala.inline
  def apply(): TextParagraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextParagraph]
  }
  
  @scala.inline
  implicit class TextParagraphMutableBuilder[Self <: TextParagraph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
