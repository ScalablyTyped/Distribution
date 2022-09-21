package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestCreateSelectionChoiceRequest extends StObject {
  
  /**
    * Required. The Choice to create.
    */
  var choice: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaFieldSelectionOptionsChoice] = js.undefined
  
  /**
    * Required. The Selection Field in which a Choice will be created.
    */
  var fieldId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestCreateSelectionChoiceRequest {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestCreateSelectionChoiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestCreateSelectionChoiceRequest]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestCreateSelectionChoiceRequest](x: Self) {
    
    inline def setChoice(value: SchemaGoogleAppsDriveLabelsV2betaFieldSelectionOptionsChoice): Self = StObject.set(x, "choice", value.asInstanceOf[js.Any])
    
    inline def setChoiceUndefined: Self = StObject.set(x, "choice", js.undefined)
    
    inline def setFieldId(value: String): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
    
    inline def setFieldIdNull: Self = StObject.set(x, "fieldId", null)
    
    inline def setFieldIdUndefined: Self = StObject.set(x, "fieldId", js.undefined)
  }
}
