package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceConversionPatch
  extends StObject
     with StandardParameters {
  
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
    * Last date (inclusive) on which to retrieve conversions. Format is
    * yyyymmdd.
    */
  var endDate: js.UndefOr[Double] = js.undefined
  
  /**
    * Numeric ID of the engine account.
    */
  var engineAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaConversionList] = js.undefined
  
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
object ParamsResourceConversionPatch {
  
  inline def apply(): ParamsResourceConversionPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceConversionPatch]
  }
  
  extension [Self <: ParamsResourceConversionPatch](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setAgencyId(value: String): Self = StObject.set(x, "agencyId", value.asInstanceOf[js.Any])
    
    inline def setAgencyIdUndefined: Self = StObject.set(x, "agencyId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setEndDate(value: Double): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setEngineAccountId(value: String): Self = StObject.set(x, "engineAccountId", value.asInstanceOf[js.Any])
    
    inline def setEngineAccountIdUndefined: Self = StObject.set(x, "engineAccountId", js.undefined)
    
    inline def setRequestBody(value: SchemaConversionList): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    inline def setStartDate(value: Double): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
    
    inline def setStartRowUndefined: Self = StObject.set(x, "startRow", js.undefined)
  }
}
