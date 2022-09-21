package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettings extends StObject {
  
  /**
    * If set to true, the last message from virtual agent (hand off message) and the message before it (trigger message of hand off) are dropped.
    */
  var dropHandoffMessages: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If set to true, all messages from ivr stage are dropped.
    */
  var dropIvrMessages: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If set to true, all messages from virtual agent are dropped.
    */
  var dropVirtualAgentMessages: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettings {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettings]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettings](x: Self) {
    
    inline def setDropHandoffMessages(value: Boolean): Self = StObject.set(x, "dropHandoffMessages", value.asInstanceOf[js.Any])
    
    inline def setDropHandoffMessagesNull: Self = StObject.set(x, "dropHandoffMessages", null)
    
    inline def setDropHandoffMessagesUndefined: Self = StObject.set(x, "dropHandoffMessages", js.undefined)
    
    inline def setDropIvrMessages(value: Boolean): Self = StObject.set(x, "dropIvrMessages", value.asInstanceOf[js.Any])
    
    inline def setDropIvrMessagesNull: Self = StObject.set(x, "dropIvrMessages", null)
    
    inline def setDropIvrMessagesUndefined: Self = StObject.set(x, "dropIvrMessages", js.undefined)
    
    inline def setDropVirtualAgentMessages(value: Boolean): Self = StObject.set(x, "dropVirtualAgentMessages", value.asInstanceOf[js.Any])
    
    inline def setDropVirtualAgentMessagesNull: Self = StObject.set(x, "dropVirtualAgentMessages", null)
    
    inline def setDropVirtualAgentMessagesUndefined: Self = StObject.set(x, "dropVirtualAgentMessages", js.undefined)
  }
}
