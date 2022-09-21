package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRepricingrulesRepricingreportsList
  extends StObject
     with StandardParameters {
  
  /**
    * Gets Repricing reports on and before this date in the merchant's timezone. You can only retrieve data up to 7 days ago (default) or earlier. Format: YYYY-MM-DD.
    */
  var endDate: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Id of the merchant who owns the Repricing rule.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of daily reports to return. Each report includes data from a single 24-hour period. The page size defaults to 50 and values above 1000 are coerced to 1000. This service may return fewer days than this value, for example, if the time between your start and end date is less than page size.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Token (if provided) to retrieve the subsequent page. All other parameters must match the original call that provided the page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Id of the Repricing rule.
    */
  var ruleId: js.UndefOr[String] = js.undefined
  
  /**
    * Gets Repricing reports on and after this date in the merchant's timezone, up to one year ago. Do not use a start date later than 7 days ago (default). Format: YYYY-MM-DD.
    */
  var startDate: js.UndefOr[String] = js.undefined
}
object ParamsResourceRepricingrulesRepricingreportsList {
  
  inline def apply(): ParamsResourceRepricingrulesRepricingreportsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRepricingrulesRepricingreportsList]
  }
  
  extension [Self <: ParamsResourceRepricingrulesRepricingreportsList](x: Self) {
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setRuleIdUndefined: Self = StObject.set(x, "ruleId", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
