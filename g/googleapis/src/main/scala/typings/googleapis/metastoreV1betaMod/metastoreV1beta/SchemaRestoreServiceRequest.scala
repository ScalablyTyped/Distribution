package typings.googleapis.metastoreV1betaMod.metastoreV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRestoreServiceRequest extends StObject {
  
  /**
    * Required. The relative resource name of the metastore service backup to restore from, in the following form:projects/{project_id\}/locations/{location_id\}/services/{service_id\}/backups/{backup_id\}.
    */
  var backup: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A request ID. Specify a unique request ID to allow the server to ignore the request if it has completed. The server will ignore subsequent requests that provide a duplicate request ID for at least 60 minutes after the first request.For example, if an initial request times out, followed by another request with the same request ID, the server ignores the second request to prevent the creation of duplicate commitments.The request ID must be a valid UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier#Format). A zero UUID (00000000-0000-0000-0000-000000000000) is not supported.
    */
  var requestId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The type of restore. If unspecified, defaults to METADATA_ONLY.
    */
  var restoreType: js.UndefOr[String | Null] = js.undefined
}
object SchemaRestoreServiceRequest {
  
  inline def apply(): SchemaRestoreServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestoreServiceRequest]
  }
  
  extension [Self <: SchemaRestoreServiceRequest](x: Self) {
    
    inline def setBackup(value: String): Self = StObject.set(x, "backup", value.asInstanceOf[js.Any])
    
    inline def setBackupNull: Self = StObject.set(x, "backup", null)
    
    inline def setBackupUndefined: Self = StObject.set(x, "backup", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setRestoreType(value: String): Self = StObject.set(x, "restoreType", value.asInstanceOf[js.Any])
    
    inline def setRestoreTypeNull: Self = StObject.set(x, "restoreType", null)
    
    inline def setRestoreTypeUndefined: Self = StObject.set(x, "restoreType", js.undefined)
  }
}
