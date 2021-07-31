package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTransfersList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Immutable ID of the Google Apps account.
    */
  var customerId: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of results to return. Default is 100.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Destination user's profile ID.
    */
  var newOwnerUserId: js.UndefOr[String] = js.undefined
  
  /**
    * Source user's profile ID.
    */
  var oldOwnerUserId: js.UndefOr[String] = js.undefined
  
  /**
    * Token to specify the next page in the list.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Status of the transfer.
    */
  var status: js.UndefOr[String] = js.undefined
}
object ParamsResourceTransfersList {
  
  @scala.inline
  def apply(): ParamsResourceTransfersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTransfersList]
  }
  
  @scala.inline
  implicit class ParamsResourceTransfersListMutableBuilder[Self <: ParamsResourceTransfersList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNewOwnerUserId(value: String): Self = StObject.set(x, "newOwnerUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewOwnerUserIdUndefined: Self = StObject.set(x, "newOwnerUserId", js.undefined)
    
    @scala.inline
    def setOldOwnerUserId(value: String): Self = StObject.set(x, "oldOwnerUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldOwnerUserIdUndefined: Self = StObject.set(x, "oldOwnerUserId", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
