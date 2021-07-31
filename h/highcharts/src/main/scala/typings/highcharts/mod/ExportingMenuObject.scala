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
  
  @scala.inline
  def apply(): ExportingMenuObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportingMenuObject]
  }
  
  @scala.inline
  implicit class ExportingMenuObjectMutableBuilder[Self <: ExportingMenuObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnclick(value: EventCallbackFunction[Chart_]): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    @scala.inline
    def setSeparator(value: Boolean): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextKey(value: String): Self = StObject.set(x, "textKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextKeyUndefined: Self = StObject.set(x, "textKey", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
