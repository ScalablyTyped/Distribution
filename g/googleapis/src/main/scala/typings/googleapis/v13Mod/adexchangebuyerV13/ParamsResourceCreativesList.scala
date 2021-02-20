package typings.googleapis.v13Mod.adexchangebuyerV13

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceCreativesList extends StandardParameters {
  
  /**
    * When specified, only creatives for the given account ids are returned.
    */
  var accountId: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * When specified, only creatives for the given buyer creative ids are
    * returned.
    */
  var buyerCreativeId: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Maximum number of entries returned on one result page. If not set, the
    * default is 100. Optional.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * A continuation token, used to page through ad clients. To retrieve the
    * next page, set this parameter to the value of "nextPageToken" from the
    * previous response. Optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * When specified, only creatives having the given status are returned.
    */
  var statusFilter: js.UndefOr[String] = js.native
}
object ParamsResourceCreativesList {
  
  @scala.inline
  def apply(): ParamsResourceCreativesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCreativesList]
  }
  
  @scala.inline
  implicit class ParamsResourceCreativesListMutableBuilder[Self <: ParamsResourceCreativesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: js.Array[Double]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAccountIdVarargs(value: Double*): Self = StObject.set(x, "accountId", js.Array(value :_*))
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBuyerCreativeId(value: js.Array[String]): Self = StObject.set(x, "buyerCreativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyerCreativeIdUndefined: Self = StObject.set(x, "buyerCreativeId", js.undefined)
    
    @scala.inline
    def setBuyerCreativeIdVarargs(value: String*): Self = StObject.set(x, "buyerCreativeId", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setStatusFilter(value: String): Self = StObject.set(x, "statusFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusFilterUndefined: Self = StObject.set(x, "statusFilter", js.undefined)
  }
}
