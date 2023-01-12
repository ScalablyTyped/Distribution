package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivePaneChangedEventUIParam extends StObject {
  
  /**
    * Gets the active cell of the new active pane or null if there is no active pane.
    */
  var activeCell: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the current active [pane](ig.spreadsheet.SpreadsheetPane).
    */
  var newActivePane: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the previous active [pane](ig.spreadsheet.SpreadsheetPane).
    */
  var oldActivePane: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the current visible range of the new active pane or null if there is no active pane.
    */
  var visibleRange: js.UndefOr[String] = js.undefined
}
object ActivePaneChangedEventUIParam {
  
  inline def apply(): ActivePaneChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivePaneChangedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActivePaneChangedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setActiveCell(value: String): Self = StObject.set(x, "activeCell", value.asInstanceOf[js.Any])
    
    inline def setActiveCellUndefined: Self = StObject.set(x, "activeCell", js.undefined)
    
    inline def setNewActivePane(value: Any): Self = StObject.set(x, "newActivePane", value.asInstanceOf[js.Any])
    
    inline def setNewActivePaneUndefined: Self = StObject.set(x, "newActivePane", js.undefined)
    
    inline def setOldActivePane(value: Any): Self = StObject.set(x, "oldActivePane", value.asInstanceOf[js.Any])
    
    inline def setOldActivePaneUndefined: Self = StObject.set(x, "oldActivePane", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setVisibleRange(value: String): Self = StObject.set(x, "visibleRange", value.asInstanceOf[js.Any])
    
    inline def setVisibleRangeUndefined: Self = StObject.set(x, "visibleRange", js.undefined)
  }
}
