package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaBatchDeleteLabelPermissionsRequest extends StObject {
  
  /**
    * Required. The request message specifying the resources to update.
    */
  var requests: js.UndefOr[js.Array[SchemaGoogleAppsDriveLabelsV2betaDeleteLabelPermissionRequest]] = js.undefined
  
  /**
    * Set to `true` in order to use the user's admin credentials. The server will verify the user is an admin for the Label before allowing access. If this is set, the use_admin_access field in the DeleteLabelPermissionRequest messages must either be empty or match this field.
    */
  var useAdminAccess: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaBatchDeleteLabelPermissionsRequest {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaBatchDeleteLabelPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaBatchDeleteLabelPermissionsRequest]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaBatchDeleteLabelPermissionsRequest](x: Self) {
    
    inline def setRequests(value: js.Array[SchemaGoogleAppsDriveLabelsV2betaDeleteLabelPermissionRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaGoogleAppsDriveLabelsV2betaDeleteLabelPermissionRequest*): Self = StObject.set(x, "requests", js.Array(value*))
    
    inline def setUseAdminAccess(value: Boolean): Self = StObject.set(x, "useAdminAccess", value.asInstanceOf[js.Any])
    
    inline def setUseAdminAccessNull: Self = StObject.set(x, "useAdminAccess", null)
    
    inline def setUseAdminAccessUndefined: Self = StObject.set(x, "useAdminAccess", js.undefined)
  }
}
