package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaId extends StObject {
  
  var mediaId: js.UndefOr[String] = js.native
  
  var targetPostsAuthorId: js.UndefOr[String] = js.native
  
  var targetReelAuthorId: js.UndefOr[String] = js.native
}
object MediaId {
  
  @scala.inline
  def apply(): MediaId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaId]
  }
  
  @scala.inline
  implicit class MediaIdMutableBuilder[Self <: MediaId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaId(value: String): Self = StObject.set(x, "mediaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaIdUndefined: Self = StObject.set(x, "mediaId", js.undefined)
    
    @scala.inline
    def setTargetPostsAuthorId(value: String): Self = StObject.set(x, "targetPostsAuthorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPostsAuthorIdUndefined: Self = StObject.set(x, "targetPostsAuthorId", js.undefined)
    
    @scala.inline
    def setTargetReelAuthorId(value: String): Self = StObject.set(x, "targetReelAuthorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetReelAuthorIdUndefined: Self = StObject.set(x, "targetReelAuthorId", js.undefined)
  }
}
