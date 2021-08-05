package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Section extends StObject {
  
  /** The header of the section, text formatted supported. */
  var header: js.UndefOr[String] = js.undefined
  
  /** A section must contain at least 1 widget. */
  var widgets: js.UndefOr[js.Array[WidgetMarkup]] = js.undefined
}
object Section {
  
  inline def apply(): Section = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Section]
  }
  
  extension [Self <: Section](x: Self) {
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setWidgets(value: js.Array[WidgetMarkup]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
    
    inline def setWidgetsUndefined: Self = StObject.set(x, "widgets", js.undefined)
    
    inline def setWidgetsVarargs(value: WidgetMarkup*): Self = StObject.set(x, "widgets", js.Array(value :_*))
  }
}
