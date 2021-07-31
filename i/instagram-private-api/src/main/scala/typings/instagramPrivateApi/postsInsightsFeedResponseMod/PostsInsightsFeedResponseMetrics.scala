package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostsInsightsFeedResponseMetrics extends StObject {
  
  var impression_count: Double
  
  var owner_account_follows_count: Double
  
  var owner_profile_views_count: Double
  
  var profile_actions: PostsInsightsFeedResponseProfileActions
  
  var reach_count: Double
  
  var share_count: PostsInsightsFeedResponseShareCount
}
object PostsInsightsFeedResponseMetrics {
  
  @scala.inline
  def apply(
    impression_count: Double,
    owner_account_follows_count: Double,
    owner_profile_views_count: Double,
    profile_actions: PostsInsightsFeedResponseProfileActions,
    reach_count: Double,
    share_count: PostsInsightsFeedResponseShareCount
  ): PostsInsightsFeedResponseMetrics = {
    val __obj = js.Dynamic.literal(impression_count = impression_count.asInstanceOf[js.Any], owner_account_follows_count = owner_account_follows_count.asInstanceOf[js.Any], owner_profile_views_count = owner_profile_views_count.asInstanceOf[js.Any], profile_actions = profile_actions.asInstanceOf[js.Any], reach_count = reach_count.asInstanceOf[js.Any], share_count = share_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseMetrics]
  }
  
  @scala.inline
  implicit class PostsInsightsFeedResponseMetricsMutableBuilder[Self <: PostsInsightsFeedResponseMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImpression_count(value: Double): Self = StObject.set(x, "impression_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner_account_follows_count(value: Double): Self = StObject.set(x, "owner_account_follows_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner_profile_views_count(value: Double): Self = StObject.set(x, "owner_profile_views_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_actions(value: PostsInsightsFeedResponseProfileActions): Self = StObject.set(x, "profile_actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReach_count(value: Double): Self = StObject.set(x, "reach_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShare_count(value: PostsInsightsFeedResponseShareCount): Self = StObject.set(x, "share_count", value.asInstanceOf[js.Any])
  }
}
