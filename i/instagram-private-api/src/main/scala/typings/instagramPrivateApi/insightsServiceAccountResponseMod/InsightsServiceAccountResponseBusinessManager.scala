package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseBusinessManager extends js.Object {
  
  var account_insights_unit: InsightsServiceAccountResponseAccountInsightsUnit = js.native
  
  var account_summary_unit: InsightsServiceAccountResponseAccountSummaryUnit = js.native
  
  var followers_unit: InsightsServiceAccountResponseFollowersUnit = js.native
  
  var promotions_unit: InsightsServiceAccountResponsePromotionsUnit = js.native
  
  var status: InsightsServiceAccountResponseStatus = js.native
  
  var stories_unit: InsightsServiceAccountResponseStoriesUnit = js.native
  
  var top_posts_unit: InsightsServiceAccountResponseTopPostsUnit = js.native
}
object InsightsServiceAccountResponseBusinessManager {
  
  @scala.inline
  def apply(
    account_insights_unit: InsightsServiceAccountResponseAccountInsightsUnit,
    account_summary_unit: InsightsServiceAccountResponseAccountSummaryUnit,
    followers_unit: InsightsServiceAccountResponseFollowersUnit,
    promotions_unit: InsightsServiceAccountResponsePromotionsUnit,
    status: InsightsServiceAccountResponseStatus,
    stories_unit: InsightsServiceAccountResponseStoriesUnit,
    top_posts_unit: InsightsServiceAccountResponseTopPostsUnit
  ): InsightsServiceAccountResponseBusinessManager = {
    val __obj = js.Dynamic.literal(account_insights_unit = account_insights_unit.asInstanceOf[js.Any], account_summary_unit = account_summary_unit.asInstanceOf[js.Any], followers_unit = followers_unit.asInstanceOf[js.Any], promotions_unit = promotions_unit.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stories_unit = stories_unit.asInstanceOf[js.Any], top_posts_unit = top_posts_unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseBusinessManager]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseBusinessManagerOps[Self <: InsightsServiceAccountResponseBusinessManager] (val x: Self) extends AnyVal {
    
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
    def setAccount_insights_unit(value: InsightsServiceAccountResponseAccountInsightsUnit): Self = this.set("account_insights_unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount_summary_unit(value: InsightsServiceAccountResponseAccountSummaryUnit): Self = this.set("account_summary_unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowers_unit(value: InsightsServiceAccountResponseFollowersUnit): Self = this.set("followers_unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotions_unit(value: InsightsServiceAccountResponsePromotionsUnit): Self = this.set("promotions_unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: InsightsServiceAccountResponseStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStories_unit(value: InsightsServiceAccountResponseStoriesUnit): Self = this.set("stories_unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop_posts_unit(value: InsightsServiceAccountResponseTopPostsUnit): Self = this.set("top_posts_unit", value.asInstanceOf[js.Any])
  }
}
