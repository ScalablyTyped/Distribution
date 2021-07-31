package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSortItem extends StObject {
  
  var dir: js.UndefOr[String] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
}
object DataSourceSortItem {
  
  @scala.inline
  def apply(): DataSourceSortItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSortItem]
  }
  
  @scala.inline
  implicit class DataSourceSortItemMutableBuilder[Self <: DataSourceSortItem] (val x: Self) extends AnyVal {
    
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
