package typings.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServicePostResponseMetrics extends js.Object {
  var hashtags_impressions: InsightsServicePostResponseHashtagsImpressions
  var impression_count: Double
  var impressions: InsightsServicePostResponseImpressions
  var owner_account_follows_count: Double
  var owner_profile_views_count: Double
  var profile_actions: InsightsServicePostResponseProfileActions
  var reach: InsightsServicePostResponseReach
  var reach_count: Double
  var share_count: InsightsServicePostResponseShareCount
}

object InsightsServicePostResponseMetrics {
  @scala.inline
  def apply(
    hashtags_impressions: InsightsServicePostResponseHashtagsImpressions,
    impression_count: Double,
    impressions: InsightsServicePostResponseImpressions,
    owner_account_follows_count: Double,
    owner_profile_views_count: Double,
    profile_actions: InsightsServicePostResponseProfileActions,
    reach: InsightsServicePostResponseReach,
    reach_count: Double,
    share_count: InsightsServicePostResponseShareCount
  ): InsightsServicePostResponseMetrics = {
    val __obj = js.Dynamic.literal(hashtags_impressions = hashtags_impressions.asInstanceOf[js.Any], impression_count = impression_count.asInstanceOf[js.Any], impressions = impressions.asInstanceOf[js.Any], owner_account_follows_count = owner_account_follows_count.asInstanceOf[js.Any], owner_profile_views_count = owner_profile_views_count.asInstanceOf[js.Any], profile_actions = profile_actions.asInstanceOf[js.Any], reach = reach.asInstanceOf[js.Any], reach_count = reach_count.asInstanceOf[js.Any], share_count = share_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseMetrics]
  }
}

