package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditRowEndedEventUIParam extends StObject {
  
  /**
    * Gets the old value for the column with the specified key.
    */
  var oldValues: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Check if the edit mode is for adding a new row.
    */
  var rowAdding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the row's PK value.
    */
  var rowID: js.UndefOr[Any] = js.undefined
  
  /**
    * Check if any of the values is changed which will cause update in the data source.
    */
  var update: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the new value for the column with the specified key.
    */
  var values: js.UndefOr[Any] = js.undefined
}
object EditRowEndedEventUIParam {
  
  inline def apply(): EditRowEndedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditRowEndedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditRowEndedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setOldValues(value: Any): Self = StObject.set(x, "oldValues", value.asInstanceOf[js.Any])
    
    inline def setOldValuesUndefined: Self = StObject.set(x, "oldValues", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRowAdding(value: Boolean): Self = StObject.set(x, "rowAdding", value.asInstanceOf[js.Any])
    
    inline def setRowAddingUndefined: Self = StObject.set(x, "rowAdding", js.undefined)
    
    inline def setRowID(value: Any): Self = StObject.set(x, "rowID", value.asInstanceOf[js.Any])
    
    inline def setRowIDUndefined: Self = StObject.set(x, "rowID", js.undefined)
    
    inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
