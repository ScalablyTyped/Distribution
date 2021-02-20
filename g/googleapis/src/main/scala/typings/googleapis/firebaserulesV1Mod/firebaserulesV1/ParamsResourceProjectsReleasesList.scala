package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsReleasesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * `Release` filter. The list method supports filters with restrictions on
    * the `Release.name`, `Release.ruleset_name`, and
    * `Release.test_suite_name`.  Example 1: A filter of 'name=prod*' might
    * return `Release`s with names within 'projects/foo' prefixed with 'prod':
    * Name                          | Ruleset Name
    * ------------------------------|------------- projects/foo/releases/prod
    * | projects/foo/rulesets/uuid1234 projects/foo/releases/prod/v1 |
    * projects/foo/rulesets/uuid1234 projects/foo/releases/prod/v2 |
    * projects/foo/rulesets/uuid8888  Example 2: A filter of `name=prod*
    * ruleset_name=uuid1234` would return only `Release` instances for
    * 'projects/foo' with names prefixed with 'prod' referring to the same
    * `Ruleset` name of 'uuid1234':  Name                          | Ruleset
    * Name ------------------------------|-------------
    * projects/foo/releases/prod    | projects/foo/rulesets/1234
    * projects/foo/releases/prod/v1 | projects/foo/rulesets/1234  In the
    * examples, the filter parameters refer to the search filters are relative
    * to the project. Fully qualified prefixed may also be used. e.g.
    * `test_suite_name=projects/foo/testsuites/uuid1`
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Resource name for the project.  Format: `projects/{project_id}`
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Page size to load. Maximum of 100. Defaults to 10. Note: `page_size` is
    * just a hint and the service may choose to load fewer than `page_size`
    * results due to the size of the output. To traverse all of the releases,
    * the caller should iterate until the `page_token` on the response is
    * empty.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Next page token for the next batch of `Release` instances.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsReleasesList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsReleasesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsReleasesList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsReleasesListMutableBuilder[Self <: ParamsResourceProjectsReleasesList] (val x: Self) extends AnyVal {
    
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
