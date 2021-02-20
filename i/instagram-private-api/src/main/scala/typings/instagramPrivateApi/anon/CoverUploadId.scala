package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoverUploadId extends StObject {
  
  var broadcastId: String = js.native
  
  var coverUploadId: String = js.native
  
  var description: String = js.native
  
  var igtvSharePreviewToFeed: js.UndefOr[Boolean] = js.native
  
  var title: String = js.native
}
object CoverUploadId {
  
  @scala.inline
  def apply(broadcastId: String, coverUploadId: String, description: String, title: String): CoverUploadId = {
    val __obj = js.Dynamic.literal(broadcastId = broadcastId.asInstanceOf[js.Any], coverUploadId = coverUploadId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverUploadId]
  }
  
  @scala.inline
  implicit class CoverUploadIdMutableBuilder[Self <: CoverUploadId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBroadcastId(value: String): Self = StObject.set(x, "broadcastId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverUploadId(value: String): Self = StObject.set(x, "coverUploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgtvSharePreviewToFeed(value: Boolean): Self = StObject.set(x, "igtvSharePreviewToFeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgtvSharePreviewToFeedUndefined: Self = StObject.set(x, "igtvSharePreviewToFeed", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
