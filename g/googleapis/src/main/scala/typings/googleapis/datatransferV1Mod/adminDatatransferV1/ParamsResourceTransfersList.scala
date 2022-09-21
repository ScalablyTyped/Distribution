package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTransfersList
  extends StObject
     with StandardParameters {
  
  /**
    * Immutable ID of the Google Workspace account.
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
  
  inline def apply(): ParamsResourceTransfersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTransfersList]
  }
  
  extension [Self <: ParamsResourceTransfersList](x: Self) {
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNewOwnerUserId(value: String): Self = StObject.set(x, "newOwnerUserId", value.asInstanceOf[js.Any])
    
    inline def setNewOwnerUserIdUndefined: Self = StObject.set(x, "newOwnerUserId", js.undefined)
    
    inline def setOldOwnerUserId(value: String): Self = StObject.set(x, "oldOwnerUserId", value.asInstanceOf[js.Any])
    
    inline def setOldOwnerUserIdUndefined: Self = StObject.set(x, "oldOwnerUserId", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
