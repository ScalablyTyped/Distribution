package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreadcrumbOptions extends StObject {
  
  var bindToLocation: js.UndefOr[Boolean] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ BreadcrumbChangeEvent, Unit]] = js.undefined
  
  var click: js.UndefOr[js.Function1[/* e */ BreadcrumbClickEvent, Unit]] = js.undefined
  
  var delimiterIcon: js.UndefOr[String] = js.undefined
  
  var editable: js.UndefOr[Boolean] = js.undefined
  
  var gap: js.UndefOr[Double] = js.undefined
  
  var items: js.UndefOr[js.Array[BreadcrumbItem]] = js.undefined
  
  var messages: js.UndefOr[BreadcrumbMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var navigational: js.UndefOr[Boolean] = js.undefined
  
  var rootIcon: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object BreadcrumbOptions {
  
  inline def apply(): BreadcrumbOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadcrumbOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BreadcrumbOptions] (val x: Self) extends AnyVal {
    
    inline def setBindToLocation(value: Boolean): Self = StObject.set(x, "bindToLocation", value.asInstanceOf[js.Any])
    
    inline def setBindToLocationUndefined: Self = StObject.set(x, "bindToLocation", js.undefined)
    
    inline def setChange(value: /* e */ BreadcrumbChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setClick(value: /* e */ BreadcrumbClickEvent => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setDelimiterIcon(value: String): Self = StObject.set(x, "delimiterIcon", value.asInstanceOf[js.Any])
    
    inline def setDelimiterIconUndefined: Self = StObject.set(x, "delimiterIcon", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setItems(value: js.Array[BreadcrumbItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: BreadcrumbItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMessages(value: BreadcrumbMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNavigational(value: Boolean): Self = StObject.set(x, "navigational", value.asInstanceOf[js.Any])
    
    inline def setNavigationalUndefined: Self = StObject.set(x, "navigational", js.undefined)
    
    inline def setRootIcon(value: String): Self = StObject.set(x, "rootIcon", value.asInstanceOf[js.Any])
    
    inline def setRootIconUndefined: Self = StObject.set(x, "rootIcon", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
