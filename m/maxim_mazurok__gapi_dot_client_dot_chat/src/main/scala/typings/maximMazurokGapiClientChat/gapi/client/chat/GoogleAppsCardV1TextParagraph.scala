package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCardV1TextParagraph extends StObject {
  
  /** The text that's shown in the widget. */
  var text: js.UndefOr[String] = js.undefined
}
object GoogleAppsCardV1TextParagraph {
  
  inline def apply(): GoogleAppsCardV1TextParagraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCardV1TextParagraph]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAppsCardV1TextParagraph] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
