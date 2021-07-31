package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceConversionGet
  extends StObject
     with StandardParameters {
  
  /**
    * Numeric ID of the ad group.
    */
  var adGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Numeric ID of the ad.
    */
  var adId: js.UndefOr[String] = js.undefined
  
  /**
    * Numeric ID of the advertiser.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Numeric ID of the agency.
    */
  var agencyId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Numeric ID of the campaign.
    */
  var campaignId: js.UndefOr[String] = js.undefined
  
  /**
    * Numeric ID of the criterion.
    */
  var criterionId: js.UndefOr[String] = js.undefined
  
  /**
    * Last date (inclusive) on which to retrieve conversions. Format is
    * yyyymmdd.
    */
  var endDate: js.UndefOr[Double] = js.undefined
  
  /**
    * Numeric ID of the engine account.
    */
  var engineAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * The number of conversions to return per call.
    */
  var rowCount: js.UndefOr[Double] = js.undefined
  
  /**
    * First date (inclusive) on which to retrieve conversions. Format is
    * yyyymmdd.
    */
  var startDate: js.UndefOr[Double] = js.undefined
  
  /**
    * The 0-based starting index for retrieving conversions results.
    */
  var startRow: js.UndefOr[Double] = js.undefined
}
object ParamsResourceConversionGet {
  
  @scala.inline
  def apply(): ParamsResourceConversionGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceConversionGet]
  }
  
  @scala.inline
  implicit class ParamsResourceConversionGetMutableBuilder[Self <: ParamsResourceConversionGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdGroupId(value: String): Self = StObject.set(x, "adGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdGroupIdUndefined: Self = StObject.set(x, "adGroupId", js.undefined)
    
    @scala.inline
    def setAdId(value: String): Self = StObject.set(x, "adId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdIdUndefined: Self = StObject.set(x, "adId", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setAgencyId(value: String): Self = StObject.set(x, "agencyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgencyIdUndefined: Self = StObject.set(x, "agencyId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    @scala.inline
    def setCriterionId(value: String): Self = StObject.set(x, "criterionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriterionIdUndefined: Self = StObject.set(x, "criterionId", js.undefined)
    
    @scala.inline
    def setEndDate(value: Double): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setEngineAccountId(value: String): Self = StObject.set(x, "engineAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineAccountIdUndefined: Self = StObject.set(x, "engineAccountId", js.undefined)
    
    @scala.inline
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    @scala.inline
    def setStartDate(value: Double): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartRowUndefined: Self = StObject.set(x, "startRow", js.undefined)
  }
}
