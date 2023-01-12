package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportingMenuObject extends StObject {
  
  /**
    * The click handler for the menu item.
    */
  var onclick: js.UndefOr[EventCallbackFunction[Chart_]] = js.undefined
  
  /**
    * Indicates a separator line instead of an item.
    */
  var separator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The text for the menu item.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * If internationalization is required, the key to a language string.
    */
  var textKey: js.UndefOr[String] = js.undefined
}
object ExportingMenuObject {
  
  inline def apply(): ExportingMenuObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportingMenuObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportingMenuObject] (val x: Self) extends AnyVal {
    
    inline def setOnclick(value: EventCallbackFunction[Chart_]): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
    
    inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    inline def setSeparator(value: Boolean): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextKey(value: String): Self = StObject.set(x, "textKey", value.asInstanceOf[js.Any])
    
    inline def setTextKeyUndefined: Self = StObject.set(x, "textKey", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
