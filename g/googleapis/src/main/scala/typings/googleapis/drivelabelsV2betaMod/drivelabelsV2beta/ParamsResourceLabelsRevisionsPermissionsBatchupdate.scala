package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLabelsRevisionsPermissionsBatchupdate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent Label resource name shared by all permissions being updated. Format: labels/{label\} If this is set, the parent field in the UpdateLabelPermissionRequest messages must either be empty or match this field.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaBatchUpdateLabelPermissionsRequest] = js.undefined
}
object ParamsResourceLabelsRevisionsPermissionsBatchupdate {
  
  inline def apply(): ParamsResourceLabelsRevisionsPermissionsBatchupdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLabelsRevisionsPermissionsBatchupdate]
  }
  
  extension [Self <: ParamsResourceLabelsRevisionsPermissionsBatchupdate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleAppsDriveLabelsV2betaBatchUpdateLabelPermissionsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
