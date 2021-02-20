package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostsInsightsFeedResponseInlineInsightsNode extends StObject {
  
  var metrics: PostsInsightsFeedResponseMetrics = js.native
  
  var state: String = js.native
}
object PostsInsightsFeedResponseInlineInsightsNode {
  
  @scala.inline
  def apply(metrics: PostsInsightsFeedResponseMetrics, state: String): PostsInsightsFeedResponseInlineInsightsNode = {
    val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseInlineInsightsNode]
  }
  
  @scala.inline
  implicit class PostsInsightsFeedResponseInlineInsightsNodeMutableBuilder[Self <: PostsInsightsFeedResponseInlineInsightsNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetrics(value: PostsInsightsFeedResponseMetrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
