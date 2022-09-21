package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLabelsRevisionsPermissionsBatchdelete
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
  
  /**
    *
    */
  var revisionsId: js.UndefOr[String] = js.undefined
}
object ParamsResourceLabelsRevisionsPermissionsBatchdelete {
  
  inline def apply(): ParamsResourceLabelsRevisionsPermissionsBatchdelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLabelsRevisionsPermissionsBatchdelete]
  }
  
  extension [Self <: ParamsResourceLabelsRevisionsPermissionsBatchdelete](x: Self) {
    
    inline def setLabelsId(value: String): Self = StObject.set(x, "labelsId", value.asInstanceOf[js.Any])
    
    inline def setLabelsIdUndefined: Self = StObject.set(x, "labelsId", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleAppsDriveLabelsV2betaBatchDeleteLabelPermissionsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setRevisionsId(value: String): Self = StObject.set(x, "revisionsId", value.asInstanceOf[js.Any])
    
    inline def setRevisionsIdUndefined: Self = StObject.set(x, "revisionsId", js.undefined)
  }
}
