package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceGroupItemAggregate extends StObject {
  
  var aggregate: js.UndefOr[String] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
}
object DataSourceGroupItemAggregate {
  
  @scala.inline
  def apply(): DataSourceGroupItemAggregate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceGroupItemAggregate]
  }
  
  @scala.inline
  implicit class DataSourceGroupItemAggregateMutableBuilder[Self <: DataSourceGroupItemAggregate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregate(value: String): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
