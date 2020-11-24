package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1DataItem extends js.Object {
  
  /** The image payload, a container of the image bytes/uri. */
  var imagePayload: js.UndefOr[GoogleCloudDatalabelingV1beta1ImagePayload] = js.native
  
  /** Output only. Name of the data item, in format of: projects/{project_id}/datasets/{dataset_id}/dataItems/{data_item_id} */
  var name: js.UndefOr[String] = js.native
  
  /** The text payload, a container of text content. */
  var textPayload: js.UndefOr[GoogleCloudDatalabelingV1beta1TextPayload] = js.native
  
  /** The video payload, a container of the video uri. */
  var videoPayload: js.UndefOr[GoogleCloudDatalabelingV1beta1VideoPayload] = js.native
}
object GoogleCloudDatalabelingV1beta1DataItem {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1DataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1DataItem]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1DataItemOps[Self <: GoogleCloudDatalabelingV1beta1DataItem] (val x: Self) extends AnyVal {
    
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
    def setImagePayload(value: GoogleCloudDatalabelingV1beta1ImagePayload): Self = this.set("imagePayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImagePayload: Self = this.set("imagePayload", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTextPayload(value: GoogleCloudDatalabelingV1beta1TextPayload): Self = this.set("textPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextPayload: Self = this.set("textPayload", js.undefined)
    
    @scala.inline
    def setVideoPayload(value: GoogleCloudDatalabelingV1beta1VideoPayload): Self = this.set("videoPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoPayload: Self = this.set("videoPayload", js.undefined)
  }
}
