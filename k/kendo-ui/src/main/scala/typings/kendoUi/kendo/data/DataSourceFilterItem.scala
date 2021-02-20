package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceFilterItem extends DataSourceFilter {
  
  var field: js.UndefOr[String] = js.native
  
  var operator: js.UndefOr[String | js.Function] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object DataSourceFilterItem {
  
  @scala.inline
  def apply(): DataSourceFilterItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceFilterItem]
  }
  
  @scala.inline
  implicit class DataSourceFilterItemMutableBuilder[Self <: DataSourceFilterItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setOperator(value: String | js.Function): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
