package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse extends StObject {
  
  /**
    * Creates a new Field.
    */
  var createField: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseCreateFieldResponse] = js.undefined
  
  /**
    * Creates a new selection list option to add to a Selection Field.
    */
  var createSelectionChoice: js.UndefOr[
    SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseCreateSelectionChoiceResponse
  ] = js.undefined
  
  /**
    * Deletes a Field from the label.
    */
  var deleteField: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseDeleteFieldResponse] = js.undefined
  
  /**
    * Deletes a Choice from a Selection Field.
    */
  var deleteSelectionChoice: js.UndefOr[
    SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseDeleteSelectionChoiceResponse
  ] = js.undefined
  
  /**
    * Disables Field.
    */
  var disableField: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseDisableFieldResponse] = js.undefined
  
  /**
    * Disables a Choice within a Selection Field.
    */
  var disableSelectionChoice: js.UndefOr[
    SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseDisableSelectionChoiceResponse
  ] = js.undefined
  
  /**
    * Enables Field.
    */
  var enableField: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseEnableFieldResponse] = js.undefined
  
  /**
    * Enables a Choice within a Selection Field.
    */
  var enableSelectionChoice: js.UndefOr[
    SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseEnableSelectionChoiceResponse
  ] = js.undefined
  
  /**
    * Updates basic properties of a Field.
    */
  var updateField: js.UndefOr[
    SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseUpdateFieldPropertiesResponse
  ] = js.undefined
  
  /**
    * Update Field type and/or type options.
    */
  var updateFieldType: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseUpdateFieldTypeResponse] = js.undefined
  
  /**
    * Updated basic properties of a Label.
    */
  var updateLabel: js.UndefOr[
    SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseUpdateLabelPropertiesResponse
  ] = js.undefined
  
  /**
    * Updates a Choice within a Selection Field.
    */
  var updateSelectionChoiceProperties: js.UndefOr[
    SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseUpdateSelectionChoicePropertiesResponse
  ] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse](x: Self) {
    
    inline def setCreateField(value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseCreateFieldResponse): Self = StObject.set(x, "createField", value.asInstanceOf[js.Any])
    
    inline def setCreateFieldUndefined: Self = StObject.set(x, "createField", js.undefined)
    
    inline def setCreateSelectionChoice(value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseCreateSelectionChoiceResponse): Self = StObject.set(x, "createSelectionChoice", value.asInstanceOf[js.Any])
    
    inline def setCreateSelectionChoiceUndefined: Self = StObject.set(x, "createSelectionChoice", js.undefined)
    
    inline def setDeleteField(value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseDeleteFieldResponse): Self = StObject.set(x, "deleteField", value.asInstanceOf[js.Any])
    
    inline def setDeleteFieldUndefined: Self = StObject.set(x, "deleteField", js.undefined)
    
    inline def setDeleteSelectionChoice(value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseDeleteSelectionChoiceResponse): Self = StObject.set(x, "deleteSelectionChoice", value.asInstanceOf[js.Any])
    
    inline def setDeleteSelectionChoiceUndefined: Self = StObject.set(x, "deleteSelectionChoice", js.undefined)
    
    inline def setDisableField(value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseDisableFieldResponse): Self = StObject.set(x, "disableField", value.asInstanceOf[js.Any])
    
    inline def setDisableFieldUndefined: Self = StObject.set(x, "disableField", js.undefined)
    
    inline def setDisableSelectionChoice(value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseDisableSelectionChoiceResponse): Self = StObject.set(x, "disableSelectionChoice", value.asInstanceOf[js.Any])
    
    inline def setDisableSelectionChoiceUndefined: Self = StObject.set(x, "disableSelectionChoice", js.undefined)
    
    inline def setEnableField(value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseEnableFieldResponse): Self = StObject.set(x, "enableField", value.asInstanceOf[js.Any])
    
    inline def setEnableFieldUndefined: Self = StObject.set(x, "enableField", js.undefined)
    
    inline def setEnableSelectionChoice(value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseEnableSelectionChoiceResponse): Self = StObject.set(x, "enableSelectionChoice", value.asInstanceOf[js.Any])
    
    inline def setEnableSelectionChoiceUndefined: Self = StObject.set(x, "enableSelectionChoice", js.undefined)
    
    inline def setUpdateField(value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseUpdateFieldPropertiesResponse): Self = StObject.set(x, "updateField", value.asInstanceOf[js.Any])
    
    inline def setUpdateFieldType(value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseUpdateFieldTypeResponse): Self = StObject.set(x, "updateFieldType", value.asInstanceOf[js.Any])
    
    inline def setUpdateFieldTypeUndefined: Self = StObject.set(x, "updateFieldType", js.undefined)
    
    inline def setUpdateFieldUndefined: Self = StObject.set(x, "updateField", js.undefined)
    
    inline def setUpdateLabel(value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseUpdateLabelPropertiesResponse): Self = StObject.set(x, "updateLabel", value.asInstanceOf[js.Any])
    
    inline def setUpdateLabelUndefined: Self = StObject.set(x, "updateLabel", js.undefined)
    
    inline def setUpdateSelectionChoiceProperties(
      value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseUpdateSelectionChoicePropertiesResponse
    ): Self = StObject.set(x, "updateSelectionChoiceProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateSelectionChoicePropertiesUndefined: Self = StObject.set(x, "updateSelectionChoiceProperties", js.undefined)
  }
}
