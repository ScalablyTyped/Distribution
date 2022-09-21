package typings.googleapis.v1beta1Mod.accessapprovalV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersUpdateaccessapprovalsettings
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the settings. Format is one of: <ol>   <li>"projects/{project_id}/accessApprovalSettings"</li>   <li>"folders/{folder_id}/accessApprovalSettings"</li>   <li>"organizations/{organization_id}/accessApprovalSettings"</li> <ol>
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAccessApprovalSettings] = js.undefined
  
  /**
    * For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask If this field is left unset, only the notification_emails field will be updated.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceFoldersUpdateaccessapprovalsettings {
  
  inline def apply(): ParamsResourceFoldersUpdateaccessapprovalsettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersUpdateaccessapprovalsettings]
  }
  
  extension [Self <: ParamsResourceFoldersUpdateaccessapprovalsettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaAccessApprovalSettings): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
