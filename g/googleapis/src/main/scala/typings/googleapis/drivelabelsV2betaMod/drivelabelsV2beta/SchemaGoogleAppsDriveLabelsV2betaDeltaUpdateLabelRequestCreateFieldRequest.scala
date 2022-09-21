package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestCreateFieldRequest extends StObject {
  
  /**
    * Required. Field to create.
    */
  var field: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaField] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestCreateFieldRequest {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestCreateFieldRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestCreateFieldRequest]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestCreateFieldRequest](x: Self) {
    
    inline def setField(value: SchemaGoogleAppsDriveLabelsV2betaField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
