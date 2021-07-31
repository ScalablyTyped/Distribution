package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseTopPostsUnit extends StObject {
  
  var last_week_posts_count: Double
  
  var top_posts: InsightsServiceAccountResponseTopPosts
  
  var week_over_week_posts_delta: Double
}
object InsightsServiceAccountResponseTopPostsUnit {
  
  @scala.inline
  def apply(
    last_week_posts_count: Double,
    top_posts: InsightsServiceAccountResponseTopPosts,
    week_over_week_posts_delta: Double
  ): InsightsServiceAccountResponseTopPostsUnit = {
    val __obj = js.Dynamic.literal(last_week_posts_count = last_week_posts_count.asInstanceOf[js.Any], top_posts = top_posts.asInstanceOf[js.Any], week_over_week_posts_delta = week_over_week_posts_delta.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseTopPostsUnit]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseTopPostsUnitMutableBuilder[Self <: InsightsServiceAccountResponseTopPostsUnit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLast_week_posts_count(value: Double): Self = StObject.set(x, "last_week_posts_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop_posts(value: InsightsServiceAccountResponseTopPosts): Self = StObject.set(x, "top_posts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeek_over_week_posts_delta(value: Double): Self = StObject.set(x, "week_over_week_posts_delta", value.asInstanceOf[js.Any])
  }
}
