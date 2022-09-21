package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSettlementreportsList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of settlements to return in the response, used for paging. The default value is 200 returns per page, and the maximum allowed value is 5000 returns per page.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The Merchant Center account to list settlements for.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * The token returned by the previous request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Obtains settlements which have transactions before this date (inclusively), in ISO 8601 format.
    */
  var transferEndDate: js.UndefOr[String] = js.undefined
  
  /**
    * Obtains settlements which have transactions after this date (inclusively), in ISO 8601 format.
    */
  var transferStartDate: js.UndefOr[String] = js.undefined
}
object ParamsResourceSettlementreportsList {
  
  inline def apply(): ParamsResourceSettlementreportsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSettlementreportsList]
  }
  
  extension [Self <: ParamsResourceSettlementreportsList](x: Self) {
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setTransferEndDate(value: String): Self = StObject.set(x, "transferEndDate", value.asInstanceOf[js.Any])
    
    inline def setTransferEndDateUndefined: Self = StObject.set(x, "transferEndDate", js.undefined)
    
    inline def setTransferStartDate(value: String): Self = StObject.set(x, "transferStartDate", value.asInstanceOf[js.Any])
    
    inline def setTransferStartDateUndefined: Self = StObject.set(x, "transferStartDate", js.undefined)
  }
}
