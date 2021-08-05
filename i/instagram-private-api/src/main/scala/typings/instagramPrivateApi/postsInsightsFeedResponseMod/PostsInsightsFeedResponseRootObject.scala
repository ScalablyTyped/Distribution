package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostsInsightsFeedResponseRootObject extends StObject {
  
  var data: PostsInsightsFeedResponseData
}
object PostsInsightsFeedResponseRootObject {
  
  inline def apply(data: PostsInsightsFeedResponseData): PostsInsightsFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseRootObject]
  }
  
  extension [Self <: PostsInsightsFeedResponseRootObject](x: Self) {
    
    inline def setData(value: PostsInsightsFeedResponseData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
