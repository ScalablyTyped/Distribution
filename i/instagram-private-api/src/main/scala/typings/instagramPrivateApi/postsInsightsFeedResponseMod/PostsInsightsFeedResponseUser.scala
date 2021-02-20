package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostsInsightsFeedResponseUser extends StObject {
  
  var business_manager: PostsInsightsFeedResponseBusinessManager = js.native
  
  var id: String = js.native
}
object PostsInsightsFeedResponseUser {
  
  @scala.inline
  def apply(business_manager: PostsInsightsFeedResponseBusinessManager, id: String): PostsInsightsFeedResponseUser = {
    val __obj = js.Dynamic.literal(business_manager = business_manager.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseUser]
  }
  
  @scala.inline
  implicit class PostsInsightsFeedResponseUserMutableBuilder[Self <: PostsInsightsFeedResponseUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusiness_manager(value: PostsInsightsFeedResponseBusinessManager): Self = StObject.set(x, "business_manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
