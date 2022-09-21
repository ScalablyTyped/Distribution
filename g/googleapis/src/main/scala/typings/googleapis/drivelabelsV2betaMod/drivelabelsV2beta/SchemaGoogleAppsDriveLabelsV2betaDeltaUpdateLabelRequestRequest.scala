package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestRequest extends StObject {
  
  /**
    * Creates a new Field.
    */
  var createField: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestCreateFieldRequest] = js.undefined
  
  /**
    * Creates Choice within a Selection field.
    */
  var createSelectionChoice: js.UndefOr[
    SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestCreateSelectionChoiceRequest
  ] = js.undefined
  
  /**
    * Deletes a Field from the label.
    */
  var deleteField: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDeleteFieldRequest] = js.undefined
  
  /**
    * Delete a Choice within a Selection Field.
    */
  var deleteSelectionChoice: js.UndefOr[
    SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDeleteSelectionChoiceRequest
  ] = js.undefined
  
  /**
    * Disables the Field.
    */
  var disableField: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDisableFieldRequest] = js.undefined
  
  /**
    * Disable a Choice within a Selection Field.
    */
  var disableSelectionChoice: js.UndefOr[
    SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDisableSelectionChoiceRequest
  ] = js.undefined
  
  /**
    * Enables the Field.
    */
  var enableField: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestEnableFieldRequest] = js.undefined
  
  /**
    * Enable a Choice within a Selection Field.
    */
  var enableSelectionChoice: js.UndefOr[
    SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestEnableSelectionChoiceRequest
  ] = js.undefined
  
  /**
    * Updates basic properties of a Field.
    */
  var updateField: js.UndefOr[
    SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateFieldPropertiesRequest
  ] = js.undefined
  
  /**
    * Update Field type and/or type options.
    */
  var updateFieldType: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateFieldTypeRequest] = js.undefined
  
  /**
    * Updates the Label properties.
    */
  var updateLabel: js.UndefOr[
    SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateLabelPropertiesRequest
  ] = js.undefined
  
  /**
    * Update a Choice properties within a Selection Field.
    */
  var updateSelectionChoiceProperties: js.UndefOr[
    SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateSelectionChoicePropertiesRequest
  ] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestRequest {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestRequest]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestRequest](x: Self) {
    
    inline def setCreateField(value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestCreateFieldRequest): Self = StObject.set(x, "createField", value.asInstanceOf[js.Any])
    
    inline def setCreateFieldUndefined: Self = StObject.set(x, "createField", js.undefined)
    
    inline def setCreateSelectionChoice(value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestCreateSelectionChoiceRequest): Self = StObject.set(x, "createSelectionChoice", value.asInstanceOf[js.Any])
    
    inline def setCreateSelectionChoiceUndefined: Self = StObject.set(x, "createSelectionChoice", js.undefined)
    
    inline def setDeleteField(value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDeleteFieldRequest): Self = StObject.set(x, "deleteField", value.asInstanceOf[js.Any])
    
    inline def setDeleteFieldUndefined: Self = StObject.set(x, "deleteField", js.undefined)
    
    inline def setDeleteSelectionChoice(value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDeleteSelectionChoiceRequest): Self = StObject.set(x, "deleteSelectionChoice", value.asInstanceOf[js.Any])
    
    inline def setDeleteSelectionChoiceUndefined: Self = StObject.set(x, "deleteSelectionChoice", js.undefined)
    
    inline def setDisableField(value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDisableFieldRequest): Self = StObject.set(x, "disableField", value.asInstanceOf[js.Any])
    
    inline def setDisableFieldUndefined: Self = StObject.set(x, "disableField", js.undefined)
    
    inline def setDisableSelectionChoice(value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDisableSelectionChoiceRequest): Self = StObject.set(x, "disableSelectionChoice", value.asInstanceOf[js.Any])
    
    inline def setDisableSelectionChoiceUndefined: Self = StObject.set(x, "disableSelectionChoice", js.undefined)
    
    inline def setEnableField(value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestEnableFieldRequest): Self = StObject.set(x, "enableField", value.asInstanceOf[js.Any])
    
    inline def setEnableFieldUndefined: Self = StObject.set(x, "enableField", js.undefined)
    
    inline def setEnableSelectionChoice(value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestEnableSelectionChoiceRequest): Self = StObject.set(x, "enableSelectionChoice", value.asInstanceOf[js.Any])
    
    inline def setEnableSelectionChoiceUndefined: Self = StObject.set(x, "enableSelectionChoice", js.undefined)
    
    inline def setUpdateField(value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateFieldPropertiesRequest): Self = StObject.set(x, "updateField", value.asInstanceOf[js.Any])
    
    inline def setUpdateFieldType(value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateFieldTypeRequest): Self = StObject.set(x, "updateFieldType", value.asInstanceOf[js.Any])
    
    inline def setUpdateFieldTypeUndefined: Self = StObject.set(x, "updateFieldType", js.undefined)
    
    inline def setUpdateFieldUndefined: Self = StObject.set(x, "updateField", js.undefined)
    
    inline def setUpdateLabel(value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateLabelPropertiesRequest): Self = StObject.set(x, "updateLabel", value.asInstanceOf[js.Any])
    
    inline def setUpdateLabelUndefined: Self = StObject.set(x, "updateLabel", js.undefined)
    
    inline def setUpdateSelectionChoiceProperties(
      value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateSelectionChoicePropertiesRequest
    ): Self = StObject.set(x, "updateSelectionChoiceProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateSelectionChoicePropertiesUndefined: Self = StObject.set(x, "updateSelectionChoiceProperties", js.undefined)
  }
}
