package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaFieldSelectionOptions extends StObject {
  
  /**
    * The options available for this selection field. The list order is consistent, and modified with `insert_before_choice`.
    */
  var choices: js.UndefOr[js.Array[SchemaGoogleAppsDriveLabelsV2betaFieldSelectionOptionsChoice]] = js.undefined
  
  /**
    * When specified, indicates this field supports a list of values. Once the field is published, this cannot be changed.
    */
  var listOptions: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaFieldListOptions] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaFieldSelectionOptions {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaFieldSelectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaFieldSelectionOptions]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaFieldSelectionOptions](x: Self) {
    
    inline def setChoices(value: js.Array[SchemaGoogleAppsDriveLabelsV2betaFieldSelectionOptionsChoice]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    
    inline def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
    
    inline def setChoicesVarargs(value: SchemaGoogleAppsDriveLabelsV2betaFieldSelectionOptionsChoice*): Self = StObject.set(x, "choices", js.Array(value*))
    
    inline def setListOptions(value: SchemaGoogleAppsDriveLabelsV2betaFieldListOptions): Self = StObject.set(x, "listOptions", value.asInstanceOf[js.Any])
    
    inline def setListOptionsUndefined: Self = StObject.set(x, "listOptions", js.undefined)
  }
}
