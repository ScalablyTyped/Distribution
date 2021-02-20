package typings.jqueryCleditor

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryCLEditorButtonDefinition extends StObject {
  
  var buttonClick: js.UndefOr[
    js.Function2[/* event */ Event, /* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]
  ] = js.native
  
  var command: js.UndefOr[String] = js.native
  
  var css: js.UndefOr[js.Any] = js.native
  
  var getEnabled: js.UndefOr[js.Function1[/* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]] = js.native
  
  var getPressed: js.UndefOr[js.Function1[/* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]] = js.native
  
  var image: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var popupClick: js.UndefOr[
    js.Function2[/* event */ Event, /* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]
  ] = js.native
  
  var popupContent: js.UndefOr[String] = js.native
  
  var popupName: js.UndefOr[String] = js.native
  
  var stripIndex: js.UndefOr[Double] = js.native
  
  var title: String = js.native
}
object JQueryCLEditorButtonDefinition {
  
  @scala.inline
  def apply(name: String, title: String): JQueryCLEditorButtonDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryCLEditorButtonDefinition]
  }
  
  @scala.inline
  implicit class JQueryCLEditorButtonDefinitionMutableBuilder[Self <: JQueryCLEditorButtonDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonClick(value: (/* event */ Event, /* data */ JQueryCLEditorButtonDefinitionEventData) => Boolean): Self = StObject.set(x, "buttonClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setButtonClickUndefined: Self = StObject.set(x, "buttonClick", js.undefined)
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setCss(value: js.Any): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setGetEnabled(value: /* data */ JQueryCLEditorButtonDefinitionEventData => Boolean): Self = StObject.set(x, "getEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetEnabledUndefined: Self = StObject.set(x, "getEnabled", js.undefined)
    
    @scala.inline
    def setGetPressed(value: /* data */ JQueryCLEditorButtonDefinitionEventData => Boolean): Self = StObject.set(x, "getPressed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPressedUndefined: Self = StObject.set(x, "getPressed", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupClick(value: (/* event */ Event, /* data */ JQueryCLEditorButtonDefinitionEventData) => Boolean): Self = StObject.set(x, "popupClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPopupClickUndefined: Self = StObject.set(x, "popupClick", js.undefined)
    
    @scala.inline
    def setPopupContent(value: String): Self = StObject.set(x, "popupContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupContentUndefined: Self = StObject.set(x, "popupContent", js.undefined)
    
    @scala.inline
    def setPopupName(value: String): Self = StObject.set(x, "popupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupNameUndefined: Self = StObject.set(x, "popupName", js.undefined)
    
    @scala.inline
    def setStripIndex(value: Double): Self = StObject.set(x, "stripIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripIndexUndefined: Self = StObject.set(x, "stripIndex", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
