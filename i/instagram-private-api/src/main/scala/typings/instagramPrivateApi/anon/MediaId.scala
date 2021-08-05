package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaId extends StObject {
  
  var mediaId: js.UndefOr[String] = js.undefined
  
  var targetPostsAuthorId: js.UndefOr[String] = js.undefined
  
  var targetReelAuthorId: js.UndefOr[String] = js.undefined
}
object MediaId {
  
  inline def apply(): MediaId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaId]
  }
  
  extension [Self <: MediaId](x: Self) {
    
    inline def setMediaId(value: String): Self = StObject.set(x, "mediaId", value.asInstanceOf[js.Any])
    
    inline def setMediaIdUndefined: Self = StObject.set(x, "mediaId", js.undefined)
    
    inline def setTargetPostsAuthorId(value: String): Self = StObject.set(x, "targetPostsAuthorId", value.asInstanceOf[js.Any])
    
    inline def setTargetPostsAuthorIdUndefined: Self = StObject.set(x, "targetPostsAuthorId", js.undefined)
    
    inline def setTargetReelAuthorId(value: String): Self = StObject.set(x, "targetReelAuthorId", value.asInstanceOf[js.Any])
    
    inline def setTargetReelAuthorIdUndefined: Self = StObject.set(x, "targetReelAuthorId", js.undefined)
  }
}
