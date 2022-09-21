package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLabelsPermissionsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent Label resource name on the Label Permission is created. Format: labels/{label\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaLabelPermission] = js.undefined
  
  /**
    * Set to `true` in order to use the user's admin credentials. The server will verify the user is an admin for the Label before allowing access.
    */
  var useAdminAccess: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceLabelsPermissionsCreate {
  
  inline def apply(): ParamsResourceLabelsPermissionsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLabelsPermissionsCreate]
  }
  
  extension [Self <: ParamsResourceLabelsPermissionsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleAppsDriveLabelsV2betaLabelPermission): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUseAdminAccess(value: Boolean): Self = StObject.set(x, "useAdminAccess", value.asInstanceOf[js.Any])
    
    inline def setUseAdminAccessUndefined: Self = StObject.set(x, "useAdminAccess", js.undefined)
  }
}
