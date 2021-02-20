package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditModeExitedEventUIParam extends StObject {
  
  /**
    * Gets the cell for which the control has exited edit mode.
    */
  var cell: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object EditModeExitedEventUIParam {
  
  @scala.inline
  def apply(): EditModeExitedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditModeExitedEventUIParam]
  }
  
  @scala.inline
  implicit class EditModeExitedEventUIParamMutableBuilder[Self <: EditModeExitedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCell(value: String): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
