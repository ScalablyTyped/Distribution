package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostsInsightsFeedResponseUser extends StObject {
  
  var business_manager: PostsInsightsFeedResponseBusinessManager
  
  var id: String
}
object PostsInsightsFeedResponseUser {
  
  inline def apply(business_manager: PostsInsightsFeedResponseBusinessManager, id: String): PostsInsightsFeedResponseUser = {
    val __obj = js.Dynamic.literal(business_manager = business_manager.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseUser]
  }
  
  extension [Self <: PostsInsightsFeedResponseUser](x: Self) {
    
    inline def setBusiness_manager(value: PostsInsightsFeedResponseBusinessManager): Self = StObject.set(x, "business_manager", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
