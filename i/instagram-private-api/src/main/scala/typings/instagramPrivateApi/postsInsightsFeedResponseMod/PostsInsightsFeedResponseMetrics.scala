package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostsInsightsFeedResponseMetrics extends js.Object {
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
}

