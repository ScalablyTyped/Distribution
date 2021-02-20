package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditRowEndedEventUIParam extends StObject {
  
  /**
    * Gets the old value for the column with the specified key.
    */
  var oldValues: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Check if the edit mode is for adding a new row.
    */
  var rowAdding: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets the row's PK value.
    */
  var rowID: js.UndefOr[js.Any] = js.native
  
  /**
    * Check if any of the values is changed which will cause update in the data source.
    */
  var update: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets the new value for the column with the specified key.
    */
  var values: js.UndefOr[js.Any] = js.native
}
object EditRowEndedEventUIParam {
  
  @scala.inline
  def apply(): EditRowEndedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditRowEndedEventUIParam]
  }
  
  @scala.inline
  implicit class EditRowEndedEventUIParamMutableBuilder[Self <: EditRowEndedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldValues(value: js.Any): Self = StObject.set(x, "oldValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValuesUndefined: Self = StObject.set(x, "oldValues", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setRowAdding(value: Boolean): Self = StObject.set(x, "rowAdding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowAddingUndefined: Self = StObject.set(x, "rowAdding", js.undefined)
    
    @scala.inline
    def setRowID(value: js.Any): Self = StObject.set(x, "rowID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIDUndefined: Self = StObject.set(x, "rowID", js.undefined)
    
    @scala.inline
    def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    @scala.inline
    def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
