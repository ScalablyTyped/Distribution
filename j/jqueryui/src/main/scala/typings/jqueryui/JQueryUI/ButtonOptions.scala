package typings.jqueryui.JQueryUI

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Button //////////////////////////////////////////////////
trait ButtonOptions extends StObject {
  
  var click: js.UndefOr[js.Function1[/* event */ js.UndefOr[Event], Unit]] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var icons: js.UndefOr[js.Any] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String | Boolean] = js.undefined
}
object ButtonOptions {
  
  inline def apply(): ButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonOptions]
  }
  
  extension [Self <: ButtonOptions](x: Self) {
    
    inline def setClick(value: /* event */ js.UndefOr[Event] => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIcons(value: js.Any): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setText(value: String | Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
