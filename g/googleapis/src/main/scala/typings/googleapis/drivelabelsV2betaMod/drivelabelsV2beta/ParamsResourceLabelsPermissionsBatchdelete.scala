package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLabelsPermissionsBatchdelete
  extends StObject
     with StandardParameters {
  
  /**
    *
    */
  var labelsId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaBatchDeleteLabelPermissionsRequest] = js.undefined
}
object ParamsResourceLabelsPermissionsBatchdelete {
  
  inline def apply(): ParamsResourceLabelsPermissionsBatchdelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLabelsPermissionsBatchdelete]
  }
  
  extension [Self <: ParamsResourceLabelsPermissionsBatchdelete](x: Self) {
    
    inline def setLabelsId(value: String): Self = StObject.set(x, "labelsId", value.asInstanceOf[js.Any])
    
    inline def setLabelsIdUndefined: Self = StObject.set(x, "labelsId", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleAppsDriveLabelsV2betaBatchDeleteLabelPermissionsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
