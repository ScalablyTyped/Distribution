package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostsInsightsFeedResponseProfileActions extends StObject {
  
  var actions: PostsInsightsFeedResponseActions
}
object PostsInsightsFeedResponseProfileActions {
  
  inline def apply(actions: PostsInsightsFeedResponseActions): PostsInsightsFeedResponseProfileActions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseProfileActions]
  }
  
  extension [Self <: PostsInsightsFeedResponseProfileActions](x: Self) {
    
    inline def setActions(value: PostsInsightsFeedResponseActions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
  }
}
