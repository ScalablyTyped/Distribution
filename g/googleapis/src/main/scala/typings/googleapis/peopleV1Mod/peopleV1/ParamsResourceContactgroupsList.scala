package typings.googleapis.peopleV1Mod.peopleV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceContactgroupsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The maximum number of resources to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The next_page_token value returned from a previous call to
    * [ListContactGroups](/people/api/rest/v1/contactgroups/list). Requests the
    * next page of resources.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * A sync token, returned by a previous call to `contactgroups.list`. Only
    * resources changed since the sync token was created will be returned.
    */
  var syncToken: js.UndefOr[String] = js.native
}
object ParamsResourceContactgroupsList {
  
  @scala.inline
  def apply(): ParamsResourceContactgroupsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceContactgroupsList]
  }
  
  @scala.inline
  implicit class ParamsResourceContactgroupsListMutableBuilder[Self <: ParamsResourceContactgroupsList] (val x: Self) extends AnyVal {
    
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
    def setSyncToken(value: String): Self = StObject.set(x, "syncToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncTokenUndefined: Self = StObject.set(x, "syncToken", js.undefined)
  }
}
