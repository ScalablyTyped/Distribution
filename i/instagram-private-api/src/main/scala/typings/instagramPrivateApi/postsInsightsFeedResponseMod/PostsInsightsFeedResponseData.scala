package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostsInsightsFeedResponseData extends StObject {
  
  var user: PostsInsightsFeedResponseUser
}
object PostsInsightsFeedResponseData {
  
  inline def apply(user: PostsInsightsFeedResponseUser): PostsInsightsFeedResponseData = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseData]
  }
  
  extension [Self <: PostsInsightsFeedResponseData](x: Self) {
    
    inline def setUser(value: PostsInsightsFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
