package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1GcsDestination extends js.Object {
  
  /** Required. The format of the gcs destination. Only "text/csv" and "application/json" are supported. */
  var mimeType: js.UndefOr[String] = js.native
  
  /** Required. The output uri of destination file. */
  var outputUri: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1GcsDestination {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1GcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1GcsDestination]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1GcsDestinationOps[Self <: GoogleCloudDatalabelingV1beta1GcsDestination] (val x: Self) extends AnyVal {
    
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
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setOutputUri(value: String): Self = this.set("outputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputUri: Self = this.set("outputUri", js.undefined)
  }
}
