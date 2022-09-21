package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleChatV1WidgetMarkupOpenLink extends StObject {
  
  /** The URL to open. */
  var url: js.UndefOr[String] = js.undefined
}
object GoogleChatV1WidgetMarkupOpenLink {
  
  inline def apply(): GoogleChatV1WidgetMarkupOpenLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleChatV1WidgetMarkupOpenLink]
  }
  
  extension [Self <: GoogleChatV1WidgetMarkupOpenLink](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
