package typings.googleapis.resellerV1Mod.resellerV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceSubscriptionsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The customerAuthToken query string is required when creating a resold
    * account that transfers a direct customer's subscription or transfers
    * another reseller customer's subscription to your reseller management.
    * This is a hexadecimal authentication token needed to complete the
    * subscription transfer. For more information, see the administrator help
    * center.
    */
  var customerAuthToken: js.UndefOr[String] = js.native
  
  /**
    * Either the customer's primary domain name or the customer's unique
    * identifier. If using the domain name, we do not recommend using a
    * customerId as a key for persistent data. If the domain name for a
    * customerId is changed, the Google system automatically updates.
    */
  var customerId: js.UndefOr[String] = js.native
  
  /**
    * When retrieving all of your subscriptions and filtering for specific
    * customers, you can enter a prefix for a customer name. Using an example
    * customer group that includes exam.com, example20.com and example.com:   -
    * exa -- Returns all customer names that start with 'exa' which could
    * include exam.com, example20.com, and example.com. A name prefix is
    * similar to using a regular expression's asterisk, exa*.  - example --
    * Returns example20.com and example.com.
    */
  var customerNamePrefix: js.UndefOr[String] = js.native
  
  /**
    * When retrieving a large list, the maxResults is the maximum number of
    * results per page. The nextPageToken value takes you to the next page. The
    * default is 20.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * Token to specify next page in the list
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceSubscriptionsList {
  
  @scala.inline
  def apply(): ParamsResourceSubscriptionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSubscriptionsList]
  }
  
  @scala.inline
  implicit class ParamsResourceSubscriptionsListOps[Self <: ParamsResourceSubscriptionsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setCustomerAuthToken(value: String): Self = this.set("customerAuthToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerAuthToken: Self = this.set("customerAuthToken", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    
    @scala.inline
    def setCustomerNamePrefix(value: String): Self = this.set("customerNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerNamePrefix: Self = this.set("customerNamePrefix", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
}
