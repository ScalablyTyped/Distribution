package typings.instagramDashPrivateDashApi.distResponsesInsightsDotServiceDotAccountDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceAccountResponseBusiness_manager extends js.Object {
  var account_insights_unit: InsightsServiceAccountResponseAccount_insights_unit
  var account_summary_unit: InsightsServiceAccountResponseAccount_summary_unit
  var followers_unit: InsightsServiceAccountResponseFollowers_unit
  var promotions_unit: InsightsServiceAccountResponsePromotions_unit
  var status: InsightsServiceAccountResponseStatus
  var stories_unit: InsightsServiceAccountResponseStories_unit
  var top_posts_unit: InsightsServiceAccountResponseTop_posts_unit
}

object InsightsServiceAccountResponseBusiness_manager {
  @scala.inline
  def apply(
    account_insights_unit: InsightsServiceAccountResponseAccount_insights_unit,
    account_summary_unit: InsightsServiceAccountResponseAccount_summary_unit,
    followers_unit: InsightsServiceAccountResponseFollowers_unit,
    promotions_unit: InsightsServiceAccountResponsePromotions_unit,
    status: InsightsServiceAccountResponseStatus,
    stories_unit: InsightsServiceAccountResponseStories_unit,
    top_posts_unit: InsightsServiceAccountResponseTop_posts_unit
  ): InsightsServiceAccountResponseBusiness_manager = {
    val __obj = js.Dynamic.literal(account_insights_unit = account_insights_unit.asInstanceOf[js.Any], account_summary_unit = account_summary_unit.asInstanceOf[js.Any], followers_unit = followers_unit.asInstanceOf[js.Any], promotions_unit = promotions_unit.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stories_unit = stories_unit.asInstanceOf[js.Any], top_posts_unit = top_posts_unit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsightsServiceAccountResponseBusiness_manager]
  }
}

