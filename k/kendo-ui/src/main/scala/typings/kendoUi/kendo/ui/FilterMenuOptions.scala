package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterMenuOptions extends StObject {
  
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  
  var extra: js.UndefOr[Boolean] = js.native
  
  var field: js.UndefOr[String] = js.native
  
  var messages: js.UndefOr[FilterMenuMessages] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var operators: js.UndefOr[FilterMenuOperators] = js.native
}
object FilterMenuOptions {
  
  @scala.inline
  def apply(): FilterMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterMenuOptions]
  }
  
  @scala.inline
  implicit class FilterMenuOptionsMutableBuilder[Self <: FilterMenuOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSource(value: js.Any | DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setExtra(value: Boolean): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setMessages(value: FilterMenuMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOperators(value: FilterMenuOperators): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorsUndefined: Self = StObject.set(x, "operators", js.undefined)
  }
}
