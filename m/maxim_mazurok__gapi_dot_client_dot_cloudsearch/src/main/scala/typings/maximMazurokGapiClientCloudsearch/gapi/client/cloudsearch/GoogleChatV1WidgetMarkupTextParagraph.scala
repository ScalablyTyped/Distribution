package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleChatV1WidgetMarkupTextParagraph extends StObject {
  
  var text: js.UndefOr[String] = js.undefined
}
object GoogleChatV1WidgetMarkupTextParagraph {
  
  inline def apply(): GoogleChatV1WidgetMarkupTextParagraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleChatV1WidgetMarkupTextParagraph]
  }
  
  extension [Self <: GoogleChatV1WidgetMarkupTextParagraph](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
