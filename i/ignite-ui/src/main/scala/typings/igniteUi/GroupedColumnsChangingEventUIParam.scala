package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupedColumnsChangingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the current child grid element, in case it's an hierarchical grid(not set if called from modal dialog).
    */
  var grid: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the current groupedColumns.
    */
  var groupedColumns: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Gets a reference to the current column's key that's being grouped(not set if called from modal dialog).
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the current layout object, if any(not set if called from modal dialog).
    */
  var layout: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the object of the new grouped columns that should be applied.(it is set ONLY if called from modal dialog)
    */
  var newGroupedColumns: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets access the GroupBy widget object.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets which user interaction triggers the event - possible options are dragAndDrop|modalDialog|sortStateChanged|removeButton|regroup.
    */
  var triggeredBy: js.UndefOr[String] = js.undefined
}
object GroupedColumnsChangingEventUIParam {
  
  @scala.inline
  def apply(): GroupedColumnsChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupedColumnsChangingEventUIParam]
  }
  
  @scala.inline
  implicit class GroupedColumnsChangingEventUIParamMutableBuilder[Self <: GroupedColumnsChangingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrid(value: js.Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    @scala.inline
    def setGroupedColumns(value: js.Array[js.Any]): Self = StObject.set(x, "groupedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupedColumnsUndefined: Self = StObject.set(x, "groupedColumns", js.undefined)
    
    @scala.inline
    def setGroupedColumnsVarargs(value: js.Any*): Self = StObject.set(x, "groupedColumns", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLayout(value: js.Any): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setNewGroupedColumns(value: js.Any): Self = StObject.set(x, "newGroupedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewGroupedColumnsUndefined: Self = StObject.set(x, "newGroupedColumns", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setTriggeredBy(value: String): Self = StObject.set(x, "triggeredBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggeredByUndefined: Self = StObject.set(x, "triggeredBy", js.undefined)
  }
}
