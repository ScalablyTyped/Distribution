package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseFollowersUnit extends js.Object {
  
  var all_followers_age_graph: InsightsServiceAccountResponseAllFollowersAgeGraph = js.native
  
  var days_hourly_followers_graphs: js.Array[InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem] = js.native
  
  var followers_delta_from_last_week: Double = js.native
  
  var followers_top_cities_graph: InsightsServiceAccountResponseFollowersTopCitiesGraph = js.native
  
  var followers_top_countries_graph: InsightsServiceAccountResponseFollowersTopCountriesGraph = js.native
  
  var followers_unit_state: String = js.native
  
  var gender_graph: InsightsServiceAccountResponseGenderGraph = js.native
  
  var men_followers_age_graph: InsightsServiceAccountResponseMenFollowersAgeGraph = js.native
  
  var week_daily_followers_graph: InsightsServiceAccountResponseWeekDailyFollowersGraph = js.native
  
  var women_followers_age_graph: InsightsServiceAccountResponseWomenFollowersAgeGraph = js.native
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
  
  @scala.inline
  implicit class InsightsServiceAccountResponseFollowersUnitOps[Self <: InsightsServiceAccountResponseFollowersUnit] (val x: Self) extends AnyVal {
    
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
    def setAll_followers_age_graph(value: InsightsServiceAccountResponseAllFollowersAgeGraph): Self = this.set("all_followers_age_graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDays_hourly_followers_graphsVarargs(value: InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem*): Self = this.set("days_hourly_followers_graphs", js.Array(value :_*))
    
    @scala.inline
    def setDays_hourly_followers_graphs(value: js.Array[InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem]): Self = this.set("days_hourly_followers_graphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowers_delta_from_last_week(value: Double): Self = this.set("followers_delta_from_last_week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowers_top_cities_graph(value: InsightsServiceAccountResponseFollowersTopCitiesGraph): Self = this.set("followers_top_cities_graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowers_top_countries_graph(value: InsightsServiceAccountResponseFollowersTopCountriesGraph): Self = this.set("followers_top_countries_graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowers_unit_state(value: String): Self = this.set("followers_unit_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGender_graph(value: InsightsServiceAccountResponseGenderGraph): Self = this.set("gender_graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMen_followers_age_graph(value: InsightsServiceAccountResponseMenFollowersAgeGraph): Self = this.set("men_followers_age_graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeek_daily_followers_graph(value: InsightsServiceAccountResponseWeekDailyFollowersGraph): Self = this.set("week_daily_followers_graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWomen_followers_age_graph(value: InsightsServiceAccountResponseWomenFollowersAgeGraph): Self = this.set("women_followers_age_graph", value.asInstanceOf[js.Any])
  }
}
