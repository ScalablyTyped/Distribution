package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1GcsFileSpec extends StObject {
  
  /** Required. The full file path. Example: `gs://bucket_name/a/b.txt`. */
  var filePath: js.UndefOr[String] = js.undefined
  
  /** Output only. Timestamps about the Cloud Storage file. */
  var gcsTimestamps: js.UndefOr[GoogleCloudDatacatalogV1beta1SystemTimestamps] = js.undefined
  
  /** Output only. The size of the file, in bytes. */
  var sizeBytes: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1beta1GcsFileSpec {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1GcsFileSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1GcsFileSpec]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1GcsFileSpecMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1GcsFileSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    @scala.inline
    def setGcsTimestamps(value: GoogleCloudDatacatalogV1beta1SystemTimestamps): Self = StObject.set(x, "gcsTimestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsTimestampsUndefined: Self = StObject.set(x, "gcsTimestamps", js.undefined)
    
    @scala.inline
    def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
  }
}
