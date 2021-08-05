package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextParagraph extends StObject {
  
  var text: js.UndefOr[String] = js.undefined
}
object TextParagraph {
  
  inline def apply(): TextParagraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextParagraph]
  }
  
  extension [Self <: TextParagraph](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
