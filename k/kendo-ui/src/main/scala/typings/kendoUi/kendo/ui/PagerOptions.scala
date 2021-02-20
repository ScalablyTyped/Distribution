package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagerOptions extends StObject {
  
  var autoBind: js.UndefOr[Boolean] = js.native
  
  var buttonCount: js.UndefOr[Double] = js.native
  
  var change: js.UndefOr[js.Function1[/* e */ PagerChangeEvent, Unit]] = js.native
  
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  
  var info: js.UndefOr[Boolean] = js.native
  
  var input: js.UndefOr[Boolean] = js.native
  
  var linkTemplate: js.UndefOr[String] = js.native
  
  var messages: js.UndefOr[PagerMessages] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var numeric: js.UndefOr[Boolean] = js.native
  
  var pageSizes: js.UndefOr[Boolean | js.Any] = js.native
  
  var previousNext: js.UndefOr[Boolean] = js.native
  
  var refresh: js.UndefOr[Boolean] = js.native
  
  var responsive: js.UndefOr[Boolean] = js.native
  
  var selectTemplate: js.UndefOr[String] = js.native
}
object PagerOptions {
  
  @scala.inline
  def apply(): PagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagerOptions]
  }
  
  @scala.inline
  implicit class PagerOptionsMutableBuilder[Self <: PagerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    @scala.inline
    def setButtonCount(value: Double): Self = StObject.set(x, "buttonCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonCountUndefined: Self = StObject.set(x, "buttonCount", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ PagerChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setInput(value: Boolean): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setLinkTemplate(value: String): Self = StObject.set(x, "linkTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkTemplateUndefined: Self = StObject.set(x, "linkTemplate", js.undefined)
    
    @scala.inline
    def setMessages(value: PagerMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    
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
    
    @scala.inline
    def setSelectTemplate(value: String): Self = StObject.set(x, "selectTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectTemplateUndefined: Self = StObject.set(x, "selectTemplate", js.undefined)
  }
}
