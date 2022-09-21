package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaUpdateLabelPermissionRequest extends StObject {
  
  /**
    * Required. The permission to create or update on the Label.
    */
  var labelPermission: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaLabelPermission] = js.undefined
  
  /**
    * Required. The parent Label resource name.
    */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set to `true` in order to use the user's admin credentials. The server will verify the user is an admin for the Label before allowing access.
    */
  var useAdminAccess: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaUpdateLabelPermissionRequest {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaUpdateLabelPermissionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaUpdateLabelPermissionRequest]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaUpdateLabelPermissionRequest](x: Self) {
    
    inline def setLabelPermission(value: SchemaGoogleAppsDriveLabelsV2betaLabelPermission): Self = StObject.set(x, "labelPermission", value.asInstanceOf[js.Any])
    
    inline def setLabelPermissionUndefined: Self = StObject.set(x, "labelPermission", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setUseAdminAccess(value: Boolean): Self = StObject.set(x, "useAdminAccess", value.asInstanceOf[js.Any])
    
    inline def setUseAdminAccessNull: Self = StObject.set(x, "useAdminAccess", null)
    
    inline def setUseAdminAccessUndefined: Self = StObject.set(x, "useAdminAccess", js.undefined)
  }
}
