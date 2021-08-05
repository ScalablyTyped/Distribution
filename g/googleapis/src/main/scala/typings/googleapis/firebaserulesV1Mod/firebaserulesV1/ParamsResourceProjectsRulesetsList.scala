package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsRulesetsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * `Ruleset` filter. The list method supports filters with restrictions on
    * `Ruleset.name`.  Filters on `Ruleset.create_time` should use the `date`
    * function which parses strings that conform to the RFC 3339 date/time
    * specifications.  Example: `create_time > date("2017-01-01T00:00:00Z") AND
    * name=UUID-*`
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Resource name for the project.  Format: `projects/{project_id}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Page size to load. Maximum of 100. Defaults to 10. Note: `page_size` is
    * just a hint and the service may choose to load less than `page_size` due
    * to the size of the output. To traverse all of the releases, caller should
    * iterate until the `page_token` is empty.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Next page token for loading the next batch of `Ruleset` instances.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsRulesetsList {
  
  inline def apply(): ParamsResourceProjectsRulesetsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsRulesetsList]
  }
  
  extension [Self <: ParamsResourceProjectsRulesetsList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
