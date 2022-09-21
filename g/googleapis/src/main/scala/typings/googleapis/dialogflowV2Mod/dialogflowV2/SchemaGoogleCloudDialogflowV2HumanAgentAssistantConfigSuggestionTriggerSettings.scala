package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionTriggerSettings extends StObject {
  
  /**
    * Do not trigger if last utterance is small talk.
    */
  var noSmalltalk: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Only trigger suggestion if participant role of last utterance is END_USER.
    */
  var onlyEndUser: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionTriggerSettings {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionTriggerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionTriggerSettings]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionTriggerSettings](x: Self) {
    
    inline def setNoSmalltalk(value: Boolean): Self = StObject.set(x, "noSmalltalk", value.asInstanceOf[js.Any])
    
    inline def setNoSmalltalkNull: Self = StObject.set(x, "noSmalltalk", null)
    
    inline def setNoSmalltalkUndefined: Self = StObject.set(x, "noSmalltalk", js.undefined)
    
    inline def setOnlyEndUser(value: Boolean): Self = StObject.set(x, "onlyEndUser", value.asInstanceOf[js.Any])
    
    inline def setOnlyEndUserNull: Self = StObject.set(x, "onlyEndUser", null)
    
    inline def setOnlyEndUserUndefined: Self = StObject.set(x, "onlyEndUser", js.undefined)
  }
}
