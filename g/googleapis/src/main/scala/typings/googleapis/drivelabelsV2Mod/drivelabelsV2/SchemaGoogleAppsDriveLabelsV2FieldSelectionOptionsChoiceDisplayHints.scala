package typings.googleapis.drivelabelsV2Mod.drivelabelsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2FieldSelectionOptionsChoiceDisplayHints extends StObject {
  
  /**
    * The colors to use for the badge. Changed to Google Material colors based on the chosen `properties.badge_config.color`.
    */
  var badgeColors: js.UndefOr[SchemaGoogleAppsDriveLabelsV2BadgeColors] = js.undefined
  
  /**
    * The priority of this badge. Used to compare and sort between multiple badges. A lower number means the badge should be shown first. When a badging configuration is not present, this will be 0. Otherwise, this will be set to `BadgeConfig.priority_override` or the default heuristic which prefers creation date of the label, and field and option priority.
    */
  var badgePriority: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The dark-mode color to use for the badge. Changed to Google Material colors based on the chosen `properties.badge_config.color`.
    */
  var darkBadgeColors: js.UndefOr[SchemaGoogleAppsDriveLabelsV2BadgeColors] = js.undefined
  
  /**
    * Whether the option should be shown in the UI as disabled.
    */
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This option should be hidden in the search menu when searching for Drive items.
    */
  var hiddenInSearch: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This option should be shown in the apply menu when applying values to a Drive item.
    */
  var shownInApply: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2FieldSelectionOptionsChoiceDisplayHints {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2FieldSelectionOptionsChoiceDisplayHints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2FieldSelectionOptionsChoiceDisplayHints]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2FieldSelectionOptionsChoiceDisplayHints](x: Self) {
    
    inline def setBadgeColors(value: SchemaGoogleAppsDriveLabelsV2BadgeColors): Self = StObject.set(x, "badgeColors", value.asInstanceOf[js.Any])
    
    inline def setBadgeColorsUndefined: Self = StObject.set(x, "badgeColors", js.undefined)
    
    inline def setBadgePriority(value: String): Self = StObject.set(x, "badgePriority", value.asInstanceOf[js.Any])
    
    inline def setBadgePriorityNull: Self = StObject.set(x, "badgePriority", null)
    
    inline def setBadgePriorityUndefined: Self = StObject.set(x, "badgePriority", js.undefined)
    
    inline def setDarkBadgeColors(value: SchemaGoogleAppsDriveLabelsV2BadgeColors): Self = StObject.set(x, "darkBadgeColors", value.asInstanceOf[js.Any])
    
    inline def setDarkBadgeColorsUndefined: Self = StObject.set(x, "darkBadgeColors", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHiddenInSearch(value: Boolean): Self = StObject.set(x, "hiddenInSearch", value.asInstanceOf[js.Any])
    
    inline def setHiddenInSearchNull: Self = StObject.set(x, "hiddenInSearch", null)
    
    inline def setHiddenInSearchUndefined: Self = StObject.set(x, "hiddenInSearch", js.undefined)
    
    inline def setShownInApply(value: Boolean): Self = StObject.set(x, "shownInApply", value.asInstanceOf[js.Any])
    
    inline def setShownInApplyNull: Self = StObject.set(x, "shownInApply", null)
    
    inline def setShownInApplyUndefined: Self = StObject.set(x, "shownInApply", js.undefined)
  }
}
