package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleChatV1ContextualAddOnMarkupCardSection extends StObject {
  
  /** The header of the section, text formatted supported. */
  var header: js.UndefOr[String] = js.undefined
  
  /** A section must contain at least 1 widget. */
  var widgets: js.UndefOr[js.Array[GoogleChatV1WidgetMarkup]] = js.undefined
}
object GoogleChatV1ContextualAddOnMarkupCardSection {
  
  inline def apply(): GoogleChatV1ContextualAddOnMarkupCardSection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleChatV1ContextualAddOnMarkupCardSection]
  }
  
  extension [Self <: GoogleChatV1ContextualAddOnMarkupCardSection](x: Self) {
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setWidgets(value: js.Array[GoogleChatV1WidgetMarkup]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
    
    inline def setWidgetsUndefined: Self = StObject.set(x, "widgets", js.undefined)
    
    inline def setWidgetsVarargs(value: GoogleChatV1WidgetMarkup*): Self = StObject.set(x, "widgets", js.Array(value*))
  }
}
