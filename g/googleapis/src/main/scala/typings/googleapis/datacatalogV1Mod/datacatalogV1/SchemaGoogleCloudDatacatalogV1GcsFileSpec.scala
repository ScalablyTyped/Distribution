package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1GcsFileSpec extends StObject {
  
  /**
    * Required. Full file path. Example: `gs://bucket_name/a/b.txt`.
    */
  var filePath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Creation, modification, and expiration timestamps of a Cloud Storage file.
    */
  var gcsTimestamps: js.UndefOr[SchemaGoogleCloudDatacatalogV1SystemTimestamps] = js.undefined
  
  /**
    * Output only. File size in bytes.
    */
  var sizeBytes: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1GcsFileSpec {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1GcsFileSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1GcsFileSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1GcsFileSpec](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathNull: Self = StObject.set(x, "filePath", null)
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setGcsTimestamps(value: SchemaGoogleCloudDatacatalogV1SystemTimestamps): Self = StObject.set(x, "gcsTimestamps", value.asInstanceOf[js.Any])
    
    inline def setGcsTimestampsUndefined: Self = StObject.set(x, "gcsTimestamps", js.undefined)
    
    inline def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeBytesNull: Self = StObject.set(x, "sizeBytes", null)
    
    inline def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
  }
}
