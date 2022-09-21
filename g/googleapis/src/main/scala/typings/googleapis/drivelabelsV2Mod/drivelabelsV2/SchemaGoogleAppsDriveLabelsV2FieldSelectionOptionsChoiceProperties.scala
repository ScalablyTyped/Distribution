package typings.googleapis.drivelabelsV2Mod.drivelabelsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2FieldSelectionOptionsChoiceProperties extends StObject {
  
  /**
    * The badge configuration for this choice. When set, the label that owns this choice is considered a "badged label".
    */
  var badgeConfig: js.UndefOr[SchemaGoogleAppsDriveLabelsV2BadgeConfig] = js.undefined
  
  /**
    * The description of this label.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The display text to show in the UI identifying this field.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. Insert or move this choice before the indicated choice. If empty, the choice is placed at the end of the list.
    */
  var insertBeforeChoice: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2FieldSelectionOptionsChoiceProperties {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2FieldSelectionOptionsChoiceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2FieldSelectionOptionsChoiceProperties]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2FieldSelectionOptionsChoiceProperties](x: Self) {
    
    inline def setBadgeConfig(value: SchemaGoogleAppsDriveLabelsV2BadgeConfig): Self = StObject.set(x, "badgeConfig", value.asInstanceOf[js.Any])
    
    inline def setBadgeConfigUndefined: Self = StObject.set(x, "badgeConfig", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setInsertBeforeChoice(value: String): Self = StObject.set(x, "insertBeforeChoice", value.asInstanceOf[js.Any])
    
    inline def setInsertBeforeChoiceNull: Self = StObject.set(x, "insertBeforeChoice", null)
    
    inline def setInsertBeforeChoiceUndefined: Self = StObject.set(x, "insertBeforeChoice", js.undefined)
  }
}
