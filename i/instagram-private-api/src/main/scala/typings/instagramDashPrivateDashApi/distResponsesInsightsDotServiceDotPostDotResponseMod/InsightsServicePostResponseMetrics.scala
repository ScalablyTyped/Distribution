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
    val __obj = js.Dynamic.literal(hashtags_impressions = hashtags_impressions.asInstanceOf[js.Any], impression_count = impression_count.asInstanceOf[js.Any], impressions = impressions.asInstanceOf[js.Any], owner_account_follows_count = owner_account_follows_count.asInstanceOf[js.Any], owner_profile_views_count = owner_profile_views_count.asInstanceOf[js.Any], profile_actions = profile_actions.asInstanceOf[js.Any], reach = reach.asInstanceOf[js.Any], reach_count = reach_count.asInstanceOf[js.Any], share_count = share_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsightsServicePostResponseMetrics]
  }
}

