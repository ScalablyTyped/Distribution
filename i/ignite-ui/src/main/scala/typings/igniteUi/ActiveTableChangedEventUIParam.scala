package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveTableChangedEventUIParam extends StObject {
  
  /**
    * Gets the current active [Table](ig.excel.WorksheetTable).
    */
  var newActiveTable: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the previous active [Table](ig.excel.WorksheetTable).
    */
  var oldActiveTable: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ActiveTableChangedEventUIParam {
  
  @scala.inline
  def apply(): ActiveTableChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveTableChangedEventUIParam]
  }
  
  @scala.inline
  implicit class ActiveTableChangedEventUIParamMutableBuilder[Self <: ActiveTableChangedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewActiveTable(value: js.Any): Self = StObject.set(x, "newActiveTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewActiveTableUndefined: Self = StObject.set(x, "newActiveTable", js.undefined)
    
    @scala.inline
    def setOldActiveTable(value: js.Any): Self = StObject.set(x, "oldActiveTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldActiveTableUndefined: Self = StObject.set(x, "oldActiveTable", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
