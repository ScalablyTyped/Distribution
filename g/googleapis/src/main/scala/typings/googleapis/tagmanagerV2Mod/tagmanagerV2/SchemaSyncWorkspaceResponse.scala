package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response after synchronizing the workspace to the latest container
  * version.
  */
@js.native
trait SchemaSyncWorkspaceResponse extends StObject {
  
  /**
    * The merge conflict after sync. If this field is not empty, the sync is
    * still treated as successful. But a version cannot be created until all
    * conflicts are resolved.
    */
  var mergeConflict: js.UndefOr[js.Array[SchemaMergeConflict]] = js.native
  
  /**
    * Indicates whether synchronization caused a merge conflict or sync error.
    */
  var syncStatus: js.UndefOr[SchemaSyncStatus] = js.native
}
object SchemaSyncWorkspaceResponse {
  
  @scala.inline
  def apply(): SchemaSyncWorkspaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSyncWorkspaceResponse]
  }
  
  @scala.inline
  implicit class SchemaSyncWorkspaceResponseMutableBuilder[Self <: SchemaSyncWorkspaceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMergeConflict(value: js.Array[SchemaMergeConflict]): Self = StObject.set(x, "mergeConflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeConflictUndefined: Self = StObject.set(x, "mergeConflict", js.undefined)
    
    @scala.inline
    def setMergeConflictVarargs(value: SchemaMergeConflict*): Self = StObject.set(x, "mergeConflict", js.Array(value :_*))
    
    @scala.inline
    def setSyncStatus(value: SchemaSyncStatus): Self = StObject.set(x, "syncStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncStatusUndefined: Self = StObject.set(x, "syncStatus", js.undefined)
  }
}
