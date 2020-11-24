package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseAccountInsightsUnit extends js.Object {
  
  var account_actions_graph: InsightsServiceAccountResponseAccountActionsGraph = js.native
  
  var account_discovery_graph: InsightsServiceAccountResponseAccountDiscoveryGraph = js.native
  
  var aymt_instagram_account_insights_channel: InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel = js.native
  
  var call_metric_count: Double = js.native
  
  var call_metric_delta: Double = js.native
  
  var email_metric_count: Double = js.native
  
  var email_metric_delta: Double = js.native
  
  var get_direction_metric_count: Double = js.native
  
  var get_direction_metric_delta: Double = js.native
  
  var graph: InsightsServiceAccountResponseGraph = js.native
  
  var hashtags_impressions: InsightsServiceAccountResponseHashtagsImpressions = js.native
  
  var hashtags_reach: InsightsServiceAccountResponseHashtagsReach = js.native
  
  var impressions_metric_count: Double = js.native
  
  var impressions_metric_delta: Double = js.native
  
  var last_week_impressions: Double = js.native
  
  var metric_graph: InsightsServiceAccountResponseMetricGraph = js.native
  
  var profile_visits_metric_count: Double = js.native
  
  var profile_visits_metric_delta: Double = js.native
  
  var reach_metric_count: Double = js.native
  
  var reach_metric_delta: Double = js.native
  
  var text_metric_count: Double = js.native
  
  var text_metric_delta: Double = js.native
  
  var website_visits_metric_count: Double = js.native
  
  var website_visits_metric_delta: Double = js.native
}
object InsightsServiceAccountResponseAccountInsightsUnit {
  
  @scala.inline
  def apply(
    account_actions_graph: InsightsServiceAccountResponseAccountActionsGraph,
    account_discovery_graph: InsightsServiceAccountResponseAccountDiscoveryGraph,
    aymt_instagram_account_insights_channel: InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel,
    call_metric_count: Double,
    call_metric_delta: Double,
    email_metric_count: Double,
    email_metric_delta: Double,
    get_direction_metric_count: Double,
    get_direction_metric_delta: Double,
    graph: InsightsServiceAccountResponseGraph,
    hashtags_impressions: InsightsServiceAccountResponseHashtagsImpressions,
    hashtags_reach: InsightsServiceAccountResponseHashtagsReach,
    impressions_metric_count: Double,
    impressions_metric_delta: Double,
    last_week_impressions: Double,
    metric_graph: InsightsServiceAccountResponseMetricGraph,
    profile_visits_metric_count: Double,
    profile_visits_metric_delta: Double,
    reach_metric_count: Double,
    reach_metric_delta: Double,
    text_metric_count: Double,
    text_metric_delta: Double,
    website_visits_metric_count: Double,
    website_visits_metric_delta: Double
  ): InsightsServiceAccountResponseAccountInsightsUnit = {
    val __obj = js.Dynamic.literal(account_actions_graph = account_actions_graph.asInstanceOf[js.Any], account_discovery_graph = account_discovery_graph.asInstanceOf[js.Any], aymt_instagram_account_insights_channel = aymt_instagram_account_insights_channel.asInstanceOf[js.Any], call_metric_count = call_metric_count.asInstanceOf[js.Any], call_metric_delta = call_metric_delta.asInstanceOf[js.Any], email_metric_count = email_metric_count.asInstanceOf[js.Any], email_metric_delta = email_metric_delta.asInstanceOf[js.Any], get_direction_metric_count = get_direction_metric_count.asInstanceOf[js.Any], get_direction_metric_delta = get_direction_metric_delta.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any], hashtags_impressions = hashtags_impressions.asInstanceOf[js.Any], hashtags_reach = hashtags_reach.asInstanceOf[js.Any], impressions_metric_count = impressions_metric_count.asInstanceOf[js.Any], impressions_metric_delta = impressions_metric_delta.asInstanceOf[js.Any], last_week_impressions = last_week_impressions.asInstanceOf[js.Any], metric_graph = metric_graph.asInstanceOf[js.Any], profile_visits_metric_count = profile_visits_metric_count.asInstanceOf[js.Any], profile_visits_metric_delta = profile_visits_metric_delta.asInstanceOf[js.Any], reach_metric_count = reach_metric_count.asInstanceOf[js.Any], reach_metric_delta = reach_metric_delta.asInstanceOf[js.Any], text_metric_count = text_metric_count.asInstanceOf[js.Any], text_metric_delta = text_metric_delta.asInstanceOf[js.Any], website_visits_metric_count = website_visits_metric_count.asInstanceOf[js.Any], website_visits_metric_delta = website_visits_metric_delta.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseAccountInsightsUnit]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseAccountInsightsUnitOps[Self <: InsightsServiceAccountResponseAccountInsightsUnit] (val x: Self) extends AnyVal {
    
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
    def setAccount_actions_graph(value: InsightsServiceAccountResponseAccountActionsGraph): Self = this.set("account_actions_graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount_discovery_graph(value: InsightsServiceAccountResponseAccountDiscoveryGraph): Self = this.set("account_discovery_graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAymt_instagram_account_insights_channel(value: InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel): Self = this.set("aymt_instagram_account_insights_channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCall_metric_count(value: Double): Self = this.set("call_metric_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCall_metric_delta(value: Double): Self = this.set("call_metric_delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail_metric_count(value: Double): Self = this.set("email_metric_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail_metric_delta(value: Double): Self = this.set("email_metric_delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet_direction_metric_count(value: Double): Self = this.set("get_direction_metric_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet_direction_metric_delta(value: Double): Self = this.set("get_direction_metric_delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraph(value: InsightsServiceAccountResponseGraph): Self = this.set("graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashtags_impressions(value: InsightsServiceAccountResponseHashtagsImpressions): Self = this.set("hashtags_impressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashtags_reach(value: InsightsServiceAccountResponseHashtagsReach): Self = this.set("hashtags_reach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressions_metric_count(value: Double): Self = this.set("impressions_metric_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressions_metric_delta(value: Double): Self = this.set("impressions_metric_delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_week_impressions(value: Double): Self = this.set("last_week_impressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetric_graph(value: InsightsServiceAccountResponseMetricGraph): Self = this.set("metric_graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_visits_metric_count(value: Double): Self = this.set("profile_visits_metric_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_visits_metric_delta(value: Double): Self = this.set("profile_visits_metric_delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReach_metric_count(value: Double): Self = this.set("reach_metric_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReach_metric_delta(value: Double): Self = this.set("reach_metric_delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText_metric_count(value: Double): Self = this.set("text_metric_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText_metric_delta(value: Double): Self = this.set("text_metric_delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsite_visits_metric_count(value: Double): Self = this.set("website_visits_metric_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsite_visits_metric_delta(value: Double): Self = this.set("website_visits_metric_delta", value.asInstanceOf[js.Any])
  }
}
