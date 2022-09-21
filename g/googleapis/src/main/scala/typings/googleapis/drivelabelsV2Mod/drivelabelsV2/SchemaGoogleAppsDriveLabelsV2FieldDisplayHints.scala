package typings.googleapis.drivelabelsV2Mod.drivelabelsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2FieldDisplayHints extends StObject {
  
  /**
    * Whether the field should be shown in the UI as disabled.
    */
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This field should be hidden in the search menu when searching for Drive items.
    */
  var hiddenInSearch: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the field should be shown as required in the UI.
    */
  var required: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This field should be shown in the apply menu when applying values to a Drive item.
    */
  var shownInApply: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2FieldDisplayHints {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2FieldDisplayHints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2FieldDisplayHints]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2FieldDisplayHints](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHiddenInSearch(value: Boolean): Self = StObject.set(x, "hiddenInSearch", value.asInstanceOf[js.Any])
    
    inline def setHiddenInSearchNull: Self = StObject.set(x, "hiddenInSearch", null)
    
    inline def setHiddenInSearchUndefined: Self = StObject.set(x, "hiddenInSearch", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredNull: Self = StObject.set(x, "required", null)
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setShownInApply(value: Boolean): Self = StObject.set(x, "shownInApply", value.asInstanceOf[js.Any])
    
    inline def setShownInApplyNull: Self = StObject.set(x, "shownInApply", null)
    
    inline def setShownInApplyUndefined: Self = StObject.set(x, "shownInApply", js.undefined)
  }
}
