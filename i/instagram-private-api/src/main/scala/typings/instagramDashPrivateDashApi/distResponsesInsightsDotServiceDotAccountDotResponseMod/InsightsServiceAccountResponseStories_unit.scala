package typings.instagramDashPrivateDashApi.distResponsesInsightsDotServiceDotAccountDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceAccountResponseStories_unit extends js.Object {
  var last_week_stories_count: Double
  var state: String
  var summary_stories: InsightsServiceAccountResponseSummary_stories
  var week_over_week_stories_delta: Double
}

object InsightsServiceAccountResponseStories_unit {
  @scala.inline
  def apply(
    last_week_stories_count: Double,
    state: String,
    summary_stories: InsightsServiceAccountResponseSummary_stories,
    week_over_week_stories_delta: Double
  ): InsightsServiceAccountResponseStories_unit = {
    val __obj = js.Dynamic.literal(last_week_stories_count = last_week_stories_count, state = state, summary_stories = summary_stories, week_over_week_stories_delta = week_over_week_stories_delta)
  
    __obj.asInstanceOf[InsightsServiceAccountResponseStories_unit]
  }
}

