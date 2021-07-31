package typings.googleapis.reportsV1Mod.adminReportsV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEntityusagereportsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Represents the customer for which the data is to be fetched.
    */
  var customerId: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the date in yyyy-mm-dd format for which the data is to be
    * fetched.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the key of object for which the data should be filtered.
    */
  var entityKey: js.UndefOr[String] = js.undefined
  
  /**
    * Type of object. Should be one of - gplus_communities.
    */
  var entityType: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the set of filters including parameter operator value.
    */
  var filters: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of results to return. Maximum allowed is 1000
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Token to specify next page.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the application name, parameter name pairs to fetch in csv as
    * app_name1:param_name1, app_name2:param_name2.
    */
  var parameters: js.UndefOr[String] = js.undefined
}
object ParamsResourceEntityusagereportsGet {
  
  @scala.inline
  def apply(): ParamsResourceEntityusagereportsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEntityusagereportsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceEntityusagereportsGetMutableBuilder[Self <: ParamsResourceEntityusagereportsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setEntityKey(value: String): Self = StObject.set(x, "entityKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityKeyUndefined: Self = StObject.set(x, "entityKey", js.undefined)
    
    @scala.inline
    def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
    
    @scala.inline
    def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParameters(value: String): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
