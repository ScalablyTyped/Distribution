package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceAccountResponseHashtagsImpressions extends js.Object {
  var account_hashtags: InsightsServiceAccountResponseAccountHashtags
  var organic: InsightsServiceAccountResponseOrganic
}

object InsightsServiceAccountResponseHashtagsImpressions {
  @scala.inline
  def apply(
    account_hashtags: InsightsServiceAccountResponseAccountHashtags,
    organic: InsightsServiceAccountResponseOrganic
  ): InsightsServiceAccountResponseHashtagsImpressions = {
    val __obj = js.Dynamic.literal(account_hashtags = account_hashtags.asInstanceOf[js.Any], organic = organic.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsightsServiceAccountResponseHashtagsImpressions]
  }
}

