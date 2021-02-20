package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1FeedbackThreadMetadata extends StObject {
  
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
  implicit class GoogleCloudDatalabelingV1beta1FeedbackThreadMetadataMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1FeedbackThreadMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
  }
}
