package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceParameterMapDataGroup extends StObject {
  
  var aggregate: js.UndefOr[js.Array[DataSourceParameterMapDataAggregate]] = js.native
  
  var dir: js.UndefOr[String] = js.native
  
  var field: js.UndefOr[String] = js.native
}
object DataSourceParameterMapDataGroup {
  
  @scala.inline
  def apply(): DataSourceParameterMapDataGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceParameterMapDataGroup]
  }
  
  @scala.inline
  implicit class DataSourceParameterMapDataGroupMutableBuilder[Self <: DataSourceParameterMapDataGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregate(value: js.Array[DataSourceParameterMapDataAggregate]): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    @scala.inline
    def setAggregateVarargs(value: DataSourceParameterMapDataAggregate*): Self = StObject.set(x, "aggregate", js.Array(value :_*))
    
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
