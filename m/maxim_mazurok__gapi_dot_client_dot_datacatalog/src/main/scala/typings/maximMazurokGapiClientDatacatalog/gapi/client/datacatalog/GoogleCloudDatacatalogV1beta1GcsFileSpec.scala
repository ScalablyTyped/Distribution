package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1GcsFileSpec extends js.Object {
  
  /** Required. The full file path. Example: `gs://bucket_name/a/b.txt`. */
  var filePath: js.UndefOr[String] = js.native
  
  /** Output only. Timestamps about the Cloud Storage file. */
  var gcsTimestamps: js.UndefOr[GoogleCloudDatacatalogV1beta1SystemTimestamps] = js.native
  
  /** Output only. The size of the file, in bytes. */
  var sizeBytes: js.UndefOr[String] = js.native
}
object GoogleCloudDatacatalogV1beta1GcsFileSpec {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1GcsFileSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1GcsFileSpec]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1GcsFileSpecOps[Self <: GoogleCloudDatacatalogV1beta1GcsFileSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilePath: Self = this.set("filePath", js.undefined)
    
    @scala.inline
    def setGcsTimestamps(value: GoogleCloudDatacatalogV1beta1SystemTimestamps): Self = this.set("gcsTimestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsTimestamps: Self = this.set("gcsTimestamps", js.undefined)
    
    @scala.inline
    def setSizeBytes(value: String): Self = this.set("sizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeBytes: Self = this.set("sizeBytes", js.undefined)
  }
}
