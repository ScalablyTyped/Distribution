package typings.instagramDashPrivateDashApi.distResponsesInsightsDotServiceDotAccountDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceAccountResponseFollowers_unit extends js.Object {
  var all_followers_age_graph: InsightsServiceAccountResponseAll_followers_age_graph
  var days_hourly_followers_graphs: js.Array[InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem]
  var followers_delta_from_last_week: Double
  var followers_top_cities_graph: InsightsServiceAccountResponseFollowers_top_cities_graph
  var followers_top_countries_graph: InsightsServiceAccountResponseFollowers_top_countries_graph
  var followers_unit_state: String
  var gender_graph: InsightsServiceAccountResponseGender_graph
  var men_followers_age_graph: InsightsServiceAccountResponseMen_followers_age_graph
  var week_daily_followers_graph: InsightsServiceAccountResponseWeek_daily_followers_graph
  var women_followers_age_graph: InsightsServiceAccountResponseWomen_followers_age_graph
}

object InsightsServiceAccountResponseFollowers_unit {
  @scala.inline
  def apply(
    all_followers_age_graph: InsightsServiceAccountResponseAll_followers_age_graph,
    days_hourly_followers_graphs: js.Array[InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem],
    followers_delta_from_last_week: Double,
    followers_top_cities_graph: InsightsServiceAccountResponseFollowers_top_cities_graph,
    followers_top_countries_graph: InsightsServiceAccountResponseFollowers_top_countries_graph,
    followers_unit_state: String,
    gender_graph: InsightsServiceAccountResponseGender_graph,
    men_followers_age_graph: InsightsServiceAccountResponseMen_followers_age_graph,
    week_daily_followers_graph: InsightsServiceAccountResponseWeek_daily_followers_graph,
    women_followers_age_graph: InsightsServiceAccountResponseWomen_followers_age_graph
  ): InsightsServiceAccountResponseFollowers_unit = {
    val __obj = js.Dynamic.literal(all_followers_age_graph = all_followers_age_graph.asInstanceOf[js.Any], days_hourly_followers_graphs = days_hourly_followers_graphs.asInstanceOf[js.Any], followers_delta_from_last_week = followers_delta_from_last_week.asInstanceOf[js.Any], followers_top_cities_graph = followers_top_cities_graph.asInstanceOf[js.Any], followers_top_countries_graph = followers_top_countries_graph.asInstanceOf[js.Any], followers_unit_state = followers_unit_state.asInstanceOf[js.Any], gender_graph = gender_graph.asInstanceOf[js.Any], men_followers_age_graph = men_followers_age_graph.asInstanceOf[js.Any], week_daily_followers_graph = week_daily_followers_graph.asInstanceOf[js.Any], women_followers_age_graph = women_followers_age_graph.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsightsServiceAccountResponseFollowers_unit]
  }
}

