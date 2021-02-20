package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowAddingEventUIParam extends StObject {
  
  /**
    * Gets the default value (before editing) for the column with the specified key.
    */
  var oldValues: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the value for the column with the specified key.
    */
  var values: js.UndefOr[js.Any] = js.native
}
object RowAddingEventUIParam {
  
  @scala.inline
  def apply(): RowAddingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowAddingEventUIParam]
  }
  
  @scala.inline
  implicit class RowAddingEventUIParamMutableBuilder[Self <: RowAddingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldValues(value: js.Any): Self = StObject.set(x, "oldValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValuesUndefined: Self = StObject.set(x, "oldValues", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
