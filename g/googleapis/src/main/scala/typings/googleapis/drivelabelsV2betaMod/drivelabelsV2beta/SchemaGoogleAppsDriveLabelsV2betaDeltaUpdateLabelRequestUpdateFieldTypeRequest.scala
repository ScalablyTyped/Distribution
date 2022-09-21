package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateFieldTypeRequest extends StObject {
  
  /**
    * Update field to Date.
    */
  var dateOptions: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaFieldDateOptions] = js.undefined
  
  /**
    * Required. The Field to update.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Update field to Integer.
    */
  var integerOptions: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaFieldIntegerOptions] = js.undefined
  
  /**
    * Update field to Long Text.
    */
  var longTextOptions: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaFieldLongTextOptions] = js.undefined
  
  /**
    * Update field to Selection.
    */
  var selectionOptions: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaFieldSelectionOptions] = js.undefined
  
  /**
    * Update field to Text.
    */
  var textOptions: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaFieldTextOptions] = js.undefined
  
  /**
    * The fields that should be updated. At least one field must be specified. The root of `type_options` is implied and should not be specified. A single `*` can be used as short-hand for updating every field.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Update field to User.
    */
  var userOptions: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaFieldUserOptions] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateFieldTypeRequest {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateFieldTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateFieldTypeRequest]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateFieldTypeRequest](x: Self) {
    
    inline def setDateOptions(value: SchemaGoogleAppsDriveLabelsV2betaFieldDateOptions): Self = StObject.set(x, "dateOptions", value.asInstanceOf[js.Any])
    
    inline def setDateOptionsUndefined: Self = StObject.set(x, "dateOptions", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIntegerOptions(value: SchemaGoogleAppsDriveLabelsV2betaFieldIntegerOptions): Self = StObject.set(x, "integerOptions", value.asInstanceOf[js.Any])
    
    inline def setIntegerOptionsUndefined: Self = StObject.set(x, "integerOptions", js.undefined)
    
    inline def setLongTextOptions(value: SchemaGoogleAppsDriveLabelsV2betaFieldLongTextOptions): Self = StObject.set(x, "longTextOptions", value.asInstanceOf[js.Any])
    
    inline def setLongTextOptionsUndefined: Self = StObject.set(x, "longTextOptions", js.undefined)
    
    inline def setSelectionOptions(value: SchemaGoogleAppsDriveLabelsV2betaFieldSelectionOptions): Self = StObject.set(x, "selectionOptions", value.asInstanceOf[js.Any])
    
    inline def setSelectionOptionsUndefined: Self = StObject.set(x, "selectionOptions", js.undefined)
    
    inline def setTextOptions(value: SchemaGoogleAppsDriveLabelsV2betaFieldTextOptions): Self = StObject.set(x, "textOptions", value.asInstanceOf[js.Any])
    
    inline def setTextOptionsUndefined: Self = StObject.set(x, "textOptions", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    inline def setUserOptions(value: SchemaGoogleAppsDriveLabelsV2betaFieldUserOptions): Self = StObject.set(x, "userOptions", value.asInstanceOf[js.Any])
    
    inline def setUserOptionsUndefined: Self = StObject.set(x, "userOptions", js.undefined)
  }
}
