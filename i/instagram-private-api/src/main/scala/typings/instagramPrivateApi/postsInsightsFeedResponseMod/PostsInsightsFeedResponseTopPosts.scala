package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostsInsightsFeedResponseTopPosts extends StObject {
  
  var edges: js.Array[PostsInsightsFeedResponseEdgesItem]
  
  var page_info: PostsInsightsFeedResponsePageInfo
}
object PostsInsightsFeedResponseTopPosts {
  
  inline def apply(edges: js.Array[PostsInsightsFeedResponseEdgesItem], page_info: PostsInsightsFeedResponsePageInfo): PostsInsightsFeedResponseTopPosts = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseTopPosts]
  }
  
  extension [Self <: PostsInsightsFeedResponseTopPosts](x: Self) {
    
    inline def setEdges(value: js.Array[PostsInsightsFeedResponseEdgesItem]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesVarargs(value: PostsInsightsFeedResponseEdgesItem*): Self = StObject.set(x, "edges", js.Array(value :_*))
    
    inline def setPage_info(value: PostsInsightsFeedResponsePageInfo): Self = StObject.set(x, "page_info", value.asInstanceOf[js.Any])
  }
}
