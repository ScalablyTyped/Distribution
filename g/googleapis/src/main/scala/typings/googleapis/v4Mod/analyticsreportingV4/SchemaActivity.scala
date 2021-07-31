package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait SchemaActivity extends StObject {
  
  /**
    * Timestamp of the activity.
    */
  var activityTime: js.UndefOr[String] = js.undefined
  
  /**
    * Type of this activity.
    */
  var activityType: js.UndefOr[String] = js.undefined
  
  /**
    * This will be set if `activity_type` equals `SCREEN_VIEW`.
    */
  var appview: js.UndefOr[SchemaScreenviewData] = js.undefined
  
  /**
    * For manual campaign tracking, it is the value of the utm_campaign
    * campaign tracking parameter. For AdWords autotagging, it is the name(s)
    * of the online ad campaign(s) you use for the property. If you use
    * neither, its value is (not set).
    */
  var campaign: js.UndefOr[String] = js.undefined
  
  /**
    * The Channel Group associated with an end user&#39;s session for this View
    * (defined by the View&#39;s Channel Groupings).
    */
  var channelGrouping: js.UndefOr[String] = js.undefined
  
  /**
    * A list of all custom dimensions associated with this activity.
    */
  var customDimension: js.UndefOr[js.Array[SchemaCustomDimension]] = js.undefined
  
  /**
    * This will be set if `activity_type` equals `ECOMMERCE`.
    */
  var ecommerce: js.UndefOr[SchemaEcommerceData] = js.undefined
  
  /**
    * This field contains all the details pertaining to an event and will be
    * set if `activity_type` equals `EVENT`.
    */
  var event: js.UndefOr[SchemaEventData] = js.undefined
  
  /**
    * This field contains a list of all the goals that were reached in this
    * activity when `activity_type` equals `GOAL`.
    */
  var goals: js.UndefOr[SchemaGoalSetData] = js.undefined
  
  /**
    * The hostname from which the tracking request was made.
    */
  var hostname: js.UndefOr[String] = js.undefined
  
  /**
    * For manual campaign tracking, it is the value of the utm_term campaign
    * tracking parameter. For AdWords traffic, it contains the best matching
    * targeting criteria. For the display network, where multiple targeting
    * criteria could have caused the ad to show up, it returns the best
    * matching targeting criteria as selected by Ads. This could be
    * display_keyword, site placement, boomuserlist, user_interest, age, or
    * gender. Otherwise its value is (not set).
    */
  var keyword: js.UndefOr[String] = js.undefined
  
  /**
    * The first page in users&#39; sessions, or the landing page.
    */
  var landingPagePath: js.UndefOr[String] = js.undefined
  
  /**
    * The type of referrals. For manual campaign tracking, it is the value of
    * the utm_medium campaign tracking parameter. For AdWords autotagging, it
    * is cpc. If users came from a search engine detected by Google Analytics,
    * it is organic. If the referrer is not a search engine, it is referral. If
    * users came directly to the property and document.referrer is empty, its
    * value is (none).
    */
  var medium: js.UndefOr[String] = js.undefined
  
  /**
    * This will be set if `activity_type` equals `PAGEVIEW`. This field
    * contains all the details about the visitor and the page that was visited.
    */
  var pageview: js.UndefOr[SchemaPageviewData] = js.undefined
  
  /**
    * The source of referrals. For manual campaign tracking, it is the value of
    * the utm_source campaign tracking parameter. For AdWords autotagging, it
    * is google. If you use neither, it is the domain of the source (e.g.,
    * document.referrer) referring the users. It may also contain a port
    * address. If users arrived without a referrer, its value is (direct).
    */
  var source: js.UndefOr[String] = js.undefined
}
object SchemaActivity {
  
  @scala.inline
  def apply(): SchemaActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivity]
  }
  
  @scala.inline
  implicit class SchemaActivityMutableBuilder[Self <: SchemaActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityTime(value: String): Self = StObject.set(x, "activityTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityTimeUndefined: Self = StObject.set(x, "activityTime", js.undefined)
    
    @scala.inline
    def setActivityType(value: String): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityTypeUndefined: Self = StObject.set(x, "activityType", js.undefined)
    
    @scala.inline
    def setAppview(value: SchemaScreenviewData): Self = StObject.set(x, "appview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppviewUndefined: Self = StObject.set(x, "appview", js.undefined)
    
    @scala.inline
    def setCampaign(value: String): Self = StObject.set(x, "campaign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignUndefined: Self = StObject.set(x, "campaign", js.undefined)
    
    @scala.inline
    def setChannelGrouping(value: String): Self = StObject.set(x, "channelGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelGroupingUndefined: Self = StObject.set(x, "channelGrouping", js.undefined)
    
    @scala.inline
    def setCustomDimension(value: js.Array[SchemaCustomDimension]): Self = StObject.set(x, "customDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDimensionUndefined: Self = StObject.set(x, "customDimension", js.undefined)
    
    @scala.inline
    def setCustomDimensionVarargs(value: SchemaCustomDimension*): Self = StObject.set(x, "customDimension", js.Array(value :_*))
    
    @scala.inline
    def setEcommerce(value: SchemaEcommerceData): Self = StObject.set(x, "ecommerce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcommerceUndefined: Self = StObject.set(x, "ecommerce", js.undefined)
    
    @scala.inline
    def setEvent(value: SchemaEventData): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setGoals(value: SchemaGoalSetData): Self = StObject.set(x, "goals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoalsUndefined: Self = StObject.set(x, "goals", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    @scala.inline
    def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
    
    @scala.inline
    def setLandingPagePath(value: String): Self = StObject.set(x, "landingPagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLandingPagePathUndefined: Self = StObject.set(x, "landingPagePath", js.undefined)
    
    @scala.inline
    def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    @scala.inline
    def setPageview(value: SchemaPageviewData): Self = StObject.set(x, "pageview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageviewUndefined: Self = StObject.set(x, "pageview", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
