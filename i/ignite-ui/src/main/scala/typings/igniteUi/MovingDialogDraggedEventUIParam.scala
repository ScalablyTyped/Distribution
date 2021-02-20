package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MovingDialogDraggedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the ColumnMoving widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object MovingDialogDraggedEventUIParam {
  
  @scala.inline
  def apply(): MovingDialogDraggedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MovingDialogDraggedEventUIParam]
  }
  
  @scala.inline
  implicit class MovingDialogDraggedEventUIParamMutableBuilder[Self <: MovingDialogDraggedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
