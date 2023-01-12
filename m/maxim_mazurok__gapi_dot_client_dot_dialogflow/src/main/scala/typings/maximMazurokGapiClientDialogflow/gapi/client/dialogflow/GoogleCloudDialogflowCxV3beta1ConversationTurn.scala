package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1ConversationTurn extends StObject {
  
  /** The user input. */
  var userInput: js.UndefOr[GoogleCloudDialogflowCxV3beta1ConversationTurnUserInput] = js.undefined
  
  /** The virtual agent output. */
  var virtualAgentOutput: js.UndefOr[GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutput] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1ConversationTurn {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1ConversationTurn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1ConversationTurn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1ConversationTurn] (val x: Self) extends AnyVal {
    
    inline def setUserInput(value: GoogleCloudDialogflowCxV3beta1ConversationTurnUserInput): Self = StObject.set(x, "userInput", value.asInstanceOf[js.Any])
    
    inline def setUserInputUndefined: Self = StObject.set(x, "userInput", js.undefined)
    
    inline def setVirtualAgentOutput(value: GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutput): Self = StObject.set(x, "virtualAgentOutput", value.asInstanceOf[js.Any])
    
    inline def setVirtualAgentOutputUndefined: Self = StObject.set(x, "virtualAgentOutput", js.undefined)
  }
}
