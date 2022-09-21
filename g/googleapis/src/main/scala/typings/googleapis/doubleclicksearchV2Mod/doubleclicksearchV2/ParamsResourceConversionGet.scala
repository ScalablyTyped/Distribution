package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

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
    * Numeric ID of the campaign.
    */
  var campaignId: js.UndefOr[String] = js.undefined
  
  /**
    * Numeric ID of the criterion.
    */
  var criterionId: js.UndefOr[String] = js.undefined
  
  /**
    * Last date (inclusive) on which to retrieve conversions. Format is yyyymmdd.
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
    * First date (inclusive) on which to retrieve conversions. Format is yyyymmdd.
    */
  var startDate: js.UndefOr[Double] = js.undefined
  
  /**
    * The 0-based starting index for retrieving conversions results.
    */
  var startRow: js.UndefOr[Double] = js.undefined
}
object ParamsResourceConversionGet {
  
  inline def apply(): ParamsResourceConversionGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceConversionGet]
  }
  
  extension [Self <: ParamsResourceConversionGet](x: Self) {
    
    inline def setAdGroupId(value: String): Self = StObject.set(x, "adGroupId", value.asInstanceOf[js.Any])
    
    inline def setAdGroupIdUndefined: Self = StObject.set(x, "adGroupId", js.undefined)
    
    inline def setAdId(value: String): Self = StObject.set(x, "adId", value.asInstanceOf[js.Any])
    
    inline def setAdIdUndefined: Self = StObject.set(x, "adId", js.undefined)
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setAgencyId(value: String): Self = StObject.set(x, "agencyId", value.asInstanceOf[js.Any])
    
    inline def setAgencyIdUndefined: Self = StObject.set(x, "agencyId", js.undefined)
    
    inline def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    inline def setCriterionId(value: String): Self = StObject.set(x, "criterionId", value.asInstanceOf[js.Any])
    
    inline def setCriterionIdUndefined: Self = StObject.set(x, "criterionId", js.undefined)
    
    inline def setEndDate(value: Double): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setEngineAccountId(value: String): Self = StObject.set(x, "engineAccountId", value.asInstanceOf[js.Any])
    
    inline def setEngineAccountIdUndefined: Self = StObject.set(x, "engineAccountId", js.undefined)
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    inline def setStartDate(value: Double): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
    
    inline def setStartRowUndefined: Self = StObject.set(x, "startRow", js.undefined)
  }
}
