package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettings extends StObject {
  
  /**
    * Do not trigger if last utterance is small talk.
    */
  var noSmallTalk: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Only trigger suggestion if participant role of last utterance is END_USER.
    */
  var onlyEndUser: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettings {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettings]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettings](x: Self) {
    
    inline def setNoSmallTalk(value: Boolean): Self = StObject.set(x, "noSmallTalk", value.asInstanceOf[js.Any])
    
    inline def setNoSmallTalkNull: Self = StObject.set(x, "noSmallTalk", null)
    
    inline def setNoSmallTalkUndefined: Self = StObject.set(x, "noSmallTalk", js.undefined)
    
    inline def setOnlyEndUser(value: Boolean): Self = StObject.set(x, "onlyEndUser", value.asInstanceOf[js.Any])
    
    inline def setOnlyEndUserNull: Self = StObject.set(x, "onlyEndUser", null)
    
    inline def setOnlyEndUserUndefined: Self = StObject.set(x, "onlyEndUser", js.undefined)
  }
}
