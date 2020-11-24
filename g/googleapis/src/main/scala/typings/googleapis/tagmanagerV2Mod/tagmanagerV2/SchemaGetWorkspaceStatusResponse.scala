package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The changes that have occurred in the workspace since the base container
  * version.
  */
@js.native
trait SchemaGetWorkspaceStatusResponse extends js.Object {
  
  /**
    * The merge conflict after sync.
    */
  var mergeConflict: js.UndefOr[js.Array[SchemaMergeConflict]] = js.native
  
  /**
    * Entities that have been changed in the workspace.
    */
  var workspaceChange: js.UndefOr[js.Array[SchemaEntity]] = js.native
}
object SchemaGetWorkspaceStatusResponse {
  
  @scala.inline
  def apply(): SchemaGetWorkspaceStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetWorkspaceStatusResponse]
  }
  
  @scala.inline
  implicit class SchemaGetWorkspaceStatusResponseOps[Self <: SchemaGetWorkspaceStatusResponse] (val x: Self) extends AnyVal {
    
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
    def setMergeConflictVarargs(value: SchemaMergeConflict*): Self = this.set("mergeConflict", js.Array(value :_*))
    
    @scala.inline
    def setMergeConflict(value: js.Array[SchemaMergeConflict]): Self = this.set("mergeConflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeConflict: Self = this.set("mergeConflict", js.undefined)
    
    @scala.inline
    def setWorkspaceChangeVarargs(value: SchemaEntity*): Self = this.set("workspaceChange", js.Array(value :_*))
    
    @scala.inline
    def setWorkspaceChange(value: js.Array[SchemaEntity]): Self = this.set("workspaceChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceChange: Self = this.set("workspaceChange", js.undefined)
  }
}
