package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseFollowersUnit extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: InsightsServiceAccountResponseFollowersUnit](x: Self) {
    
    inline def setAll_followers_age_graph(value: InsightsServiceAccountResponseAllFollowersAgeGraph): Self = StObject.set(x, "all_followers_age_graph", value.asInstanceOf[js.Any])
    
    inline def setDays_hourly_followers_graphs(value: js.Array[InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem]): Self = StObject.set(x, "days_hourly_followers_graphs", value.asInstanceOf[js.Any])
    
    inline def setDays_hourly_followers_graphsVarargs(value: InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem*): Self = StObject.set(x, "days_hourly_followers_graphs", js.Array(value :_*))
    
    inline def setFollowers_delta_from_last_week(value: Double): Self = StObject.set(x, "followers_delta_from_last_week", value.asInstanceOf[js.Any])
    
    inline def setFollowers_top_cities_graph(value: InsightsServiceAccountResponseFollowersTopCitiesGraph): Self = StObject.set(x, "followers_top_cities_graph", value.asInstanceOf[js.Any])
    
    inline def setFollowers_top_countries_graph(value: InsightsServiceAccountResponseFollowersTopCountriesGraph): Self = StObject.set(x, "followers_top_countries_graph", value.asInstanceOf[js.Any])
    
    inline def setFollowers_unit_state(value: String): Self = StObject.set(x, "followers_unit_state", value.asInstanceOf[js.Any])
    
    inline def setGender_graph(value: InsightsServiceAccountResponseGenderGraph): Self = StObject.set(x, "gender_graph", value.asInstanceOf[js.Any])
    
    inline def setMen_followers_age_graph(value: InsightsServiceAccountResponseMenFollowersAgeGraph): Self = StObject.set(x, "men_followers_age_graph", value.asInstanceOf[js.Any])
    
    inline def setWeek_daily_followers_graph(value: InsightsServiceAccountResponseWeekDailyFollowersGraph): Self = StObject.set(x, "week_daily_followers_graph", value.asInstanceOf[js.Any])
    
    inline def setWomen_followers_age_graph(value: InsightsServiceAccountResponseWomenFollowersAgeGraph): Self = StObject.set(x, "women_followers_age_graph", value.asInstanceOf[js.Any])
  }
}
