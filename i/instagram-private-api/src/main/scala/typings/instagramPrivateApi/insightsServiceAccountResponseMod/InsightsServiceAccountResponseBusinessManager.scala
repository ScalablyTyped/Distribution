package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceAccountResponseBusinessManager extends js.Object {
  var account_insights_unit: InsightsServiceAccountResponseAccountInsightsUnit
  var account_summary_unit: InsightsServiceAccountResponseAccountSummaryUnit
  var followers_unit: InsightsServiceAccountResponseFollowersUnit
  var promotions_unit: InsightsServiceAccountResponsePromotionsUnit
  var status: InsightsServiceAccountResponseStatus
  var stories_unit: InsightsServiceAccountResponseStoriesUnit
  var top_posts_unit: InsightsServiceAccountResponseTopPostsUnit
}

object InsightsServiceAccountResponseBusinessManager {
  @scala.inline
  def apply(
    account_insights_unit: InsightsServiceAccountResponseAccountInsightsUnit,
    account_summary_unit: InsightsServiceAccountResponseAccountSummaryUnit,
    followers_unit: InsightsServiceAccountResponseFollowersUnit,
    promotions_unit: InsightsServiceAccountResponsePromotionsUnit,
    status: InsightsServiceAccountResponseStatus,
    stories_unit: InsightsServiceAccountResponseStoriesUnit,
    top_posts_unit: InsightsServiceAccountResponseTopPostsUnit
  ): InsightsServiceAccountResponseBusinessManager = {
    val __obj = js.Dynamic.literal(account_insights_unit = account_insights_unit.asInstanceOf[js.Any], account_summary_unit = account_summary_unit.asInstanceOf[js.Any], followers_unit = followers_unit.asInstanceOf[js.Any], promotions_unit = promotions_unit.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stories_unit = stories_unit.asInstanceOf[js.Any], top_posts_unit = top_posts_unit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsightsServiceAccountResponseBusinessManager]
  }
}

