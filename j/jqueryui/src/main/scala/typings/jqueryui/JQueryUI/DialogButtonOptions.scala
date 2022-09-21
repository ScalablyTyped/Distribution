package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogButtonOptions
  extends StObject
     with /* attr */ StringDictionary[Any] {
  
  var click: js.UndefOr[js.Function1[/* eventObject */ JQueryEventObject, Any]] = js.undefined
  
  var icons: js.UndefOr[Any] = js.undefined
  
  var showText: js.UndefOr[String | Boolean] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object DialogButtonOptions {
  
  inline def apply(): DialogButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogButtonOptions]
  }
  
  extension [Self <: DialogButtonOptions](x: Self) {
    
    inline def setClick(value: /* eventObject */ JQueryEventObject => Any): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setIcons(value: Any): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setShowText(value: String | Boolean): Self = StObject.set(x, "showText", value.asInstanceOf[js.Any])
    
    inline def setShowTextUndefined: Self = StObject.set(x, "showText", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
