package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowAddingEventUIParam extends StObject {
  
  /**
    * Gets the default value (before editing) for the column with the specified key.
    */
  var oldValues: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the value for the column with the specified key.
    */
  var values: js.UndefOr[Any] = js.undefined
}
object RowAddingEventUIParam {
  
  inline def apply(): RowAddingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowAddingEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowAddingEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setOldValues(value: Any): Self = StObject.set(x, "oldValues", value.asInstanceOf[js.Any])
    
    inline def setOldValuesUndefined: Self = StObject.set(x, "oldValues", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
