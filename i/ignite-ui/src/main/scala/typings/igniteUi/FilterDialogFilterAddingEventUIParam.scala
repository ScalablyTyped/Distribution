package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterDialogFilterAddingEventUIParam extends StObject {
  
  /**
    * Gets reference to filters table body DOM element.
    */
  var filtersTableBody: js.UndefOr[String] = js.native
  
  /**
    * Gets reference to GridFiltering.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object FilterDialogFilterAddingEventUIParam {
  
  @scala.inline
  def apply(): FilterDialogFilterAddingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDialogFilterAddingEventUIParam]
  }
  
  @scala.inline
  implicit class FilterDialogFilterAddingEventUIParamMutableBuilder[Self <: FilterDialogFilterAddingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiltersTableBody(value: String): Self = StObject.set(x, "filtersTableBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersTableBodyUndefined: Self = StObject.set(x, "filtersTableBody", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
