package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementSyncState extends StObject {
  
  /**
    * Sync status code
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of errors resulting from problematic configs. This list will be truncated after 100 errors, although it is unlikely for that many errors to simultaneously exist.
    */
  var errors: js.UndefOr[js.Array[SchemaConfigManagementSyncError]] = js.undefined
  
  /**
    * Token indicating the state of the importer.
    */
  var importToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated: use last_sync_time instead. Timestamp of when ACM last successfully synced the repo The time format is specified in https://golang.org/pkg/time/#Time.String
    */
  var lastSync: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timestamp type of when ACM last successfully synced the repo
    */
  var lastSyncTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Token indicating the state of the repo.
    */
  var sourceToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Token indicating the state of the syncer.
    */
  var syncToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfigManagementSyncState {
  
  inline def apply(): SchemaConfigManagementSyncState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementSyncState]
  }
  
  extension [Self <: SchemaConfigManagementSyncState](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setErrors(value: js.Array[SchemaConfigManagementSyncError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaConfigManagementSyncError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setImportToken(value: String): Self = StObject.set(x, "importToken", value.asInstanceOf[js.Any])
    
    inline def setImportTokenNull: Self = StObject.set(x, "importToken", null)
    
    inline def setImportTokenUndefined: Self = StObject.set(x, "importToken", js.undefined)
    
    inline def setLastSync(value: String): Self = StObject.set(x, "lastSync", value.asInstanceOf[js.Any])
    
    inline def setLastSyncNull: Self = StObject.set(x, "lastSync", null)
    
    inline def setLastSyncTime(value: String): Self = StObject.set(x, "lastSyncTime", value.asInstanceOf[js.Any])
    
    inline def setLastSyncTimeNull: Self = StObject.set(x, "lastSyncTime", null)
    
    inline def setLastSyncTimeUndefined: Self = StObject.set(x, "lastSyncTime", js.undefined)
    
    inline def setLastSyncUndefined: Self = StObject.set(x, "lastSync", js.undefined)
    
    inline def setSourceToken(value: String): Self = StObject.set(x, "sourceToken", value.asInstanceOf[js.Any])
    
    inline def setSourceTokenNull: Self = StObject.set(x, "sourceToken", null)
    
    inline def setSourceTokenUndefined: Self = StObject.set(x, "sourceToken", js.undefined)
    
    inline def setSyncToken(value: String): Self = StObject.set(x, "syncToken", value.asInstanceOf[js.Any])
    
    inline def setSyncTokenNull: Self = StObject.set(x, "syncToken", null)
    
    inline def setSyncTokenUndefined: Self = StObject.set(x, "syncToken", js.undefined)
  }
}
