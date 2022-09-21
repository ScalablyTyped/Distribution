package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2ClearSuggestionFeatureConfigRequest extends StObject {
  
  /**
    * Required. The participant role to remove the suggestion feature config. Only HUMAN_AGENT or END_USER can be used.
    */
  var participantRole: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The type of the suggestion feature to remove.
    */
  var suggestionFeatureType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ClearSuggestionFeatureConfigRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ClearSuggestionFeatureConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ClearSuggestionFeatureConfigRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ClearSuggestionFeatureConfigRequest](x: Self) {
    
    inline def setParticipantRole(value: String): Self = StObject.set(x, "participantRole", value.asInstanceOf[js.Any])
    
    inline def setParticipantRoleNull: Self = StObject.set(x, "participantRole", null)
    
    inline def setParticipantRoleUndefined: Self = StObject.set(x, "participantRole", js.undefined)
    
    inline def setSuggestionFeatureType(value: String): Self = StObject.set(x, "suggestionFeatureType", value.asInstanceOf[js.Any])
    
    inline def setSuggestionFeatureTypeNull: Self = StObject.set(x, "suggestionFeatureType", null)
    
    inline def setSuggestionFeatureTypeUndefined: Self = StObject.set(x, "suggestionFeatureType", js.undefined)
  }
}
