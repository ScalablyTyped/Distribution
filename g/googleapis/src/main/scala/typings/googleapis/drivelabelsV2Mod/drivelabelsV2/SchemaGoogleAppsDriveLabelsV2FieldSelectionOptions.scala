package typings.googleapis.drivelabelsV2Mod.drivelabelsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2FieldSelectionOptions extends StObject {
  
  /**
    * The options available for this selection field. The list order is consistent, and modified with `insert_before_choice`.
    */
  var choices: js.UndefOr[js.Array[SchemaGoogleAppsDriveLabelsV2FieldSelectionOptionsChoice]] = js.undefined
  
  /**
    * When specified, indicates this field supports a list of values. Once the field is published, this cannot be changed.
    */
  var listOptions: js.UndefOr[SchemaGoogleAppsDriveLabelsV2FieldListOptions] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2FieldSelectionOptions {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2FieldSelectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2FieldSelectionOptions]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2FieldSelectionOptions](x: Self) {
    
    inline def setChoices(value: js.Array[SchemaGoogleAppsDriveLabelsV2FieldSelectionOptionsChoice]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    
    inline def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
    
    inline def setChoicesVarargs(value: SchemaGoogleAppsDriveLabelsV2FieldSelectionOptionsChoice*): Self = StObject.set(x, "choices", js.Array(value*))
    
    inline def setListOptions(value: SchemaGoogleAppsDriveLabelsV2FieldListOptions): Self = StObject.set(x, "listOptions", value.asInstanceOf[js.Any])
    
    inline def setListOptionsUndefined: Self = StObject.set(x, "listOptions", js.undefined)
  }
}
