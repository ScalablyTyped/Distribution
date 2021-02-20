package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowDeletingEventUIParam extends StObject {
  
  /**
    * Gets a jQuery object containing the TR element of the row to delete.
    */
  var element: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the row's PK value.
    */
  var rowID: js.UndefOr[js.Any] = js.native
}
object RowDeletingEventUIParam {
  
  @scala.inline
  def apply(): RowDeletingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowDeletingEventUIParam]
  }
  
  @scala.inline
  implicit class RowDeletingEventUIParamMutableBuilder[Self <: RowDeletingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setRowID(value: js.Any): Self = StObject.set(x, "rowID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIDUndefined: Self = StObject.set(x, "rowID", js.undefined)
  }
}
