package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveTableChangedEventUIParam extends StObject {
  
  /**
    * Gets the current active [Table](ig.excel.WorksheetTable).
    */
  var newActiveTable: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the previous active [Table](ig.excel.WorksheetTable).
    */
  var oldActiveTable: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object ActiveTableChangedEventUIParam {
  
  inline def apply(): ActiveTableChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveTableChangedEventUIParam]
  }
  
  extension [Self <: ActiveTableChangedEventUIParam](x: Self) {
    
    inline def setNewActiveTable(value: js.Any): Self = StObject.set(x, "newActiveTable", value.asInstanceOf[js.Any])
    
    inline def setNewActiveTableUndefined: Self = StObject.set(x, "newActiveTable", js.undefined)
    
    inline def setOldActiveTable(value: js.Any): Self = StObject.set(x, "oldActiveTable", value.asInstanceOf[js.Any])
    
    inline def setOldActiveTableUndefined: Self = StObject.set(x, "oldActiveTable", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
