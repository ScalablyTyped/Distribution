package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceChangesGetstartpagetoken
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Whether the requesting application supports Team Drives.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the Team Drive for which the starting pageToken for listing
    * future changes from that Team Drive will be returned.
    */
  var teamDriveId: js.UndefOr[String] = js.undefined
}
object ParamsResourceChangesGetstartpagetoken {
  
  @scala.inline
  def apply(): ParamsResourceChangesGetstartpagetoken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChangesGetstartpagetoken]
  }
  
  @scala.inline
  implicit class ParamsResourceChangesGetstartpagetokenMutableBuilder[Self <: ParamsResourceChangesGetstartpagetoken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
    
    @scala.inline
    def setTeamDriveId(value: String): Self = StObject.set(x, "teamDriveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDriveIdUndefined: Self = StObject.set(x, "teamDriveId", js.undefined)
  }
}
