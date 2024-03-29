package typings.googleapis.resellerV1Mod.resellerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSubscriptionsList
  extends StObject
     with StandardParameters {
  
  /**
    * The `customerAuthToken` query string is required when creating a resold account that transfers a direct customer's subscription or transfers another reseller customer's subscription to your reseller management. This is a hexadecimal authentication token needed to complete the subscription transfer. For more information, see the administrator help center.
    */
  var customerAuthToken: js.UndefOr[String] = js.undefined
  
  /**
    * This can be either the customer's primary domain name or the customer's unique identifier. If the domain name for a customer changes, the old domain name cannot be used to access the customer, but the customer's unique identifier (as returned by the API) can always be used. We recommend storing the unique identifier in your systems where applicable.
    */
  var customerId: js.UndefOr[String] = js.undefined
  
  /**
    * When retrieving all of your subscriptions and filtering for specific customers, you can enter a prefix for a customer name. Using an example customer group that includes `exam.com`, `example20.com` and `example.com`: - `exa` -- Returns all customer names that start with 'exa' which could include `exam.com`, `example20.com`, and `example.com`. A name prefix is similar to using a regular expression's asterisk, exa*. - `example` -- Returns `example20.com` and `example.com`.
    */
  var customerNamePrefix: js.UndefOr[String] = js.undefined
  
  /**
    * When retrieving a large list, the `maxResults` is the maximum number of results per page. The `nextPageToken` value takes you to the next page. The default is 20.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Token to specify next page in the list
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceSubscriptionsList {
  
  inline def apply(): ParamsResourceSubscriptionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSubscriptionsList]
  }
  
  extension [Self <: ParamsResourceSubscriptionsList](x: Self) {
    
    inline def setCustomerAuthToken(value: String): Self = StObject.set(x, "customerAuthToken", value.asInstanceOf[js.Any])
    
    inline def setCustomerAuthTokenUndefined: Self = StObject.set(x, "customerAuthToken", js.undefined)
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setCustomerNamePrefix(value: String): Self = StObject.set(x, "customerNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setCustomerNamePrefixUndefined: Self = StObject.set(x, "customerNamePrefix", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
