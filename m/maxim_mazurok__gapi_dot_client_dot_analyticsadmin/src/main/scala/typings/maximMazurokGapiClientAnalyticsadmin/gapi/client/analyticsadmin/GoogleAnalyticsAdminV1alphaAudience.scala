package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAudience extends StObject {
  
  /** Output only. It is automatically set by GA to false if this is an NPA Audience and is excluded from ads personalization. */
  var adsPersonalizationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Required. The description of the Audience. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Required. The display name of the Audience. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Optional. Specifies an event to log when a user joins the Audience. If not set, no event is logged when a user joins the Audience. */
  var eventTrigger: js.UndefOr[GoogleAnalyticsAdminV1alphaAudienceEventTrigger] = js.undefined
  
  /**
    * Immutable. Specifies how long an exclusion lasts for users that meet the exclusion filter. It is applied to all EXCLUDE filter clauses and is ignored when there is no EXCLUDE filter
    * clause in the Audience.
    */
  var exclusionDurationMode: js.UndefOr[String] = js.undefined
  
  /** Required. Immutable. null Filter clauses that define the Audience. All clauses will be AND’ed together. */
  var filterClauses: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaAudienceFilterClause]] = js.undefined
  
  /** Required. Immutable. The duration a user should stay in an Audience. It cannot be set to more than 540 days. */
  var membershipDurationDays: js.UndefOr[Double] = js.undefined
  
  /** Output only. The resource name for this Audience resource. Format: properties/{propertyId}/audiences/{audienceId} */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAudience {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAudience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAudience]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaAudience](x: Self) {
    
    inline def setAdsPersonalizationEnabled(value: Boolean): Self = StObject.set(x, "adsPersonalizationEnabled", value.asInstanceOf[js.Any])
    
    inline def setAdsPersonalizationEnabledUndefined: Self = StObject.set(x, "adsPersonalizationEnabled", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEventTrigger(value: GoogleAnalyticsAdminV1alphaAudienceEventTrigger): Self = StObject.set(x, "eventTrigger", value.asInstanceOf[js.Any])
    
    inline def setEventTriggerUndefined: Self = StObject.set(x, "eventTrigger", js.undefined)
    
    inline def setExclusionDurationMode(value: String): Self = StObject.set(x, "exclusionDurationMode", value.asInstanceOf[js.Any])
    
    inline def setExclusionDurationModeUndefined: Self = StObject.set(x, "exclusionDurationMode", js.undefined)
    
    inline def setFilterClauses(value: js.Array[GoogleAnalyticsAdminV1alphaAudienceFilterClause]): Self = StObject.set(x, "filterClauses", value.asInstanceOf[js.Any])
    
    inline def setFilterClausesUndefined: Self = StObject.set(x, "filterClauses", js.undefined)
    
    inline def setFilterClausesVarargs(value: GoogleAnalyticsAdminV1alphaAudienceFilterClause*): Self = StObject.set(x, "filterClauses", js.Array(value*))
    
    inline def setMembershipDurationDays(value: Double): Self = StObject.set(x, "membershipDurationDays", value.asInstanceOf[js.Any])
    
    inline def setMembershipDurationDaysUndefined: Self = StObject.set(x, "membershipDurationDays", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
