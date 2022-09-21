package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDisableFieldRequest extends StObject {
  
  /**
    * Required. Field Disabled Policy.
    */
  var disabledPolicy: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaLifecycleDisabledPolicy] = js.undefined
  
  /**
    * Required. Key of the Field to disable.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `disabled_policy` is implied and should not be specified. A single `*` can be used as short-hand for updating every field.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDisableFieldRequest {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDisableFieldRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDisableFieldRequest]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDisableFieldRequest](x: Self) {
    
    inline def setDisabledPolicy(value: SchemaGoogleAppsDriveLabelsV2betaLifecycleDisabledPolicy): Self = StObject.set(x, "disabledPolicy", value.asInstanceOf[js.Any])
    
    inline def setDisabledPolicyUndefined: Self = StObject.set(x, "disabledPolicy", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
