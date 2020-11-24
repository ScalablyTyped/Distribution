package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1OutputConfig extends js.Object {
  
  /** Output to a file in Cloud Storage. Should be used for labeling output other than image segmentation. */
  var gcsDestination: js.UndefOr[GoogleCloudDatalabelingV1beta1GcsDestination] = js.native
  
  /** Output to a folder in Cloud Storage. Should be used for image segmentation or document de-identification labeling outputs. */
  var gcsFolderDestination: js.UndefOr[GoogleCloudDatalabelingV1beta1GcsFolderDestination] = js.native
}
object GoogleCloudDatalabelingV1beta1OutputConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1OutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1OutputConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1OutputConfigOps[Self <: GoogleCloudDatalabelingV1beta1OutputConfig] (val x: Self) extends AnyVal {
    
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
    def setGcsDestination(value: GoogleCloudDatalabelingV1beta1GcsDestination): Self = this.set("gcsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsDestination: Self = this.set("gcsDestination", js.undefined)
    
    @scala.inline
    def setGcsFolderDestination(value: GoogleCloudDatalabelingV1beta1GcsFolderDestination): Self = this.set("gcsFolderDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsFolderDestination: Self = this.set("gcsFolderDestination", js.undefined)
  }
}
