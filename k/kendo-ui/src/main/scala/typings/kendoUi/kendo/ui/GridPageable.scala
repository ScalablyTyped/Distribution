package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridPageable extends StObject {
  
  var alwaysVisible: js.UndefOr[Boolean] = js.undefined
  
  var buttonCount: js.UndefOr[Double] = js.undefined
  
  var info: js.UndefOr[Boolean] = js.undefined
  
  var input: js.UndefOr[Boolean] = js.undefined
  
  var messages: js.UndefOr[GridPageableMessages] = js.undefined
  
  var numeric: js.UndefOr[Boolean] = js.undefined
  
  var pageSize: js.UndefOr[Double] = js.undefined
  
  var pageSizes: js.UndefOr[Boolean | Any] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var previousNext: js.UndefOr[Boolean] = js.undefined
  
  var refresh: js.UndefOr[Boolean] = js.undefined
  
  var responsive: js.UndefOr[Boolean] = js.undefined
}
object GridPageable {
  
  inline def apply(): GridPageable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridPageable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridPageable] (val x: Self) extends AnyVal {
    
    inline def setAlwaysVisible(value: Boolean): Self = StObject.set(x, "alwaysVisible", value.asInstanceOf[js.Any])
    
    inline def setAlwaysVisibleUndefined: Self = StObject.set(x, "alwaysVisible", js.undefined)
    
    inline def setButtonCount(value: Double): Self = StObject.set(x, "buttonCount", value.asInstanceOf[js.Any])
    
    inline def setButtonCountUndefined: Self = StObject.set(x, "buttonCount", js.undefined)
    
    inline def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setInput(value: Boolean): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setMessages(value: GridPageableMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    inline def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageSizes(value: Boolean | Any): Self = StObject.set(x, "pageSizes", value.asInstanceOf[js.Any])
    
    inline def setPageSizesUndefined: Self = StObject.set(x, "pageSizes", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPreviousNext(value: Boolean): Self = StObject.set(x, "previousNext", value.asInstanceOf[js.Any])
    
    inline def setPreviousNextUndefined: Self = StObject.set(x, "previousNext", js.undefined)
    
    inline def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
  }
}
