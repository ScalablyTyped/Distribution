package typings.googleapis.sqlV1beta4Mod.sqlV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackupRunsListResponse extends StObject {
  
  /**
    * A list of backup runs in reverse chronological order of the enqueued time.
    */
  var items: js.UndefOr[js.Array[SchemaBackupRun]] = js.undefined
  
  /**
    * This is always *sql#backupRunsList*.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The continuation token, used to page through large result sets. Provide this value in a subsequent request to return the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaBackupRunsListResponse {
  
  inline def apply(): SchemaBackupRunsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackupRunsListResponse]
  }
  
  extension [Self <: SchemaBackupRunsListResponse](x: Self) {
    
    inline def setItems(value: js.Array[SchemaBackupRun]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaBackupRun*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
