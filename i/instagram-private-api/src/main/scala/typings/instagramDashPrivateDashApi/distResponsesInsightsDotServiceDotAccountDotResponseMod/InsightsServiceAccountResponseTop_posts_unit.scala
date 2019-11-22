package typings.instagramDashPrivateDashApi.distResponsesInsightsDotServiceDotAccountDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceAccountResponseTop_posts_unit extends js.Object {
  var last_week_posts_count: Double
  var top_posts: InsightsServiceAccountResponseTop_posts
  var week_over_week_posts_delta: Double
}

object InsightsServiceAccountResponseTop_posts_unit {
  @scala.inline
  def apply(
    last_week_posts_count: Double,
    top_posts: InsightsServiceAccountResponseTop_posts,
    week_over_week_posts_delta: Double
  ): InsightsServiceAccountResponseTop_posts_unit = {
    val __obj = js.Dynamic.literal(last_week_posts_count = last_week_posts_count, top_posts = top_posts, week_over_week_posts_delta = week_over_week_posts_delta)
  
    __obj.asInstanceOf[InsightsServiceAccountResponseTop_posts_unit]
  }
}

