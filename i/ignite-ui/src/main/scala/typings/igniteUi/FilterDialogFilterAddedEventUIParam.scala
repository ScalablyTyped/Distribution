package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterDialogFilterAddedEventUIParam extends StObject {
  
  /**
    * Gets reference to the filters table row DOM element.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Gets reference to GridFiltering.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object FilterDialogFilterAddedEventUIParam {
  
  @scala.inline
  def apply(): FilterDialogFilterAddedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDialogFilterAddedEventUIParam]
  }
  
  @scala.inline
  implicit class FilterDialogFilterAddedEventUIParamMutableBuilder[Self <: FilterDialogFilterAddedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
