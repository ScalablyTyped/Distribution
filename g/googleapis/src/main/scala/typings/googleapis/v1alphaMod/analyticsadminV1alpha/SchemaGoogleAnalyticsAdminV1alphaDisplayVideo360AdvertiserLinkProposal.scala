package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal extends StObject {
  
  /**
    * Immutable. Enables personalized advertising features with this integration. If this field is not set on create, it will be defaulted to true.
    */
  var adsPersonalizationEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The display name of the Display & Video Advertiser. Only populated for proposals that originated from Display & Video 360.
    */
  var advertiserDisplayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The Display & Video 360 Advertiser's advertiser ID.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. Enables the import of campaign data from Display & Video 360. If this field is not set on create, it will be defaulted to true.
    */
  var campaignDataSharingEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Immutable. Enables the import of cost data from Display & Video 360. This can only be enabled if campaign_data_sharing_enabled is enabled. If this field is not set on create, it will be defaulted to true.
    */
  var costDataSharingEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The status information for this link proposal.
    */
  var linkProposalStatusDetails: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaLinkProposalStatusDetails] = js.undefined
  
  /**
    * Output only. The resource name for this DisplayVideo360AdvertiserLinkProposal resource. Format: properties/{propertyId\}/displayVideo360AdvertiserLinkProposals/{proposalId\} Note: proposalId is not the Display & Video 360 Advertiser ID
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. On a proposal being sent to Display & Video 360, this field must be set to the email address of an admin on the target advertiser. This is used to verify that the Google Analytics admin is aware of at least one admin on the Display & Video 360 Advertiser. This does not restrict approval of the proposal to a single user. Any admin on the Display & Video 360 Advertiser may approve the proposal.
    */
  var validationEmail: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal](x: Self) {
    
    inline def setAdsPersonalizationEnabled(value: Boolean): Self = StObject.set(x, "adsPersonalizationEnabled", value.asInstanceOf[js.Any])
    
    inline def setAdsPersonalizationEnabledNull: Self = StObject.set(x, "adsPersonalizationEnabled", null)
    
    inline def setAdsPersonalizationEnabledUndefined: Self = StObject.set(x, "adsPersonalizationEnabled", js.undefined)
    
    inline def setAdvertiserDisplayName(value: String): Self = StObject.set(x, "advertiserDisplayName", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserDisplayNameNull: Self = StObject.set(x, "advertiserDisplayName", null)
    
    inline def setAdvertiserDisplayNameUndefined: Self = StObject.set(x, "advertiserDisplayName", js.undefined)
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setCampaignDataSharingEnabled(value: Boolean): Self = StObject.set(x, "campaignDataSharingEnabled", value.asInstanceOf[js.Any])
    
    inline def setCampaignDataSharingEnabledNull: Self = StObject.set(x, "campaignDataSharingEnabled", null)
    
    inline def setCampaignDataSharingEnabledUndefined: Self = StObject.set(x, "campaignDataSharingEnabled", js.undefined)
    
    inline def setCostDataSharingEnabled(value: Boolean): Self = StObject.set(x, "costDataSharingEnabled", value.asInstanceOf[js.Any])
    
    inline def setCostDataSharingEnabledNull: Self = StObject.set(x, "costDataSharingEnabled", null)
    
    inline def setCostDataSharingEnabledUndefined: Self = StObject.set(x, "costDataSharingEnabled", js.undefined)
    
    inline def setLinkProposalStatusDetails(value: SchemaGoogleAnalyticsAdminV1alphaLinkProposalStatusDetails): Self = StObject.set(x, "linkProposalStatusDetails", value.asInstanceOf[js.Any])
    
    inline def setLinkProposalStatusDetailsUndefined: Self = StObject.set(x, "linkProposalStatusDetails", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValidationEmail(value: String): Self = StObject.set(x, "validationEmail", value.asInstanceOf[js.Any])
    
    inline def setValidationEmailNull: Self = StObject.set(x, "validationEmail", null)
    
    inline def setValidationEmailUndefined: Self = StObject.set(x, "validationEmail", js.undefined)
  }
}
