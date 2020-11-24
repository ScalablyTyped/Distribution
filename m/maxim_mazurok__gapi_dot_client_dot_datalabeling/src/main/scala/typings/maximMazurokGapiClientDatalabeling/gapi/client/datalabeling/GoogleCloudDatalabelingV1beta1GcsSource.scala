package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1GcsSource extends js.Object {
  
  /** Required. The input URI of source file. This must be a Cloud Storage path (`gs://...`). */
  var inputUri: js.UndefOr[String] = js.native
  
  /** Required. The format of the source file. Only "text/csv" is supported. */
  var mimeType: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1GcsSource {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1GcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1GcsSource]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1GcsSourceOps[Self <: GoogleCloudDatalabelingV1beta1GcsSource] (val x: Self) extends AnyVal {
    
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
    def setInputUri(value: String): Self = this.set("inputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputUri: Self = this.set("inputUri", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
  }
}
