package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgSpreadsheetSelectionChangedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Get the [pane](ig.spreadsheet.SpreadsheetPane) for which the selection has changed.
    */
  var pane: js.UndefOr[js.Any] = js.native
}
object IgSpreadsheetSelectionChangedEventUIParam {
  
  @scala.inline
  def apply(): IgSpreadsheetSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSpreadsheetSelectionChangedEventUIParam]
  }
  
  @scala.inline
  implicit class IgSpreadsheetSelectionChangedEventUIParamMutableBuilder[Self <: IgSpreadsheetSelectionChangedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setPane(value: js.Any): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
  }
}
