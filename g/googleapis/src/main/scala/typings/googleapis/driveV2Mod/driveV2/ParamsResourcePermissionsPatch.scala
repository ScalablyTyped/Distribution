package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePermissionsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ID for the file or Team Drive.
    */
  var fileId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID for the permission.
    */
  var permissionId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to remove the expiration date.
    */
  var removeExpiration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPermission] = js.undefined
  
  /**
    * Whether the requesting application supports Team Drives.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether changing a role to 'owner' downgrades the current owners to
    * writers. Does nothing if the specified role is not 'owner'.
    */
  var transferOwnership: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Issue the request as a domain administrator; if set to true, then the
    * requester will be granted access if they are an administrator of the
    * domain to which the item belongs.
    */
  var useDomainAdminAccess: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourcePermissionsPatch {
  
  inline def apply(): ParamsResourcePermissionsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePermissionsPatch]
  }
  
  extension [Self <: ParamsResourcePermissionsPatch](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    inline def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
    
    inline def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
    
    inline def setRemoveExpiration(value: Boolean): Self = StObject.set(x, "removeExpiration", value.asInstanceOf[js.Any])
    
    inline def setRemoveExpirationUndefined: Self = StObject.set(x, "removeExpiration", js.undefined)
    
    inline def setRequestBody(value: SchemaPermission): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    inline def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
    
    inline def setTransferOwnership(value: Boolean): Self = StObject.set(x, "transferOwnership", value.asInstanceOf[js.Any])
    
    inline def setTransferOwnershipUndefined: Self = StObject.set(x, "transferOwnership", js.undefined)
    
    inline def setUseDomainAdminAccess(value: Boolean): Self = StObject.set(x, "useDomainAdminAccess", value.asInstanceOf[js.Any])
    
    inline def setUseDomainAdminAccessUndefined: Self = StObject.set(x, "useDomainAdminAccess", js.undefined)
  }
}
