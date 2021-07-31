package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeListPageable extends StObject {
  
  var alwaysVisible: js.UndefOr[Boolean] = js.undefined
  
  var buttonCount: js.UndefOr[Double] = js.undefined
  
  var info: js.UndefOr[Boolean] = js.undefined
  
  var input: js.UndefOr[Boolean] = js.undefined
  
  var messages: js.UndefOr[TreeListPageableMessages] = js.undefined
  
  var numeric: js.UndefOr[Boolean] = js.undefined
  
  var pageSize: js.UndefOr[Double] = js.undefined
  
  var pageSizes: js.UndefOr[Boolean | js.Any] = js.undefined
  
  var previousNext: js.UndefOr[Boolean] = js.undefined
  
  var refresh: js.UndefOr[Boolean] = js.undefined
  
  var responsive: js.UndefOr[Boolean] = js.undefined
}
object TreeListPageable {
  
  @scala.inline
  def apply(): TreeListPageable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListPageable]
  }
  
  @scala.inline
  implicit class TreeListPageableMutableBuilder[Self <: TreeListPageable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysVisible(value: Boolean): Self = StObject.set(x, "alwaysVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysVisibleUndefined: Self = StObject.set(x, "alwaysVisible", js.undefined)
    
    @scala.inline
    def setButtonCount(value: Double): Self = StObject.set(x, "buttonCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonCountUndefined: Self = StObject.set(x, "buttonCount", js.undefined)
    
    @scala.inline
    def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setInput(value: Boolean): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setMessages(value: TreeListPageableMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageSizes(value: Boolean | js.Any): Self = StObject.set(x, "pageSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizesUndefined: Self = StObject.set(x, "pageSizes", js.undefined)
    
    @scala.inline
    def setPreviousNext(value: Boolean): Self = StObject.set(x, "previousNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousNextUndefined: Self = StObject.set(x, "previousNext", js.undefined)
    
    @scala.inline
    def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    @scala.inline
    def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
  }
}
