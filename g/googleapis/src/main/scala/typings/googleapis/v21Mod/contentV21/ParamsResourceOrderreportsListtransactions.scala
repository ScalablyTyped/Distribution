package typings.googleapis.v21Mod.contentV21

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrderreportsListtransactions
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The Google-provided ID of the disbursement (found in Wallet).
    */
  var disbursementId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of disbursements to return in the response, used for
    * paging.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID of the account that manages the order. This cannot be a
    * multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * The token returned by the previous request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The last date in which transaction occurred. In ISO 8601 format. Default:
    * current date.
    */
  var transactionEndDate: js.UndefOr[String] = js.undefined
  
  /**
    * The first date in which transaction occurred. In ISO 8601 format.
    */
  var transactionStartDate: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrderreportsListtransactions {
  
  @scala.inline
  def apply(): ParamsResourceOrderreportsListtransactions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrderreportsListtransactions]
  }
  
  @scala.inline
  implicit class ParamsResourceOrderreportsListtransactionsMutableBuilder[Self <: ParamsResourceOrderreportsListtransactions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDisbursementId(value: String): Self = StObject.set(x, "disbursementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisbursementIdUndefined: Self = StObject.set(x, "disbursementId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setTransactionEndDate(value: String): Self = StObject.set(x, "transactionEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionEndDateUndefined: Self = StObject.set(x, "transactionEndDate", js.undefined)
    
    @scala.inline
    def setTransactionStartDate(value: String): Self = StObject.set(x, "transactionStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionStartDateUndefined: Self = StObject.set(x, "transactionStartDate", js.undefined)
  }
}
