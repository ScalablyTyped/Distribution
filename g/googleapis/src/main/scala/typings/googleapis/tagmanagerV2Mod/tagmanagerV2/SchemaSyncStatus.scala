package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The status of a workspace after synchronization.
  */
trait SchemaSyncStatus extends StObject {
  
  /**
    * Synchornization operation detected a merge conflict.
    */
  var mergeConflict: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An error occurred during the synchronization operation.
    */
  var syncError: js.UndefOr[Boolean] = js.undefined
}
object SchemaSyncStatus {
  
  @scala.inline
  def apply(): SchemaSyncStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSyncStatus]
  }
  
  @scala.inline
  implicit class SchemaSyncStatusMutableBuilder[Self <: SchemaSyncStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMergeConflict(value: Boolean): Self = StObject.set(x, "mergeConflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeConflictUndefined: Self = StObject.set(x, "mergeConflict", js.undefined)
    
    @scala.inline
    def setSyncError(value: Boolean): Self = StObject.set(x, "syncError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncErrorUndefined: Self = StObject.set(x, "syncError", js.undefined)
  }
}
