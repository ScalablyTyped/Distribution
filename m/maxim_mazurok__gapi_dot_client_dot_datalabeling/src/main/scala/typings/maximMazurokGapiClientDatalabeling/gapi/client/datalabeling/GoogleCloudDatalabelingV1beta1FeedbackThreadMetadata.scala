package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1FeedbackThreadMetadata extends js.Object {
  
  /** When the thread is created */
  var createTime: js.UndefOr[String] = js.native
  
  /** When the thread is last updated. */
  var lastUpdateTime: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  /** An image thumbnail of this thread. */
  var thumbnail: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1FeedbackThreadMetadata {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1FeedbackThreadMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1FeedbackThreadMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1FeedbackThreadMetadataOps[Self <: GoogleCloudDatalabelingV1beta1FeedbackThreadMetadata] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: String): Self = this.set("lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("lastUpdateTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setThumbnail(value: String): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
  }
}
