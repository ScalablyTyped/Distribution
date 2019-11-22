package typings.instagramDashPrivateDashApi.distResponsesPostsDashInsightsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostsInsightsFeedResponseMetrics extends js.Object {
  var impression_count: Double
  var owner_account_follows_count: Double
  var owner_profile_views_count: Double
  var profile_actions: PostsInsightsFeedResponseProfile_actions
  var reach_count: Double
  var share_count: PostsInsightsFeedResponseShare_count
}

object PostsInsightsFeedResponseMetrics {
  @scala.inline
  def apply(
    impression_count: Double,
    owner_account_follows_count: Double,
    owner_profile_views_count: Double,
    profile_actions: PostsInsightsFeedResponseProfile_actions,
    reach_count: Double,
    share_count: PostsInsightsFeedResponseShare_count
  ): PostsInsightsFeedResponseMetrics = {
    val __obj = js.Dynamic.literal(impression_count = impression_count, owner_account_follows_count = owner_account_follows_count, owner_profile_views_count = owner_profile_views_count, profile_actions = profile_actions, reach_count = reach_count, share_count = share_count)
  
    __obj.asInstanceOf[PostsInsightsFeedResponseMetrics]
  }
}

