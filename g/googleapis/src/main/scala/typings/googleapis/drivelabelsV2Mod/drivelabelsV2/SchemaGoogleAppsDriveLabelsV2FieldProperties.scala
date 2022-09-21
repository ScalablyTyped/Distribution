package typings.googleapis.drivelabelsV2Mod.drivelabelsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2FieldProperties extends StObject {
  
  /**
    * Required. The display text to show in the UI identifying this field.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. Insert or move this field before the indicated field. If empty, the field is placed at the end of the list.
    */
  var insertBeforeField: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the field should be marked as required.
    */
  var required: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2FieldProperties {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2FieldProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2FieldProperties]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2FieldProperties](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setInsertBeforeField(value: String): Self = StObject.set(x, "insertBeforeField", value.asInstanceOf[js.Any])
    
    inline def setInsertBeforeFieldNull: Self = StObject.set(x, "insertBeforeField", null)
    
    inline def setInsertBeforeFieldUndefined: Self = StObject.set(x, "insertBeforeField", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredNull: Self = StObject.set(x, "required", null)
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
