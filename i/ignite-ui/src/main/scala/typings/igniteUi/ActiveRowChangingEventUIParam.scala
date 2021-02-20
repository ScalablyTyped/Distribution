package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveRowChangingEventUIParam extends StObject {
  
  /**
    * Gets reference to GridSelection.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the row object.
    */
  var row: js.UndefOr[js.Any] = js.native
}
object ActiveRowChangingEventUIParam {
  
  @scala.inline
  def apply(): ActiveRowChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveRowChangingEventUIParam]
  }
  
  @scala.inline
  implicit class ActiveRowChangingEventUIParamMutableBuilder[Self <: ActiveRowChangingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setRow(value: js.Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
