package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Activity represents data for an activity of a user. Note that an
  * Activity is different from a hit. A hit might result in multiple
  * Activity&#39;s. For example, if a hit includes a transaction and a goal
  * completion, there will be two Activity protos for this hit, one for
  * ECOMMERCE and one for GOAL. Conversely, multiple hits can also construct
  * one Activity. In classic e-commerce, data for one transaction might be sent
  * through multiple hits. These hits will be merged into one ECOMMERCE
  * Activity.
  */
@js.native
trait SchemaActivity extends js.Object {
  
  /**
    * Timestamp of the activity.
    */
  var activityTime: js.UndefOr[String] = js.native
  
  /**
    * Type of this activity.
    */
  var activityType: js.UndefOr[String] = js.native
  
  /**
    * This will be set if `activity_type` equals `SCREEN_VIEW`.
    */
  var appview: js.UndefOr[SchemaScreenviewData] = js.native
  
  /**
    * For manual campaign tracking, it is the value of the utm_campaign
    * campaign tracking parameter. For AdWords autotagging, it is the name(s)
    * of the online ad campaign(s) you use for the property. If you use
    * neither, its value is (not set).
    */
  var campaign: js.UndefOr[String] = js.native
  
  /**
    * The Channel Group associated with an end user&#39;s session for this View
    * (defined by the View&#39;s Channel Groupings).
    */
  var channelGrouping: js.UndefOr[String] = js.native
  
  /**
    * A list of all custom dimensions associated with this activity.
    */
  var customDimension: js.UndefOr[js.Array[SchemaCustomDimension]] = js.native
  
  /**
    * This will be set if `activity_type` equals `ECOMMERCE`.
    */
  var ecommerce: js.UndefOr[SchemaEcommerceData] = js.native
  
  /**
    * This field contains all the details pertaining to an event and will be
    * set if `activity_type` equals `EVENT`.
    */
  var event: js.UndefOr[SchemaEventData] = js.native
  
  /**
    * This field contains a list of all the goals that were reached in this
    * activity when `activity_type` equals `GOAL`.
    */
  var goals: js.UndefOr[SchemaGoalSetData] = js.native
  
  /**
    * The hostname from which the tracking request was made.
    */
  var hostname: js.UndefOr[String] = js.native
  
  /**
    * For manual campaign tracking, it is the value of the utm_term campaign
    * tracking parameter. For AdWords traffic, it contains the best matching
    * targeting criteria. For the display network, where multiple targeting
    * criteria could have caused the ad to show up, it returns the best
    * matching targeting criteria as selected by Ads. This could be
    * display_keyword, site placement, boomuserlist, user_interest, age, or
    * gender. Otherwise its value is (not set).
    */
  var keyword: js.UndefOr[String] = js.native
  
  /**
    * The first page in users&#39; sessions, or the landing page.
    */
  var landingPagePath: js.UndefOr[String] = js.native
  
  /**
    * The type of referrals. For manual campaign tracking, it is the value of
    * the utm_medium campaign tracking parameter. For AdWords autotagging, it
    * is cpc. If users came from a search engine detected by Google Analytics,
    * it is organic. If the referrer is not a search engine, it is referral. If
    * users came directly to the property and document.referrer is empty, its
    * value is (none).
    */
  var medium: js.UndefOr[String] = js.native
  
  /**
    * This will be set if `activity_type` equals `PAGEVIEW`. This field
    * contains all the details about the visitor and the page that was visited.
    */
  var pageview: js.UndefOr[SchemaPageviewData] = js.native
  
  /**
    * The source of referrals. For manual campaign tracking, it is the value of
    * the utm_source campaign tracking parameter. For AdWords autotagging, it
    * is google. If you use neither, it is the domain of the source (e.g.,
    * document.referrer) referring the users. It may also contain a port
    * address. If users arrived without a referrer, its value is (direct).
    */
  var source: js.UndefOr[String] = js.native
}
object SchemaActivity {
  
  @scala.inline
  def apply(): SchemaActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivity]
  }
  
  @scala.inline
  implicit class SchemaActivityOps[Self <: SchemaActivity] (val x: Self) extends AnyVal {
    
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
    def setActivityTime(value: String): Self = this.set("activityTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityTime: Self = this.set("activityTime", js.undefined)
    
    @scala.inline
    def setActivityType(value: String): Self = this.set("activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityType: Self = this.set("activityType", js.undefined)
    
    @scala.inline
    def setAppview(value: SchemaScreenviewData): Self = this.set("appview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppview: Self = this.set("appview", js.undefined)
    
    @scala.inline
    def setCampaign(value: String): Self = this.set("campaign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaign: Self = this.set("campaign", js.undefined)
    
    @scala.inline
    def setChannelGrouping(value: String): Self = this.set("channelGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelGrouping: Self = this.set("channelGrouping", js.undefined)
    
    @scala.inline
    def setCustomDimensionVarargs(value: SchemaCustomDimension*): Self = this.set("customDimension", js.Array(value :_*))
    
    @scala.inline
    def setCustomDimension(value: js.Array[SchemaCustomDimension]): Self = this.set("customDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDimension: Self = this.set("customDimension", js.undefined)
    
    @scala.inline
    def setEcommerce(value: SchemaEcommerceData): Self = this.set("ecommerce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcommerce: Self = this.set("ecommerce", js.undefined)
    
    @scala.inline
    def setEvent(value: SchemaEventData): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setGoals(value: SchemaGoalSetData): Self = this.set("goals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoals: Self = this.set("goals", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setKeyword(value: String): Self = this.set("keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyword: Self = this.set("keyword", js.undefined)
    
    @scala.inline
    def setLandingPagePath(value: String): Self = this.set("landingPagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLandingPagePath: Self = this.set("landingPagePath", js.undefined)
    
    @scala.inline
    def setMedium(value: String): Self = this.set("medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedium: Self = this.set("medium", js.undefined)
    
    @scala.inline
    def setPageview(value: SchemaPageviewData): Self = this.set("pageview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageview: Self = this.set("pageview", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
