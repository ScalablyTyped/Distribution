package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSortItem extends StObject {
  
  var compare: js.UndefOr[js.Function] = js.undefined
  
  var dir: js.UndefOr[String] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
}
object DataSourceSortItem {
  
  inline def apply(): DataSourceSortItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSortItem]
  }
  
  extension [Self <: DataSourceSortItem](x: Self) {
    
    inline def setCompare(value: js.Function): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
