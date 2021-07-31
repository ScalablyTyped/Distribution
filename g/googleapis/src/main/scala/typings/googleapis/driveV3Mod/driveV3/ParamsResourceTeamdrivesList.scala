package typings.googleapis.driveV3Mod.driveV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTeamdrivesList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Maximum number of Team Drives to return.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Page token for Team Drives.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Query string for searching Team Drives.
    */
  var q: js.UndefOr[String] = js.undefined
  
  /**
    * Issue the request as a domain administrator; if set to true, then all
    * Team Drives of the domain in which the requester is an administrator are
    * returned.
    */
  var useDomainAdminAccess: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceTeamdrivesList {
  
  @scala.inline
  def apply(): ParamsResourceTeamdrivesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTeamdrivesList]
  }
  
  @scala.inline
  implicit class ParamsResourceTeamdrivesListMutableBuilder[Self <: ParamsResourceTeamdrivesList] (val x: Self) extends AnyVal {
    
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
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    @scala.inline
    def setUseDomainAdminAccess(value: Boolean): Self = StObject.set(x, "useDomainAdminAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDomainAdminAccessUndefined: Self = StObject.set(x, "useDomainAdminAccess", js.undefined)
  }
}
