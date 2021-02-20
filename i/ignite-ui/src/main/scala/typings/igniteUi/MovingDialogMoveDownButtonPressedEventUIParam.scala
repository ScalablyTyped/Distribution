package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MovingDialogMoveDownButtonPressedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the ColumnMoving widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object MovingDialogMoveDownButtonPressedEventUIParam {
  
  @scala.inline
  def apply(): MovingDialogMoveDownButtonPressedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MovingDialogMoveDownButtonPressedEventUIParam]
  }
  
  @scala.inline
  implicit class MovingDialogMoveDownButtonPressedEventUIParamMutableBuilder[Self <: MovingDialogMoveDownButtonPressedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
