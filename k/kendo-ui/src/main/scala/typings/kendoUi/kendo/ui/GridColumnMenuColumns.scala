package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridColumnMenuColumns extends StObject {
  
  var groups: js.UndefOr[js.Array[GridColumnMenuColumnsGroup]] = js.undefined
  
  var sort: js.UndefOr[String] = js.undefined
}
object GridColumnMenuColumns {
  
  inline def apply(): GridColumnMenuColumns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnMenuColumns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridColumnMenuColumns] (val x: Self) extends AnyVal {
    
    inline def setGroups(value: js.Array[GridColumnMenuColumnsGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: GridColumnMenuColumnsGroup*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
