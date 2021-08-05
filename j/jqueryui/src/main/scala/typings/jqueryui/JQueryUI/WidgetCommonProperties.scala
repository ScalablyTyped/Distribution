package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import typings.std.Document
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidgetCommonProperties extends StObject {
  
  var defaultElement: String
  
  var document: Document
  
  var element: JQuery
  
  var namespace: String
  
  var uuid: String
  
  var widgetEventPrefix: String
  
  var widgetFullName: String
  
  var window: Window
}
object WidgetCommonProperties {
  
  inline def apply(
    defaultElement: String,
    document: Document,
    element: JQuery,
    namespace: String,
    uuid: String,
    widgetEventPrefix: String,
    widgetFullName: String,
    window: Window
  ): WidgetCommonProperties = {
    val __obj = js.Dynamic.literal(defaultElement = defaultElement.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], widgetEventPrefix = widgetEventPrefix.asInstanceOf[js.Any], widgetFullName = widgetFullName.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetCommonProperties]
  }
  
  extension [Self <: WidgetCommonProperties](x: Self) {
    
    inline def setDefaultElement(value: String): Self = StObject.set(x, "defaultElement", value.asInstanceOf[js.Any])
    
    inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setElement(value: JQuery): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setWidgetEventPrefix(value: String): Self = StObject.set(x, "widgetEventPrefix", value.asInstanceOf[js.Any])
    
    inline def setWidgetFullName(value: String): Self = StObject.set(x, "widgetFullName", value.asInstanceOf[js.Any])
    
    inline def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
