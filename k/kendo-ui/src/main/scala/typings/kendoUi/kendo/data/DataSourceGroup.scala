package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceGroup extends DataSourceItemOrGroup {
  
  var aggregates: js.Array[_] = js.native
  
  var field: String = js.native
  
  var hasSubgroups: Boolean = js.native
  
  var items: js.Array[DataSourceItemOrGroup] = js.native
  
  var value: js.Any = js.native
}
object DataSourceGroup {
  
  @scala.inline
  def apply(
    aggregates: js.Array[_],
    field: String,
    hasSubgroups: Boolean,
    items: js.Array[DataSourceItemOrGroup],
    value: js.Any
  ): DataSourceGroup = {
    val __obj = js.Dynamic.literal(aggregates = aggregates.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hasSubgroups = hasSubgroups.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceGroup]
  }
  
  @scala.inline
  implicit class DataSourceGroupMutableBuilder[Self <: DataSourceGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregates(value: js.Array[_]): Self = StObject.set(x, "aggregates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregatesVarargs(value: js.Any*): Self = StObject.set(x, "aggregates", js.Array(value :_*))
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSubgroups(value: Boolean): Self = StObject.set(x, "hasSubgroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[DataSourceItemOrGroup]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: DataSourceItemOrGroup*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
