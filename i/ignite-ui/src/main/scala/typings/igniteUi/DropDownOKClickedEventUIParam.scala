package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDownOKClickedEventUIParam extends StObject {
  
  /**
    * Gets the column key for which OK button is clicked.
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Gets data for summary methods. Format of event data is {type: "min", active: false};
    */
  var eventData: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the igGridSummaries widget object.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object DropDownOKClickedEventUIParam {
  
  inline def apply(): DropDownOKClickedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownOKClickedEventUIParam]
  }
  
  extension [Self <: DropDownOKClickedEventUIParam](x: Self) {
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setEventData(value: js.Any): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
    
    inline def setEventDataUndefined: Self = StObject.set(x, "eventData", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
