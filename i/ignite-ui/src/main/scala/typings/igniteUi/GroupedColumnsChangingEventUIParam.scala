package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupedColumnsChangingEventUIParam extends js.Object {
  
  /**
    * Gets a reference to the current child grid element, in case it's an hierarchical grid(not set if called from modal dialog).
    */
  var grid: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the current groupedColumns.
    */
  var groupedColumns: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Gets a reference to the current column's key that's being grouped(not set if called from modal dialog).
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the current layout object, if any(not set if called from modal dialog).
    */
  var layout: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the object of the new grouped columns that should be applied.(it is set ONLY if called from modal dialog)
    */
  var newGroupedColumns: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets access the GroupBy widget object.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets which user interaction triggers the event - possible options are dragAndDrop|modalDialog|sortStateChanged|removeButton|regroup.
    */
  var triggeredBy: js.UndefOr[String] = js.native
}
object GroupedColumnsChangingEventUIParam {
  
  @scala.inline
  def apply(): GroupedColumnsChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupedColumnsChangingEventUIParam]
  }
  
  @scala.inline
  implicit class GroupedColumnsChangingEventUIParamOps[Self <: GroupedColumnsChangingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGrid(value: js.Any): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setGroupedColumnsVarargs(value: js.Any*): Self = this.set("groupedColumns", js.Array(value :_*))
    
    @scala.inline
    def setGroupedColumns(value: js.Array[_]): Self = this.set("groupedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupedColumns: Self = this.set("groupedColumns", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLayout(value: js.Any): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setNewGroupedColumns(value: js.Any): Self = this.set("newGroupedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewGroupedColumns: Self = this.set("newGroupedColumns", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setTriggeredBy(value: String): Self = this.set("triggeredBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggeredBy: Self = this.set("triggeredBy", js.undefined)
  }
}
