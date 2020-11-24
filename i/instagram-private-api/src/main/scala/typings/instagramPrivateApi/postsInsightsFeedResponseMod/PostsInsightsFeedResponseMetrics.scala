package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostsInsightsFeedResponseMetrics extends js.Object {
  
  var impression_count: Double = js.native
  
  var owner_account_follows_count: Double = js.native
  
  var owner_profile_views_count: Double = js.native
  
  var profile_actions: PostsInsightsFeedResponseProfileActions = js.native
  
  var reach_count: Double = js.native
  
  var share_count: PostsInsightsFeedResponseShareCount = js.native
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
  implicit class PostsInsightsFeedResponseMetricsOps[Self <: PostsInsightsFeedResponseMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImpression_count(value: Double): Self = this.set("impression_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner_account_follows_count(value: Double): Self = this.set("owner_account_follows_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner_profile_views_count(value: Double): Self = this.set("owner_profile_views_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_actions(value: PostsInsightsFeedResponseProfileActions): Self = this.set("profile_actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReach_count(value: Double): Self = this.set("reach_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShare_count(value: PostsInsightsFeedResponseShareCount): Self = this.set("share_count", value.asInstanceOf[js.Any])
  }
}
