package typings.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServicePostResponseMetrics extends js.Object {
  
  var hashtags_impressions: InsightsServicePostResponseHashtagsImpressions = js.native
  
  var impression_count: Double = js.native
  
  var impressions: InsightsServicePostResponseImpressions = js.native
  
  var owner_account_follows_count: Double = js.native
  
  var owner_profile_views_count: Double = js.native
  
  var profile_actions: InsightsServicePostResponseProfileActions = js.native
  
  var reach: InsightsServicePostResponseReach = js.native
  
  var reach_count: Double = js.native
  
  var share_count: InsightsServicePostResponseShareCount = js.native
}
object InsightsServicePostResponseMetrics {
  
  @scala.inline
  def apply(
    hashtags_impressions: InsightsServicePostResponseHashtagsImpressions,
    impression_count: Double,
    impressions: InsightsServicePostResponseImpressions,
    owner_account_follows_count: Double,
    owner_profile_views_count: Double,
    profile_actions: InsightsServicePostResponseProfileActions,
    reach: InsightsServicePostResponseReach,
    reach_count: Double,
    share_count: InsightsServicePostResponseShareCount
  ): InsightsServicePostResponseMetrics = {
    val __obj = js.Dynamic.literal(hashtags_impressions = hashtags_impressions.asInstanceOf[js.Any], impression_count = impression_count.asInstanceOf[js.Any], impressions = impressions.asInstanceOf[js.Any], owner_account_follows_count = owner_account_follows_count.asInstanceOf[js.Any], owner_profile_views_count = owner_profile_views_count.asInstanceOf[js.Any], profile_actions = profile_actions.asInstanceOf[js.Any], reach = reach.asInstanceOf[js.Any], reach_count = reach_count.asInstanceOf[js.Any], share_count = share_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseMetrics]
  }
  
  @scala.inline
  implicit class InsightsServicePostResponseMetricsOps[Self <: InsightsServicePostResponseMetrics] (val x: Self) extends AnyVal {
    
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
    def setHashtags_impressions(value: InsightsServicePostResponseHashtagsImpressions): Self = this.set("hashtags_impressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpression_count(value: Double): Self = this.set("impression_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressions(value: InsightsServicePostResponseImpressions): Self = this.set("impressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner_account_follows_count(value: Double): Self = this.set("owner_account_follows_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner_profile_views_count(value: Double): Self = this.set("owner_profile_views_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_actions(value: InsightsServicePostResponseProfileActions): Self = this.set("profile_actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReach(value: InsightsServicePostResponseReach): Self = this.set("reach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReach_count(value: Double): Self = this.set("reach_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShare_count(value: InsightsServicePostResponseShareCount): Self = this.set("share_count", value.asInstanceOf[js.Any])
  }
}
