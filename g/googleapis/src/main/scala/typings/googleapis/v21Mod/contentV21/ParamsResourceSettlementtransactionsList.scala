package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSettlementtransactionsList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of transactions to return in the response, used for paging. The default value is 200 transactions per page, and the maximum allowed value is 5000 transactions per page.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The Merchant Center account to list transactions for.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * The token returned by the previous request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Google-provided ID of the settlement.
    */
  var settlementId: js.UndefOr[String] = js.undefined
  
  /**
    * The list of transactions to return. If not set, all transactions will be returned.
    */
  var transactionIds: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceSettlementtransactionsList {
  
  inline def apply(): ParamsResourceSettlementtransactionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSettlementtransactionsList]
  }
  
  extension [Self <: ParamsResourceSettlementtransactionsList](x: Self) {
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setSettlementId(value: String): Self = StObject.set(x, "settlementId", value.asInstanceOf[js.Any])
    
    inline def setSettlementIdUndefined: Self = StObject.set(x, "settlementId", js.undefined)
    
    inline def setTransactionIds(value: js.Array[String]): Self = StObject.set(x, "transactionIds", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdsUndefined: Self = StObject.set(x, "transactionIds", js.undefined)
    
    inline def setTransactionIdsVarargs(value: String*): Self = StObject.set(x, "transactionIds", js.Array(value*))
  }
}
