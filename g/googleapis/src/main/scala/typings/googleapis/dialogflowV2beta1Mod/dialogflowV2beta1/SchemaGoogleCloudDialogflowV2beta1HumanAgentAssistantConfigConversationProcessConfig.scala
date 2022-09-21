package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfig extends StObject {
  
  /**
    * Number of recent non-small-talk sentences to use as context for article and FAQ suggestion
    */
  var recentSentencesCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfig](x: Self) {
    
    inline def setRecentSentencesCount(value: Double): Self = StObject.set(x, "recentSentencesCount", value.asInstanceOf[js.Any])
    
    inline def setRecentSentencesCountNull: Self = StObject.set(x, "recentSentencesCount", null)
    
    inline def setRecentSentencesCountUndefined: Self = StObject.set(x, "recentSentencesCount", js.undefined)
  }
}
