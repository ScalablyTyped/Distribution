package typings.googleapis.v21Mod.contentV21

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrderreportsListdisbursements
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The last date which disbursements occurred. In ISO 8601 format. Default:
    * current date.
    */
  var disbursementEndDate: js.UndefOr[String] = js.undefined
  
  /**
    * The first date which disbursements occurred. In ISO 8601 format.
    */
  var disbursementStartDate: js.UndefOr[String] = js.undefined
  
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
}
object ParamsResourceOrderreportsListdisbursements {
  
  @scala.inline
  def apply(): ParamsResourceOrderreportsListdisbursements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrderreportsListdisbursements]
  }
  
  @scala.inline
  implicit class ParamsResourceOrderreportsListdisbursementsMutableBuilder[Self <: ParamsResourceOrderreportsListdisbursements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDisbursementEndDate(value: String): Self = StObject.set(x, "disbursementEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisbursementEndDateUndefined: Self = StObject.set(x, "disbursementEndDate", js.undefined)
    
    @scala.inline
    def setDisbursementStartDate(value: String): Self = StObject.set(x, "disbursementStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisbursementStartDateUndefined: Self = StObject.set(x, "disbursementStartDate", js.undefined)
    
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
  }
}
