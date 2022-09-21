package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagerOptions extends StObject {
  
  var ARIATemplate: js.UndefOr[String] = js.undefined
  
  var autoBind: js.UndefOr[Boolean] = js.undefined
  
  var buttonCount: js.UndefOr[Double] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ PagerChangeEvent, Unit]] = js.undefined
  
  var dataSource: js.UndefOr[Any | DataSource] = js.undefined
  
  var info: js.UndefOr[Boolean] = js.undefined
  
  var input: js.UndefOr[Boolean] = js.undefined
  
  var linkTemplate: js.UndefOr[String] = js.undefined
  
  var messages: js.UndefOr[PagerMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var navigatable: js.UndefOr[Boolean] = js.undefined
  
  var numeric: js.UndefOr[Boolean] = js.undefined
  
  var pageSizes: js.UndefOr[Boolean | Any] = js.undefined
  
  var previousNext: js.UndefOr[Boolean] = js.undefined
  
  var refresh: js.UndefOr[Boolean] = js.undefined
  
  var responsive: js.UndefOr[Boolean] = js.undefined
  
  var selectTemplate: js.UndefOr[String] = js.undefined
}
object PagerOptions {
  
  inline def apply(): PagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagerOptions]
  }
  
  extension [Self <: PagerOptions](x: Self) {
    
    inline def setARIATemplate(value: String): Self = StObject.set(x, "ARIATemplate", value.asInstanceOf[js.Any])
    
    inline def setARIATemplateUndefined: Self = StObject.set(x, "ARIATemplate", js.undefined)
    
    inline def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    inline def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    inline def setButtonCount(value: Double): Self = StObject.set(x, "buttonCount", value.asInstanceOf[js.Any])
    
    inline def setButtonCountUndefined: Self = StObject.set(x, "buttonCount", js.undefined)
    
    inline def setChange(value: /* e */ PagerChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setDataSource(value: Any | DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setInput(value: Boolean): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setLinkTemplate(value: String): Self = StObject.set(x, "linkTemplate", value.asInstanceOf[js.Any])
    
    inline def setLinkTemplateUndefined: Self = StObject.set(x, "linkTemplate", js.undefined)
    
    inline def setMessages(value: PagerMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNavigatable(value: Boolean): Self = StObject.set(x, "navigatable", value.asInstanceOf[js.Any])
    
    inline def setNavigatableUndefined: Self = StObject.set(x, "navigatable", js.undefined)
    
    inline def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    inline def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    
    inline def setPageSizes(value: Boolean | Any): Self = StObject.set(x, "pageSizes", value.asInstanceOf[js.Any])
    
    inline def setPageSizesUndefined: Self = StObject.set(x, "pageSizes", js.undefined)
    
    inline def setPreviousNext(value: Boolean): Self = StObject.set(x, "previousNext", value.asInstanceOf[js.Any])
    
    inline def setPreviousNextUndefined: Self = StObject.set(x, "previousNext", js.undefined)
    
    inline def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    inline def setSelectTemplate(value: String): Self = StObject.set(x, "selectTemplate", value.asInstanceOf[js.Any])
    
    inline def setSelectTemplateUndefined: Self = StObject.set(x, "selectTemplate", js.undefined)
  }
}
