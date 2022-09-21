package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditRowStartingEventUIParam extends StObject {
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Checks if the edit mode is for adding a new row.
    */
  var rowAdding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the row's PK value.
    */
  var rowID: js.UndefOr[Any] = js.undefined
}
object EditRowStartingEventUIParam {
  
  inline def apply(): EditRowStartingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditRowStartingEventUIParam]
  }
  
  extension [Self <: EditRowStartingEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRowAdding(value: Boolean): Self = StObject.set(x, "rowAdding", value.asInstanceOf[js.Any])
    
    inline def setRowAddingUndefined: Self = StObject.set(x, "rowAdding", js.undefined)
    
    inline def setRowID(value: Any): Self = StObject.set(x, "rowID", value.asInstanceOf[js.Any])
    
    inline def setRowIDUndefined: Self = StObject.set(x, "rowID", js.undefined)
  }
}
