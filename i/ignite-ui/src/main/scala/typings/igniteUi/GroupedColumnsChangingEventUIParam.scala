package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupedColumnsChangingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the current child grid element, in case it's an hierarchical grid(not set if called from modal dialog).
    */
  var grid: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the current groupedColumns.
    */
  var groupedColumns: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Gets a reference to the current column's key that's being grouped(not set if called from modal dialog).
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the current layout object, if any(not set if called from modal dialog).
    */
  var layout: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the object of the new grouped columns that should be applied.(it is set ONLY if called from modal dialog)
    */
  var newGroupedColumns: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets access the GroupBy widget object.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets which user interaction triggers the event - possible options are dragAndDrop|modalDialog|sortStateChanged|removeButton|regroup.
    */
  var triggeredBy: js.UndefOr[String] = js.undefined
}
object GroupedColumnsChangingEventUIParam {
  
  inline def apply(): GroupedColumnsChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupedColumnsChangingEventUIParam]
  }
  
  extension [Self <: GroupedColumnsChangingEventUIParam](x: Self) {
    
    inline def setGrid(value: Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setGroupedColumns(value: js.Array[Any]): Self = StObject.set(x, "groupedColumns", value.asInstanceOf[js.Any])
    
    inline def setGroupedColumnsUndefined: Self = StObject.set(x, "groupedColumns", js.undefined)
    
    inline def setGroupedColumnsVarargs(value: Any*): Self = StObject.set(x, "groupedColumns", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLayout(value: Any): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setNewGroupedColumns(value: Any): Self = StObject.set(x, "newGroupedColumns", value.asInstanceOf[js.Any])
    
    inline def setNewGroupedColumnsUndefined: Self = StObject.set(x, "newGroupedColumns", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setTriggeredBy(value: String): Self = StObject.set(x, "triggeredBy", value.asInstanceOf[js.Any])
    
    inline def setTriggeredByUndefined: Self = StObject.set(x, "triggeredBy", js.undefined)
  }
}
