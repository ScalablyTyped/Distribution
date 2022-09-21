package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSyncStatus extends StObject {
  
  /**
    * Synchornization operation detected a merge conflict.
    */
  var mergeConflict: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * An error occurred during the synchronization operation.
    */
  var syncError: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaSyncStatus {
  
  inline def apply(): SchemaSyncStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSyncStatus]
  }
  
  extension [Self <: SchemaSyncStatus](x: Self) {
    
    inline def setMergeConflict(value: Boolean): Self = StObject.set(x, "mergeConflict", value.asInstanceOf[js.Any])
    
    inline def setMergeConflictNull: Self = StObject.set(x, "mergeConflict", null)
    
    inline def setMergeConflictUndefined: Self = StObject.set(x, "mergeConflict", js.undefined)
    
    inline def setSyncError(value: Boolean): Self = StObject.set(x, "syncError", value.asInstanceOf[js.Any])
    
    inline def setSyncErrorNull: Self = StObject.set(x, "syncError", null)
    
    inline def setSyncErrorUndefined: Self = StObject.set(x, "syncError", js.undefined)
  }
}
