package typings.instagramDashPrivateDashApi.distResponsesInsightsDotServiceDotPostDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServicePostResponseMetrics extends js.Object {
  var hashtags_impressions: InsightsServicePostResponseHashtags_impressions
  var impression_count: Double
  var impressions: InsightsServicePostResponseImpressions
  var owner_account_follows_count: Double
  var owner_profile_views_count: Double
  var profile_actions: InsightsServicePostResponseProfile_actions
  var reach: InsightsServicePostResponseReach
  var reach_count: Double
  var share_count: InsightsServicePostResponseShare_count
}

object InsightsServicePostResponseMetrics {
  @scala.inline
  def apply(
    hashtags_impressions: InsightsServicePostResponseHashtags_impressions,
    impression_count: Double,
    impressions: InsightsServicePostResponseImpressions,
    owner_account_follows_count: Double,
    owner_profile_views_count: Double,
    profile_actions: InsightsServicePostResponseProfile_actions,
    reach: InsightsServicePostResponseReach,
    reach_count: Double,
    share_count: InsightsServicePostResponseShare_count
  ): InsightsServicePostResponseMetrics = {
    val __obj = js.Dynamic.literal(hashtags_impressions = hashtags_impressions, impression_count = impression_count, impressions = impressions, owner_account_follows_count = owner_account_follows_count, owner_profile_views_count = owner_profile_views_count, profile_actions = profile_actions, reach = reach, reach_count = reach_count, share_count = share_count)
  
    __obj.asInstanceOf[InsightsServicePostResponseMetrics]
  }
}

