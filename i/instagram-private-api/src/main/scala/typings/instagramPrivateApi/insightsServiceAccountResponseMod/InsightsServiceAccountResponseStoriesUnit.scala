package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceAccountResponseStoriesUnit extends js.Object {
  var last_week_stories_count: Double
  var state: String
  var summary_stories: InsightsServiceAccountResponseSummaryStories
  var week_over_week_stories_delta: Double
}

object InsightsServiceAccountResponseStoriesUnit {
  @scala.inline
  def apply(
    last_week_stories_count: Double,
    state: String,
    summary_stories: InsightsServiceAccountResponseSummaryStories,
    week_over_week_stories_delta: Double
  ): InsightsServiceAccountResponseStoriesUnit = {
    val __obj = js.Dynamic.literal(last_week_stories_count = last_week_stories_count.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], summary_stories = summary_stories.asInstanceOf[js.Any], week_over_week_stories_delta = week_over_week_stories_delta.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseStoriesUnit]
  }
}

