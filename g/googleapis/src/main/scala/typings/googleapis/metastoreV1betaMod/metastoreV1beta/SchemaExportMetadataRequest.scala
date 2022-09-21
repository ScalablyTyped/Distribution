package typings.googleapis.metastoreV1betaMod.metastoreV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExportMetadataRequest extends StObject {
  
  /**
    * Optional. The type of the database dump. If unspecified, defaults to MYSQL.
    */
  var databaseDumpType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A Cloud Storage URI of a folder, in the format gs:///. A sub-folder containing exported files will be created below it.
    */
  var destinationGcsFolder: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A request ID. Specify a unique request ID to allow the server to ignore the request if it has completed. The server will ignore subsequent requests that provide a duplicate request ID for at least 60 minutes after the first request.For example, if an initial request times out, followed by another request with the same request ID, the server ignores the second request to prevent the creation of duplicate commitments.The request ID must be a valid UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier#Format). A zero UUID (00000000-0000-0000-0000-000000000000) is not supported.
    */
  var requestId: js.UndefOr[String | Null] = js.undefined
}
object SchemaExportMetadataRequest {
  
  inline def apply(): SchemaExportMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExportMetadataRequest]
  }
  
  extension [Self <: SchemaExportMetadataRequest](x: Self) {
    
    inline def setDatabaseDumpType(value: String): Self = StObject.set(x, "databaseDumpType", value.asInstanceOf[js.Any])
    
    inline def setDatabaseDumpTypeNull: Self = StObject.set(x, "databaseDumpType", null)
    
    inline def setDatabaseDumpTypeUndefined: Self = StObject.set(x, "databaseDumpType", js.undefined)
    
    inline def setDestinationGcsFolder(value: String): Self = StObject.set(x, "destinationGcsFolder", value.asInstanceOf[js.Any])
    
    inline def setDestinationGcsFolderNull: Self = StObject.set(x, "destinationGcsFolder", null)
    
    inline def setDestinationGcsFolderUndefined: Self = StObject.set(x, "destinationGcsFolder", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
