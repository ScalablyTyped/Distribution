package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowAddedEventUIParam extends StObject {
  
  /**
    * Gets the default value (before editing) for the column with the specified key.
    */
  var oldValues: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the value for the column with the specified key.
    */
  var values: js.UndefOr[js.Any] = js.undefined
}
object RowAddedEventUIParam {
  
  inline def apply(): RowAddedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowAddedEventUIParam]
  }
  
  extension [Self <: RowAddedEventUIParam](x: Self) {
    
    inline def setOldValues(value: js.Any): Self = StObject.set(x, "oldValues", value.asInstanceOf[js.Any])
    
    inline def setOldValuesUndefined: Self = StObject.set(x, "oldValues", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
