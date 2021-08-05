package typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBillingAccountsResponse extends StObject {
  
  /** A list of billing accounts. */
  var billingAccounts: js.UndefOr[js.Array[BillingAccount]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. To retrieve the next page, call `ListBillingAccounts` again with the `page_token` field set to this value. This field is empty if there
    * are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListBillingAccountsResponse {
  
  inline def apply(): ListBillingAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBillingAccountsResponse]
  }
  
  extension [Self <: ListBillingAccountsResponse](x: Self) {
    
    inline def setBillingAccounts(value: js.Array[BillingAccount]): Self = StObject.set(x, "billingAccounts", value.asInstanceOf[js.Any])
    
    inline def setBillingAccountsUndefined: Self = StObject.set(x, "billingAccounts", js.undefined)
    
    inline def setBillingAccountsVarargs(value: BillingAccount*): Self = StObject.set(x, "billingAccounts", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
