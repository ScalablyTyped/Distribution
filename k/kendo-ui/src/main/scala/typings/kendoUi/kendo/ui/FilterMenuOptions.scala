package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterMenuOptions extends StObject {
  
  var dataSource: js.UndefOr[Any | DataSource] = js.undefined
  
  var extra: js.UndefOr[Boolean] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
  
  var messages: js.UndefOr[FilterMenuMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var operators: js.UndefOr[FilterMenuOperators] = js.undefined
}
object FilterMenuOptions {
  
  inline def apply(): FilterMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterMenuOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterMenuOptions] (val x: Self) extends AnyVal {
    
    inline def setDataSource(value: Any | DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setExtra(value: Boolean): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setMessages(value: FilterMenuMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperators(value: FilterMenuOperators): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    inline def setOperatorsUndefined: Self = StObject.set(x, "operators", js.undefined)
  }
}
