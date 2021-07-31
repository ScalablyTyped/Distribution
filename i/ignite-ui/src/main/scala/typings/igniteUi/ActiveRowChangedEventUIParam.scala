package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveRowChangedEventUIParam extends StObject {
  
  /**
    * Gets reference to GridSelection.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the row object.
    */
  var row: js.UndefOr[js.Any] = js.undefined
}
object ActiveRowChangedEventUIParam {
  
  @scala.inline
  def apply(): ActiveRowChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveRowChangedEventUIParam]
  }
  
  @scala.inline
  implicit class ActiveRowChangedEventUIParamMutableBuilder[Self <: ActiveRowChangedEventUIParam] (val x: Self) extends AnyVal {
    
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
