package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1DataItem extends StObject {
  
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
  implicit class GoogleCloudDatalabelingV1beta1DataItemMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1DataItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImagePayload(value: GoogleCloudDatalabelingV1beta1ImagePayload): Self = StObject.set(x, "imagePayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePayloadUndefined: Self = StObject.set(x, "imagePayload", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTextPayload(value: GoogleCloudDatalabelingV1beta1TextPayload): Self = StObject.set(x, "textPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextPayloadUndefined: Self = StObject.set(x, "textPayload", js.undefined)
    
    @scala.inline
    def setVideoPayload(value: GoogleCloudDatalabelingV1beta1VideoPayload): Self = StObject.set(x, "videoPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoPayloadUndefined: Self = StObject.set(x, "videoPayload", js.undefined)
  }
}
