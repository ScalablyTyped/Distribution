package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveCellChangingEventUIParam extends StObject {
  
  /**
    * Gets reference to the cell object.
    */
  var cell: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets reference to GridSelection.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object ActiveCellChangingEventUIParam {
  
  @scala.inline
  def apply(): ActiveCellChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveCellChangingEventUIParam]
  }
  
  @scala.inline
  implicit class ActiveCellChangingEventUIParamMutableBuilder[Self <: ActiveCellChangingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCell(value: js.Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
