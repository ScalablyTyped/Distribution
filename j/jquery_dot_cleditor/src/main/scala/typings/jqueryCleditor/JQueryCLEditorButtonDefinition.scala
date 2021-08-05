package typings.jqueryCleditor

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryCLEditorButtonDefinition extends StObject {
  
  var buttonClick: js.UndefOr[
    js.Function2[/* event */ Event, /* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]
  ] = js.undefined
  
  var command: js.UndefOr[String] = js.undefined
  
  var css: js.UndefOr[js.Any] = js.undefined
  
  var getEnabled: js.UndefOr[js.Function1[/* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]] = js.undefined
  
  var getPressed: js.UndefOr[js.Function1[/* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]] = js.undefined
  
  var image: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var popupClick: js.UndefOr[
    js.Function2[/* event */ Event, /* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]
  ] = js.undefined
  
  var popupContent: js.UndefOr[String] = js.undefined
  
  var popupName: js.UndefOr[String] = js.undefined
  
  var stripIndex: js.UndefOr[Double] = js.undefined
  
  var title: String
}
object JQueryCLEditorButtonDefinition {
  
  inline def apply(name: String, title: String): JQueryCLEditorButtonDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryCLEditorButtonDefinition]
  }
  
  extension [Self <: JQueryCLEditorButtonDefinition](x: Self) {
    
    inline def setButtonClick(value: (/* event */ Event, /* data */ JQueryCLEditorButtonDefinitionEventData) => Boolean): Self = StObject.set(x, "buttonClick", js.Any.fromFunction2(value))
    
    inline def setButtonClickUndefined: Self = StObject.set(x, "buttonClick", js.undefined)
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setCss(value: js.Any): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setGetEnabled(value: /* data */ JQueryCLEditorButtonDefinitionEventData => Boolean): Self = StObject.set(x, "getEnabled", js.Any.fromFunction1(value))
    
    inline def setGetEnabledUndefined: Self = StObject.set(x, "getEnabled", js.undefined)
    
    inline def setGetPressed(value: /* data */ JQueryCLEditorButtonDefinitionEventData => Boolean): Self = StObject.set(x, "getPressed", js.Any.fromFunction1(value))
    
    inline def setGetPressedUndefined: Self = StObject.set(x, "getPressed", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPopupClick(value: (/* event */ Event, /* data */ JQueryCLEditorButtonDefinitionEventData) => Boolean): Self = StObject.set(x, "popupClick", js.Any.fromFunction2(value))
    
    inline def setPopupClickUndefined: Self = StObject.set(x, "popupClick", js.undefined)
    
    inline def setPopupContent(value: String): Self = StObject.set(x, "popupContent", value.asInstanceOf[js.Any])
    
    inline def setPopupContentUndefined: Self = StObject.set(x, "popupContent", js.undefined)
    
    inline def setPopupName(value: String): Self = StObject.set(x, "popupName", value.asInstanceOf[js.Any])
    
    inline def setPopupNameUndefined: Self = StObject.set(x, "popupName", js.undefined)
    
    inline def setStripIndex(value: Double): Self = StObject.set(x, "stripIndex", value.asInstanceOf[js.Any])
    
    inline def setStripIndexUndefined: Self = StObject.set(x, "stripIndex", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
