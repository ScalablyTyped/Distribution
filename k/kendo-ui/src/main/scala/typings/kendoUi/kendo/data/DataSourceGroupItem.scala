package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceGroupItem extends StObject {
  
  var aggregates: js.UndefOr[js.Array[DataSourceGroupItemAggregate]] = js.undefined
  
  var compare: js.UndefOr[
    js.Function2[/* a */ DataSourceGroupCompareItem, /* b */ DataSourceGroupCompareItem, Double]
  ] = js.undefined
  
  var dir: js.UndefOr[String] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
}
object DataSourceGroupItem {
  
  @scala.inline
  def apply(): DataSourceGroupItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceGroupItem]
  }
  
  @scala.inline
  implicit class DataSourceGroupItemMutableBuilder[Self <: DataSourceGroupItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregates(value: js.Array[DataSourceGroupItemAggregate]): Self = StObject.set(x, "aggregates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregatesUndefined: Self = StObject.set(x, "aggregates", js.undefined)
    
    @scala.inline
    def setAggregatesVarargs(value: DataSourceGroupItemAggregate*): Self = StObject.set(x, "aggregates", js.Array(value :_*))
    
    @scala.inline
    def setCompare(value: (/* a */ DataSourceGroupCompareItem, /* b */ DataSourceGroupCompareItem) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
