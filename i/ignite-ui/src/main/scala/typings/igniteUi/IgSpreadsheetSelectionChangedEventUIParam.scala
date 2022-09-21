package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgSpreadsheetSelectionChangedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Get the [pane](ig.spreadsheet.SpreadsheetPane) for which the selection has changed.
    */
  var pane: js.UndefOr[Any] = js.undefined
}
object IgSpreadsheetSelectionChangedEventUIParam {
  
  inline def apply(): IgSpreadsheetSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSpreadsheetSelectionChangedEventUIParam]
  }
  
  extension [Self <: IgSpreadsheetSelectionChangedEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPane(value: Any): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
  }
}
