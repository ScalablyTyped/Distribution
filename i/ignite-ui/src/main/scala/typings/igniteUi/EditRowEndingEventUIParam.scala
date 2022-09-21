package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditRowEndingEventUIParam extends StObject {
  
  /**
    * Gets the old value for the column with the specified key.
    */
  var oldValues: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Checks if the edit mode is for adding a new row.
    */
  var rowAdding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Check if any of the values is changed which will cause update in the data source. Can be manually set to false to prevent this update.
    */
  var update: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or set the new value for the column with the specified key.
    */
  var values: js.UndefOr[Any] = js.undefined
}
object EditRowEndingEventUIParam {
  
  inline def apply(): EditRowEndingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditRowEndingEventUIParam]
  }
  
  extension [Self <: EditRowEndingEventUIParam](x: Self) {
    
    inline def setOldValues(value: Any): Self = StObject.set(x, "oldValues", value.asInstanceOf[js.Any])
    
    inline def setOldValuesUndefined: Self = StObject.set(x, "oldValues", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRowAdding(value: Boolean): Self = StObject.set(x, "rowAdding", value.asInstanceOf[js.Any])
    
    inline def setRowAddingUndefined: Self = StObject.set(x, "rowAdding", js.undefined)
    
    inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
