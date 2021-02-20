package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceOperationsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * A string for filtering Operations.   The following filter fields are
    * supported&#58;    * serviceName&#58; Required. Only `=` operator is
    * allowed.   * startTime&#58; The time this job was started, in ISO 8601
    * format.     Allowed operators are `>=`,  `>`, `<=`, and `<`.   *
    * status&#58; Can be `done`, `in_progress`, or `failed`. Allowed operators
    * are `=`, and `!=`.    Filter expression supports conjunction (AND) and
    * disjunction (OR)   logical operators. However, the serviceName
    * restriction must be at the   top-level and can only be combined with
    * other restrictions via the AND   logical operator.    Examples&#58;    *
    * `serviceName={some-service}.googleapis.com`   *
    * `serviceName={some-service}.googleapis.com AND startTime>="2017-02-01"`
    * * `serviceName={some-service}.googleapis.com AND status=done`   *
    * `serviceName={some-service}.googleapis.com AND (status=done OR
    * startTime>="2017-02-01")`
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Not used.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of operations to return. If unspecified, defaults
    * to 50. The maximum value is 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The standard list page token.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceOperationsList {
  
  @scala.inline
  def apply(): ParamsResourceOperationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOperationsList]
  }
  
  @scala.inline
  implicit class ParamsResourceOperationsListMutableBuilder[Self <: ParamsResourceOperationsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
