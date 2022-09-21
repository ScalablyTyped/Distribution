package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaLabelDisplayHints extends StObject {
  
  /**
    * Whether the label should be shown in the UI as disabled.
    */
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This label should be hidden in the search menu when searching for Drive items.
    */
  var hiddenInSearch: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Order to display label in a list.
    */
  var priority: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This label should be shown in the apply menu when applying values to a Drive item.
    */
  var shownInApply: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaLabelDisplayHints {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaLabelDisplayHints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaLabelDisplayHints]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaLabelDisplayHints](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHiddenInSearch(value: Boolean): Self = StObject.set(x, "hiddenInSearch", value.asInstanceOf[js.Any])
    
    inline def setHiddenInSearchNull: Self = StObject.set(x, "hiddenInSearch", null)
    
    inline def setHiddenInSearchUndefined: Self = StObject.set(x, "hiddenInSearch", js.undefined)
    
    inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setShownInApply(value: Boolean): Self = StObject.set(x, "shownInApply", value.asInstanceOf[js.Any])
    
    inline def setShownInApplyNull: Self = StObject.set(x, "shownInApply", null)
    
    inline def setShownInApplyUndefined: Self = StObject.set(x, "shownInApply", js.undefined)
  }
}
