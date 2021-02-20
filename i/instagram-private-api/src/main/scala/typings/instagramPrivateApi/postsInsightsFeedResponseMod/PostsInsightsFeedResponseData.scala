package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostsInsightsFeedResponseData extends StObject {
  
  var user: PostsInsightsFeedResponseUser = js.native
}
object PostsInsightsFeedResponseData {
  
  @scala.inline
  def apply(user: PostsInsightsFeedResponseUser): PostsInsightsFeedResponseData = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseData]
  }
  
  @scala.inline
  implicit class PostsInsightsFeedResponseDataMutableBuilder[Self <: PostsInsightsFeedResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUser(value: PostsInsightsFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
