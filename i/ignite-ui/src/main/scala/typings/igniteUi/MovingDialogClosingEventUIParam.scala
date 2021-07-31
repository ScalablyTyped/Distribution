package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MovingDialogClosingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the ColumnMoving widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object MovingDialogClosingEventUIParam {
  
  @scala.inline
  def apply(): MovingDialogClosingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MovingDialogClosingEventUIParam]
  }
  
  @scala.inline
  implicit class MovingDialogClosingEventUIParamMutableBuilder[Self <: MovingDialogClosingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
