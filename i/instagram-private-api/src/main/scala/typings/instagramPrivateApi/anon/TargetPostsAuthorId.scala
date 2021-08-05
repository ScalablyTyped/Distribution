package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetPostsAuthorId extends StObject {
  
  var targetPostsAuthorId: js.UndefOr[String] = js.undefined
  
  var targetReelAuthorId: js.UndefOr[String] = js.undefined
}
object TargetPostsAuthorId {
  
  inline def apply(): TargetPostsAuthorId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetPostsAuthorId]
  }
  
  extension [Self <: TargetPostsAuthorId](x: Self) {
    
    inline def setTargetPostsAuthorId(value: String): Self = StObject.set(x, "targetPostsAuthorId", value.asInstanceOf[js.Any])
    
    inline def setTargetPostsAuthorIdUndefined: Self = StObject.set(x, "targetPostsAuthorId", js.undefined)
    
    inline def setTargetReelAuthorId(value: String): Self = StObject.set(x, "targetReelAuthorId", value.asInstanceOf[js.Any])
    
    inline def setTargetReelAuthorIdUndefined: Self = StObject.set(x, "targetReelAuthorId", js.undefined)
  }
}
