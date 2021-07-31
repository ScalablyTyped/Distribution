package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFilesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Whether the user is acknowledging the risk of downloading known malware
    * or other abusive files.
    */
  var acknowledgeAbuse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ID for the file in question.
    */
  var fileId: js.UndefOr[String] = js.undefined
  
  /**
    * This parameter is deprecated and has no function.
    */
  var projection: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the Revision ID that should be downloaded. Ignored unless
    * alt=media is specified.
    */
  var revisionId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the requesting application supports Team Drives.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Deprecated: Use files.update with modifiedDateBehavior=noChange,
    * updateViewedDate=true and an empty request body.
    */
  var updateViewedDate: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceFilesGet {
  
  @scala.inline
  def apply(): ParamsResourceFilesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFilesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceFilesGetMutableBuilder[Self <: ParamsResourceFilesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcknowledgeAbuse(value: Boolean): Self = StObject.set(x, "acknowledgeAbuse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcknowledgeAbuseUndefined: Self = StObject.set(x, "acknowledgeAbuse", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    @scala.inline
    def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
    
    @scala.inline
    def setUpdateViewedDate(value: Boolean): Self = StObject.set(x, "updateViewedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateViewedDateUndefined: Self = StObject.set(x, "updateViewedDate", js.undefined)
  }
}
