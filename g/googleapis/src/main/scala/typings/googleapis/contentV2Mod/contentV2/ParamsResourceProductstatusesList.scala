package typings.googleapis.contentV2Mod.contentV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProductstatusesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * If set, only issues for the specified destinations are returned,
    * otherwise only issues for the Shopping destination.
    */
  var destinations: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Flag to include full product data in the results of the list request. The
    * default value is false.
    */
  var includeAttributes: js.UndefOr[Boolean] = js.native
  
  /**
    * Flag to include the invalid inserted items in the result of the list
    * request. By default the invalid items are not shown (the default value is
    * false).
    */
  var includeInvalidInsertedItems: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of product statuses to return in the response, used
    * for paging.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * The ID of the account that contains the products. This account cannot be
    * a multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.native
  
  /**
    * The token returned by the previous request.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceProductstatusesList {
  
  @scala.inline
  def apply(): ParamsResourceProductstatusesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProductstatusesList]
  }
  
  @scala.inline
  implicit class ParamsResourceProductstatusesListMutableBuilder[Self <: ParamsResourceProductstatusesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDestinations(value: js.Array[String]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
    
    @scala.inline
    def setDestinationsVarargs(value: String*): Self = StObject.set(x, "destinations", js.Array(value :_*))
    
    @scala.inline
    def setIncludeAttributes(value: Boolean): Self = StObject.set(x, "includeAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAttributesUndefined: Self = StObject.set(x, "includeAttributes", js.undefined)
    
    @scala.inline
    def setIncludeInvalidInsertedItems(value: Boolean): Self = StObject.set(x, "includeInvalidInsertedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeInvalidInsertedItemsUndefined: Self = StObject.set(x, "includeInvalidInsertedItems", js.undefined)
    
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
