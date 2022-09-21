package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaBatchUpdateLabelPermissionsResponse extends StObject {
  
  /**
    * Required. Permissions updated.
    */
  var permissions: js.UndefOr[js.Array[SchemaGoogleAppsDriveLabelsV2betaLabelPermission]] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaBatchUpdateLabelPermissionsResponse {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaBatchUpdateLabelPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaBatchUpdateLabelPermissionsResponse]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaBatchUpdateLabelPermissionsResponse](x: Self) {
    
    inline def setPermissions(value: js.Array[SchemaGoogleAppsDriveLabelsV2betaLabelPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: SchemaGoogleAppsDriveLabelsV2betaLabelPermission*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}
