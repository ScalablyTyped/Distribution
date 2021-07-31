package typings.googleapis.v21Mod.contentV21

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrderreturnsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Obtains order returns created before this date (inclusively), in ISO 8601
    * format.
    */
  var createdEndDate: js.UndefOr[String] = js.undefined
  
  /**
    * Obtains order returns created after this date (inclusively), in ISO 8601
    * format.
    */
  var createdStartDate: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of order returns to return in the response, used for
    * paging. The default value is 25 returns per page, and the maximum allowed
    * value is 250 returns per page.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID of the account that manages the order. This cannot be a
    * multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Return the results in the specified order.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * The token returned by the previous request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrderreturnsList {
  
  @scala.inline
  def apply(): ParamsResourceOrderreturnsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrderreturnsList]
  }
  
  @scala.inline
  implicit class ParamsResourceOrderreturnsListMutableBuilder[Self <: ParamsResourceOrderreturnsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCreatedEndDate(value: String): Self = StObject.set(x, "createdEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedEndDateUndefined: Self = StObject.set(x, "createdEndDate", js.undefined)
    
    @scala.inline
    def setCreatedStartDate(value: String): Self = StObject.set(x, "createdStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedStartDateUndefined: Self = StObject.set(x, "createdStartDate", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
