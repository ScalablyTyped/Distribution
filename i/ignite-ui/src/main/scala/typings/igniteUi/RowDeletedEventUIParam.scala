package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowDeletedEventUIParam extends StObject {
  
  /**
    * Gets a jQuery object containing the TR element of the deleted row.
    */
  var element: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the row's PK value.
    */
  var rowID: js.UndefOr[Any] = js.undefined
}
object RowDeletedEventUIParam {
  
  inline def apply(): RowDeletedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowDeletedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowDeletedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRowID(value: Any): Self = StObject.set(x, "rowID", value.asInstanceOf[js.Any])
    
    inline def setRowIDUndefined: Self = StObject.set(x, "rowID", js.undefined)
  }
}
