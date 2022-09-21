package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1AnswerFeedback extends StObject {
  
  /**
    * Optional. Detail feedback of agent assistant suggestions.
    */
  var agentAssistantDetailFeedback: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1AgentAssistantFeedback] = js.undefined
  
  /**
    * Time when the answer/item was clicked.
    */
  var clickTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether the answer/item was clicked by the human agent or not. Default to false.
    */
  var clicked: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The correctness level of the specific answer.
    */
  var correctnessLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time when the answer/item was displayed.
    */
  var displayTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether the answer/item was displayed to the human agent in the agent desktop UI. Default to false.
    */
  var displayed: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1AnswerFeedback {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1AnswerFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1AnswerFeedback]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1AnswerFeedback](x: Self) {
    
    inline def setAgentAssistantDetailFeedback(value: SchemaGoogleCloudDialogflowV2beta1AgentAssistantFeedback): Self = StObject.set(x, "agentAssistantDetailFeedback", value.asInstanceOf[js.Any])
    
    inline def setAgentAssistantDetailFeedbackUndefined: Self = StObject.set(x, "agentAssistantDetailFeedback", js.undefined)
    
    inline def setClickTime(value: String): Self = StObject.set(x, "clickTime", value.asInstanceOf[js.Any])
    
    inline def setClickTimeNull: Self = StObject.set(x, "clickTime", null)
    
    inline def setClickTimeUndefined: Self = StObject.set(x, "clickTime", js.undefined)
    
    inline def setClicked(value: Boolean): Self = StObject.set(x, "clicked", value.asInstanceOf[js.Any])
    
    inline def setClickedNull: Self = StObject.set(x, "clicked", null)
    
    inline def setClickedUndefined: Self = StObject.set(x, "clicked", js.undefined)
    
    inline def setCorrectnessLevel(value: String): Self = StObject.set(x, "correctnessLevel", value.asInstanceOf[js.Any])
    
    inline def setCorrectnessLevelNull: Self = StObject.set(x, "correctnessLevel", null)
    
    inline def setCorrectnessLevelUndefined: Self = StObject.set(x, "correctnessLevel", js.undefined)
    
    inline def setDisplayTime(value: String): Self = StObject.set(x, "displayTime", value.asInstanceOf[js.Any])
    
    inline def setDisplayTimeNull: Self = StObject.set(x, "displayTime", null)
    
    inline def setDisplayTimeUndefined: Self = StObject.set(x, "displayTime", js.undefined)
    
    inline def setDisplayed(value: Boolean): Self = StObject.set(x, "displayed", value.asInstanceOf[js.Any])
    
    inline def setDisplayedNull: Self = StObject.set(x, "displayed", null)
    
    inline def setDisplayedUndefined: Self = StObject.set(x, "displayed", js.undefined)
  }
}
