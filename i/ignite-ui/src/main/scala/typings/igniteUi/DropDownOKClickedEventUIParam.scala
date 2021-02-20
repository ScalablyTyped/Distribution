package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropDownOKClickedEventUIParam extends StObject {
  
  /**
    * Gets the column key for which OK button is clicked.
    */
  var columnKey: js.UndefOr[String] = js.native
  
  /**
    * Gets data for summary methods. Format of event data is {type: "min", active: false};
    */
  var eventData: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the igGridSummaries widget object.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object DropDownOKClickedEventUIParam {
  
  @scala.inline
  def apply(): DropDownOKClickedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownOKClickedEventUIParam]
  }
  
  @scala.inline
  implicit class DropDownOKClickedEventUIParamMutableBuilder[Self <: DropDownOKClickedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    @scala.inline
    def setEventData(value: js.Any): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDataUndefined: Self = StObject.set(x, "eventData", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
