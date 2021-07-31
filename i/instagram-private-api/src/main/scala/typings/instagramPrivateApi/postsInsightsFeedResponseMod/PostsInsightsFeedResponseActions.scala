package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostsInsightsFeedResponseActions extends StObject {
  
  var edges: js.Array[PostsInsightsFeedResponseEdgesItem]
}
object PostsInsightsFeedResponseActions {
  
  @scala.inline
  def apply(edges: js.Array[PostsInsightsFeedResponseEdgesItem]): PostsInsightsFeedResponseActions = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseActions]
  }
  
  @scala.inline
  implicit class PostsInsightsFeedResponseActionsMutableBuilder[Self <: PostsInsightsFeedResponseActions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdges(value: js.Array[PostsInsightsFeedResponseEdgesItem]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesVarargs(value: PostsInsightsFeedResponseEdgesItem*): Self = StObject.set(x, "edges", js.Array(value :_*))
  }
}
