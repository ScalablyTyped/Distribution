package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1beta1GcsFileSpec extends StObject {
  
  /**
    * Required. The full file path. Example: `gs://bucket_name/a/b.txt`.
    */
  var filePath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Timestamps about the Cloud Storage file.
    */
  var gcsTimestamps: js.UndefOr[SchemaGoogleCloudDatacatalogV1beta1SystemTimestamps] = js.undefined
  
  /**
    * Output only. The size of the file, in bytes.
    */
  var sizeBytes: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1beta1GcsFileSpec {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1beta1GcsFileSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1beta1GcsFileSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1beta1GcsFileSpec](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathNull: Self = StObject.set(x, "filePath", null)
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setGcsTimestamps(value: SchemaGoogleCloudDatacatalogV1beta1SystemTimestamps): Self = StObject.set(x, "gcsTimestamps", value.asInstanceOf[js.Any])
    
    inline def setGcsTimestampsUndefined: Self = StObject.set(x, "gcsTimestamps", js.undefined)
    
    inline def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeBytesNull: Self = StObject.set(x, "sizeBytes", null)
    
    inline def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
  }
}
