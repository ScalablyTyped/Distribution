package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostsInsightsFeedResponseProfileActions extends StObject {
  
  var actions: PostsInsightsFeedResponseActions = js.native
}
object PostsInsightsFeedResponseProfileActions {
  
  @scala.inline
  def apply(actions: PostsInsightsFeedResponseActions): PostsInsightsFeedResponseProfileActions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseProfileActions]
  }
  
  @scala.inline
  implicit class PostsInsightsFeedResponseProfileActionsMutableBuilder[Self <: PostsInsightsFeedResponseProfileActions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: PostsInsightsFeedResponseActions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
  }
}
