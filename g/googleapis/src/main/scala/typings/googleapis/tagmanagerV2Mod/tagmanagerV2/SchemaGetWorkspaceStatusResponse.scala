package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The changes that have occurred in the workspace since the base container
  * version.
  */
trait SchemaGetWorkspaceStatusResponse extends StObject {
  
  /**
    * The merge conflict after sync.
    */
  var mergeConflict: js.UndefOr[js.Array[SchemaMergeConflict]] = js.undefined
  
  /**
    * Entities that have been changed in the workspace.
    */
  var workspaceChange: js.UndefOr[js.Array[SchemaEntity]] = js.undefined
}
object SchemaGetWorkspaceStatusResponse {
  
  @scala.inline
  def apply(): SchemaGetWorkspaceStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetWorkspaceStatusResponse]
  }
  
  @scala.inline
  implicit class SchemaGetWorkspaceStatusResponseMutableBuilder[Self <: SchemaGetWorkspaceStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMergeConflict(value: js.Array[SchemaMergeConflict]): Self = StObject.set(x, "mergeConflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeConflictUndefined: Self = StObject.set(x, "mergeConflict", js.undefined)
    
    @scala.inline
    def setMergeConflictVarargs(value: SchemaMergeConflict*): Self = StObject.set(x, "mergeConflict", js.Array(value :_*))
    
    @scala.inline
    def setWorkspaceChange(value: js.Array[SchemaEntity]): Self = StObject.set(x, "workspaceChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceChangeUndefined: Self = StObject.set(x, "workspaceChange", js.undefined)
    
    @scala.inline
    def setWorkspaceChangeVarargs(value: SchemaEntity*): Self = StObject.set(x, "workspaceChange", js.Array(value :_*))
  }
}
