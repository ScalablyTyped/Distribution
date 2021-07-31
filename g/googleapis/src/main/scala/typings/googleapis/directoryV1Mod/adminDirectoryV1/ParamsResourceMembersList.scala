package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMembersList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Email or immutable ID of the group
    */
  var groupKey: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to list indirect memberships. Default: false.
    */
  var includeDerivedMembership: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum number of results to return. Default is 200
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Token to specify next page in the list
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Comma separated role values to filter list results on.
    */
  var roles: js.UndefOr[String] = js.undefined
}
object ParamsResourceMembersList {
  
  @scala.inline
  def apply(): ParamsResourceMembersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMembersList]
  }
  
  @scala.inline
  implicit class ParamsResourceMembersListMutableBuilder[Self <: ParamsResourceMembersList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setGroupKey(value: String): Self = StObject.set(x, "groupKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupKeyUndefined: Self = StObject.set(x, "groupKey", js.undefined)
    
    @scala.inline
    def setIncludeDerivedMembership(value: Boolean): Self = StObject.set(x, "includeDerivedMembership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDerivedMembershipUndefined: Self = StObject.set(x, "includeDerivedMembership", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setRoles(value: String): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
  }
}
