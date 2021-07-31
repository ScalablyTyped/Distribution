package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseStoriesUnit extends StObject {
  
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
  
  @scala.inline
  implicit class InsightsServiceAccountResponseStoriesUnitMutableBuilder[Self <: InsightsServiceAccountResponseStoriesUnit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLast_week_stories_count(value: Double): Self = StObject.set(x, "last_week_stories_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary_stories(value: InsightsServiceAccountResponseSummaryStories): Self = StObject.set(x, "summary_stories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeek_over_week_stories_delta(value: Double): Self = StObject.set(x, "week_over_week_stories_delta", value.asInstanceOf[js.Any])
  }
}
