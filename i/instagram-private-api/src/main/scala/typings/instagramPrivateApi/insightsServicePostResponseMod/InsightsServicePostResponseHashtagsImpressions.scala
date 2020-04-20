package typings.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServicePostResponseHashtagsImpressions extends js.Object {
  var hashtags: InsightsServicePostResponseHashtags
  var organic: InsightsServicePostResponseOrganic
}

object InsightsServicePostResponseHashtagsImpressions {
  @scala.inline
  def apply(hashtags: InsightsServicePostResponseHashtags, organic: InsightsServicePostResponseOrganic): InsightsServicePostResponseHashtagsImpressions = {
    val __obj = js.Dynamic.literal(hashtags = hashtags.asInstanceOf[js.Any], organic = organic.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseHashtagsImpressions]
  }
}

