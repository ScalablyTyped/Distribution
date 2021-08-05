package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowDeletingEventUIParam extends StObject {
  
  /**
    * Gets a jQuery object containing the TR element of the row to delete.
    */
  var element: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the row's PK value.
    */
  var rowID: js.UndefOr[js.Any] = js.undefined
}
object RowDeletingEventUIParam {
  
  inline def apply(): RowDeletingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowDeletingEventUIParam]
  }
  
  extension [Self <: RowDeletingEventUIParam](x: Self) {
    
    inline def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRowID(value: js.Any): Self = StObject.set(x, "rowID", value.asInstanceOf[js.Any])
    
    inline def setRowIDUndefined: Self = StObject.set(x, "rowID", js.undefined)
  }
}
