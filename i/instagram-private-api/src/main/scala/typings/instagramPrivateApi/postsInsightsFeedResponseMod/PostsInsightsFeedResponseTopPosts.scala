package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostsInsightsFeedResponseTopPosts extends StObject {
  
  var edges: js.Array[PostsInsightsFeedResponseEdgesItem] = js.native
  
  var page_info: PostsInsightsFeedResponsePageInfo = js.native
}
object PostsInsightsFeedResponseTopPosts {
  
  @scala.inline
  def apply(edges: js.Array[PostsInsightsFeedResponseEdgesItem], page_info: PostsInsightsFeedResponsePageInfo): PostsInsightsFeedResponseTopPosts = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseTopPosts]
  }
  
  @scala.inline
  implicit class PostsInsightsFeedResponseTopPostsMutableBuilder[Self <: PostsInsightsFeedResponseTopPosts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdges(value: js.Array[PostsInsightsFeedResponseEdgesItem]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesVarargs(value: PostsInsightsFeedResponseEdgesItem*): Self = StObject.set(x, "edges", js.Array(value :_*))
    
    @scala.inline
    def setPage_info(value: PostsInsightsFeedResponsePageInfo): Self = StObject.set(x, "page_info", value.asInstanceOf[js.Any])
  }
}
