package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDownCancelClickedEventUIParam extends StObject {
  
  /**
    * Gets the column key for which Cancel button is clicked.
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the igGridSummaries widget object.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object DropDownCancelClickedEventUIParam {
  
  inline def apply(): DropDownCancelClickedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownCancelClickedEventUIParam]
  }
  
  extension [Self <: DropDownCancelClickedEventUIParam](x: Self) {
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
