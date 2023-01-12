package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1GcsFileSpec extends StObject {
  
  /** Required. Full file path. Example: `gs://bucket_name/a/b.txt`. */
  var filePath: js.UndefOr[String] = js.undefined
  
  /** Output only. Creation, modification, and expiration timestamps of a Cloud Storage file. */
  var gcsTimestamps: js.UndefOr[GoogleCloudDatacatalogV1SystemTimestamps] = js.undefined
  
  /** Output only. File size in bytes. */
  var sizeBytes: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1GcsFileSpec {
  
  inline def apply(): GoogleCloudDatacatalogV1GcsFileSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1GcsFileSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1GcsFileSpec] (val x: Self) extends AnyVal {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setGcsTimestamps(value: GoogleCloudDatacatalogV1SystemTimestamps): Self = StObject.set(x, "gcsTimestamps", value.asInstanceOf[js.Any])
    
    inline def setGcsTimestampsUndefined: Self = StObject.set(x, "gcsTimestamps", js.undefined)
    
    inline def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
  }
}
