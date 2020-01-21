package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceAccountResponseFollowersUnit extends js.Object {
  var all_followers_age_graph: InsightsServiceAccountResponseAllFollowersAgeGraph
  var days_hourly_followers_graphs: js.Array[InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem]
  var followers_delta_from_last_week: Double
  var followers_top_cities_graph: InsightsServiceAccountResponseFollowersTopCitiesGraph
  var followers_top_countries_graph: InsightsServiceAccountResponseFollowersTopCountriesGraph
  var followers_unit_state: String
  var gender_graph: InsightsServiceAccountResponseGenderGraph
  var men_followers_age_graph: InsightsServiceAccountResponseMenFollowersAgeGraph
  var week_daily_followers_graph: InsightsServiceAccountResponseWeekDailyFollowersGraph
  var women_followers_age_graph: InsightsServiceAccountResponseWomenFollowersAgeGraph
}

object InsightsServiceAccountResponseFollowersUnit {
  @scala.inline
  def apply(
    all_followers_age_graph: InsightsServiceAccountResponseAllFollowersAgeGraph,
    days_hourly_followers_graphs: js.Array[InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem],
    followers_delta_from_last_week: Double,
    followers_top_cities_graph: InsightsServiceAccountResponseFollowersTopCitiesGraph,
    followers_top_countries_graph: InsightsServiceAccountResponseFollowersTopCountriesGraph,
    followers_unit_state: String,
    gender_graph: InsightsServiceAccountResponseGenderGraph,
    men_followers_age_graph: InsightsServiceAccountResponseMenFollowersAgeGraph,
    week_daily_followers_graph: InsightsServiceAccountResponseWeekDailyFollowersGraph,
    women_followers_age_graph: InsightsServiceAccountResponseWomenFollowersAgeGraph
  ): InsightsServiceAccountResponseFollowersUnit = {
    val __obj = js.Dynamic.literal(all_followers_age_graph = all_followers_age_graph.asInstanceOf[js.Any], days_hourly_followers_graphs = days_hourly_followers_graphs.asInstanceOf[js.Any], followers_delta_from_last_week = followers_delta_from_last_week.asInstanceOf[js.Any], followers_top_cities_graph = followers_top_cities_graph.asInstanceOf[js.Any], followers_top_countries_graph = followers_top_countries_graph.asInstanceOf[js.Any], followers_unit_state = followers_unit_state.asInstanceOf[js.Any], gender_graph = gender_graph.asInstanceOf[js.Any], men_followers_age_graph = men_followers_age_graph.asInstanceOf[js.Any], week_daily_followers_graph = week_daily_followers_graph.asInstanceOf[js.Any], women_followers_age_graph = women_followers_age_graph.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsightsServiceAccountResponseFollowersUnit]
  }
}

