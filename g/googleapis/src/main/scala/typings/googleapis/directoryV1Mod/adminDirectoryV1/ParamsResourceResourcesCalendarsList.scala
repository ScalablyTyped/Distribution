package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceResourcesCalendarsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The unique ID for the customer's G Suite account. As an account
    * administrator, you can also use the my_customer alias to represent your
    * account's customer ID.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Field(s) to sort results by in either ascending or descending order.
    * Supported fields include resourceId, resourceName, capacity, buildingId,
    * and floorName. If no order is specified, defaults to ascending. Should be
    * of the form "field [asc|desc], field [asc|desc], ...". For example
    * buildingId, capacity desc would return results sorted first by buildingId
    * in ascending order then by capacity in descending order.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * Token to specify the next page in the list.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * String query used to filter results. Should be of the form "field
    * operator value" where field can be any of supported fields and operators
    * can be any of supported operations. Operators include '=' for exact match
    * and ':' for prefix match or HAS match where applicable. For prefix match,
    * the value should always be followed by a *. Supported fields include
    * generatedResourceName, name, buildingId, featureInstances.feature.name.
    * For example buildingId=US-NYC-9TH AND
    * featureInstances.feature.name:Phone.
    */
  var query: js.UndefOr[String] = js.undefined
}
object ParamsResourceResourcesCalendarsList {
  
  inline def apply(): ParamsResourceResourcesCalendarsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceResourcesCalendarsList]
  }
  
  extension [Self <: ParamsResourceResourcesCalendarsList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
