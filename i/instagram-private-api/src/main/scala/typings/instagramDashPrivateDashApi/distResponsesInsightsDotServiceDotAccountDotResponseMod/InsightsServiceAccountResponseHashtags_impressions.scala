package typings.instagramDashPrivateDashApi.distResponsesInsightsDotServiceDotAccountDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceAccountResponseHashtags_impressions extends js.Object {
  var account_hashtags: InsightsServiceAccountResponseAccount_hashtags
  var organic: InsightsServiceAccountResponseOrganic
}

object InsightsServiceAccountResponseHashtags_impressions {
  @scala.inline
  def apply(
    account_hashtags: InsightsServiceAccountResponseAccount_hashtags,
    organic: InsightsServiceAccountResponseOrganic
  ): InsightsServiceAccountResponseHashtags_impressions = {
    val __obj = js.Dynamic.literal(account_hashtags = account_hashtags.asInstanceOf[js.Any], organic = organic.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsightsServiceAccountResponseHashtags_impressions]
  }
}

