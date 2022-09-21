package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaListLabelPermissionsResponse extends StObject {
  
  /**
    * Label permissions.
    */
  var labelPermissions: js.UndefOr[js.Array[SchemaGoogleAppsDriveLabelsV2betaLabelPermission]] = js.undefined
  
  /**
    * The token of the next page in the response.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaListLabelPermissionsResponse {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaListLabelPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaListLabelPermissionsResponse]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaListLabelPermissionsResponse](x: Self) {
    
    inline def setLabelPermissions(value: js.Array[SchemaGoogleAppsDriveLabelsV2betaLabelPermission]): Self = StObject.set(x, "labelPermissions", value.asInstanceOf[js.Any])
    
    inline def setLabelPermissionsUndefined: Self = StObject.set(x, "labelPermissions", js.undefined)
    
    inline def setLabelPermissionsVarargs(value: SchemaGoogleAppsDriveLabelsV2betaLabelPermission*): Self = StObject.set(x, "labelPermissions", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
