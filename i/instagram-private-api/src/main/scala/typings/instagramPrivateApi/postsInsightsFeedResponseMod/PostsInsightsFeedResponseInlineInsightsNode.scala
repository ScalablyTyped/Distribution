package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostsInsightsFeedResponseInlineInsightsNode extends StObject {
  
  var metrics: PostsInsightsFeedResponseMetrics
  
  var state: String
}
object PostsInsightsFeedResponseInlineInsightsNode {
  
  inline def apply(metrics: PostsInsightsFeedResponseMetrics, state: String): PostsInsightsFeedResponseInlineInsightsNode = {
    val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseInlineInsightsNode]
  }
  
  extension [Self <: PostsInsightsFeedResponseInlineInsightsNode](x: Self) {
    
    inline def setMetrics(value: PostsInsightsFeedResponseMetrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
