package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Comma-separated list of schema names. All fields from these schemas are
    * fetched. This should only be set when projection=custom.
    */
  var customFieldMask: js.UndefOr[String] = js.undefined
  
  /**
    * Immutable ID of the G Suite account. In case of multi-domain, to fetch
    * all users for a customer, fill this field instead of domain.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the domain. Fill this field to get users from only this domain.
    * To return all users in a multi-domain fill customer field instead.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * Event on which subscription is intended (if subscribing)
    */
  var event: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of results to return. Default is 100. Max allowed is 500
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Column to use for sorting results
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * Token to specify next page in the list
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * What subset of fields to fetch for this user.
    */
  var projection: js.UndefOr[String] = js.undefined
  
  /**
    * Query string search. Should be of the form "". Complete documentation is
    * at
    * https://developers.google.com/admin-sdk/directory/v1/guides/search-users
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * If set to true retrieves the list of deleted users. Default is false
    */
  var showDeleted: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to return results in ascending or descending order.
    */
  var sortOrder: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to fetch the ADMIN_VIEW or DOMAIN_PUBLIC view of the user.
    */
  var viewType: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersList {
  
  inline def apply(): ParamsResourceUsersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersList]
  }
  
  extension [Self <: ParamsResourceUsersList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCustomFieldMask(value: String): Self = StObject.set(x, "customFieldMask", value.asInstanceOf[js.Any])
    
    inline def setCustomFieldMaskUndefined: Self = StObject.set(x, "customFieldMask", js.undefined)
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setShowDeleted(value: String): Self = StObject.set(x, "showDeleted", value.asInstanceOf[js.Any])
    
    inline def setShowDeletedUndefined: Self = StObject.set(x, "showDeleted", js.undefined)
    
    inline def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setViewType(value: String): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
    
    inline def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
  }
}
