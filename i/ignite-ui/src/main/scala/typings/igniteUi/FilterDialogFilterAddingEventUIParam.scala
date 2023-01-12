package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterDialogFilterAddingEventUIParam extends StObject {
  
  /**
    * Gets reference to filters table body DOM element.
    */
  var filtersTableBody: js.UndefOr[String] = js.undefined
  
  /**
    * Gets reference to GridFiltering.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object FilterDialogFilterAddingEventUIParam {
  
  inline def apply(): FilterDialogFilterAddingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDialogFilterAddingEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterDialogFilterAddingEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setFiltersTableBody(value: String): Self = StObject.set(x, "filtersTableBody", value.asInstanceOf[js.Any])
    
    inline def setFiltersTableBodyUndefined: Self = StObject.set(x, "filtersTableBody", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
