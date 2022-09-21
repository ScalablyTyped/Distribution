package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePermissionsInsert
  extends StObject
     with StandardParameters {
  
  /**
    * A plain text custom message to include in notification emails.
    */
  var emailMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. See moveToNewOwnersRoot for details.
    */
  var enforceSingleParent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID for the file or shared drive.
    */
  var fileId: js.UndefOr[String] = js.undefined
  
  /**
    * This parameter will only take effect if the item is not in a shared drive and the request is attempting to transfer the ownership of the item. If set to true, the item will be moved to the new owner's My Drive root folder and all prior parents removed. If set to false, parents are not changed.
    */
  var moveToNewOwnersRoot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPermission] = js.undefined
  
  /**
    * Whether to send notification emails when sharing to users or groups. This parameter is ignored and an email is sent if the role is owner.
    */
  var sendNotificationEmails: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the requesting application supports both My Drives and shared drives.
    */
  var supportsAllDrives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Deprecated use supportsAllDrives instead.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Issue the request as a domain administrator; if set to true, then the requester will be granted access if the file ID parameter refers to a shared drive and the requester is an administrator of the domain to which the shared drive belongs.
    */
  var useDomainAdminAccess: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourcePermissionsInsert {
  
  inline def apply(): ParamsResourcePermissionsInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePermissionsInsert]
  }
  
  extension [Self <: ParamsResourcePermissionsInsert](x: Self) {
    
    inline def setEmailMessage(value: String): Self = StObject.set(x, "emailMessage", value.asInstanceOf[js.Any])
    
    inline def setEmailMessageUndefined: Self = StObject.set(x, "emailMessage", js.undefined)
    
    inline def setEnforceSingleParent(value: Boolean): Self = StObject.set(x, "enforceSingleParent", value.asInstanceOf[js.Any])
    
    inline def setEnforceSingleParentUndefined: Self = StObject.set(x, "enforceSingleParent", js.undefined)
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    inline def setMoveToNewOwnersRoot(value: Boolean): Self = StObject.set(x, "moveToNewOwnersRoot", value.asInstanceOf[js.Any])
    
    inline def setMoveToNewOwnersRootUndefined: Self = StObject.set(x, "moveToNewOwnersRoot", js.undefined)
    
    inline def setRequestBody(value: SchemaPermission): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSendNotificationEmails(value: Boolean): Self = StObject.set(x, "sendNotificationEmails", value.asInstanceOf[js.Any])
    
    inline def setSendNotificationEmailsUndefined: Self = StObject.set(x, "sendNotificationEmails", js.undefined)
    
    inline def setSupportsAllDrives(value: Boolean): Self = StObject.set(x, "supportsAllDrives", value.asInstanceOf[js.Any])
    
    inline def setSupportsAllDrivesUndefined: Self = StObject.set(x, "supportsAllDrives", js.undefined)
    
    inline def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    inline def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
    
    inline def setUseDomainAdminAccess(value: Boolean): Self = StObject.set(x, "useDomainAdminAccess", value.asInstanceOf[js.Any])
    
    inline def setUseDomainAdminAccessUndefined: Self = StObject.set(x, "useDomainAdminAccess", js.undefined)
  }
}
