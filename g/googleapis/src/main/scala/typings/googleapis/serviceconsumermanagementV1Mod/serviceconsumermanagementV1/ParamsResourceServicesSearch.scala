package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceServicesSearch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The maximum number of results returned by this request. Currently, the
    * default maximum is set to 1000. If `page_size` isn't provided or the size
    * provided is a number larger than 1000, it's automatically set to 1000.
    * Optional.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The continuation token, which is used to page through large result sets.
    * To get the next page of results, set this parameter to the value of
    * `nextPageToken` from the previous response.  Optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Service for which search is performed. services/{service} {service} the
    * name of a service, for example 'service.googleapis.com'.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * Set a query `{expression}` for querying tenancy units. Your
    * `{expression}` must be in the format: `field_name=literal_string`. The
    * `field_name` is the name of the field you want to compare. Supported
    * fields are `tenant_resources.tag` and `tenant_resources.resource`.  For
    * example, to search tenancy units that contain at least one tenant
    * resource with a given tag 'xyz', use the query
    * `tenant_resources.tag=xyz`. To search tenancy units that contain at least
    * one tenant resource with a given resource name 'projects/123456', use the
    * query `tenant_resources.resource=projects/123456`.  Multiple expressions
    * can be joined with `AND`s. Tenancy units must match all expressions to be
    * included in the result set. For example, `tenant_resources.tag=xyz AND
    * tenant_resources.resource=projects/123456`  Optional.
    */
  var query: js.UndefOr[String] = js.native
}
object ParamsResourceServicesSearch {
  
  @scala.inline
  def apply(): ParamsResourceServicesSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesSearch]
  }
  
  @scala.inline
  implicit class ParamsResourceServicesSearchMutableBuilder[Self <: ParamsResourceServicesSearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
