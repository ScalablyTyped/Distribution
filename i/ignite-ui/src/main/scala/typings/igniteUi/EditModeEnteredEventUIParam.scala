package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditModeEnteredEventUIParam extends StObject {
  
  /**
    * Gets the cell for which the control has entered edit mode.
    */
  var cell: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object EditModeEnteredEventUIParam {
  
  @scala.inline
  def apply(): EditModeEnteredEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditModeEnteredEventUIParam]
  }
  
  @scala.inline
  implicit class EditModeEnteredEventUIParamMutableBuilder[Self <: EditModeEnteredEventUIParam] (val x: Self) extends AnyVal {
    
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
