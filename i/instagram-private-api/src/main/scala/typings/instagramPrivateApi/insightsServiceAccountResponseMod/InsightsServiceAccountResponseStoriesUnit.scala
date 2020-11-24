package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseStoriesUnit extends js.Object {
  
  var last_week_stories_count: Double = js.native
  
  var state: String = js.native
  
  var summary_stories: InsightsServiceAccountResponseSummaryStories = js.native
  
  var week_over_week_stories_delta: Double = js.native
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
  
  @scala.inline
  implicit class InsightsServiceAccountResponseStoriesUnitOps[Self <: InsightsServiceAccountResponseStoriesUnit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLast_week_stories_count(value: Double): Self = this.set("last_week_stories_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary_stories(value: InsightsServiceAccountResponseSummaryStories): Self = this.set("summary_stories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeek_over_week_stories_delta(value: Double): Self = this.set("week_over_week_stories_delta", value.asInstanceOf[js.Any])
  }
}
