package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivePaneChangedEventUIParam extends StObject {
  
  /**
    * Gets the active cell of the new active pane or null if there is no active pane.
    */
  var activeCell: js.UndefOr[String] = js.native
  
  /**
    * Gets the current active [pane](ig.spreadsheet.SpreadsheetPane).
    */
  var newActivePane: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the previous active [pane](ig.spreadsheet.SpreadsheetPane).
    */
  var oldActivePane: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the current visible range of the new active pane or null if there is no active pane.
    */
  var visibleRange: js.UndefOr[String] = js.native
}
object ActivePaneChangedEventUIParam {
  
  @scala.inline
  def apply(): ActivePaneChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivePaneChangedEventUIParam]
  }
  
  @scala.inline
  implicit class ActivePaneChangedEventUIParamMutableBuilder[Self <: ActivePaneChangedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveCell(value: String): Self = StObject.set(x, "activeCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveCellUndefined: Self = StObject.set(x, "activeCell", js.undefined)
    
    @scala.inline
    def setNewActivePane(value: js.Any): Self = StObject.set(x, "newActivePane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewActivePaneUndefined: Self = StObject.set(x, "newActivePane", js.undefined)
    
    @scala.inline
    def setOldActivePane(value: js.Any): Self = StObject.set(x, "oldActivePane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldActivePaneUndefined: Self = StObject.set(x, "oldActivePane", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setVisibleRange(value: String): Self = StObject.set(x, "visibleRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleRangeUndefined: Self = StObject.set(x, "visibleRange", js.undefined)
  }
}
