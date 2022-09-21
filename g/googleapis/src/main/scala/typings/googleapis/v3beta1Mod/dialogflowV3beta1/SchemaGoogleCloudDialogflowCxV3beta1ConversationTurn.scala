package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1ConversationTurn extends StObject {
  
  /**
    * The user input.
    */
  var userInput: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1ConversationTurnUserInput] = js.undefined
  
  /**
    * The virtual agent output.
    */
  var virtualAgentOutput: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutput] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1ConversationTurn {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1ConversationTurn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1ConversationTurn]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1ConversationTurn](x: Self) {
    
    inline def setUserInput(value: SchemaGoogleCloudDialogflowCxV3beta1ConversationTurnUserInput): Self = StObject.set(x, "userInput", value.asInstanceOf[js.Any])
    
    inline def setUserInputUndefined: Self = StObject.set(x, "userInput", js.undefined)
    
    inline def setVirtualAgentOutput(value: SchemaGoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutput): Self = StObject.set(x, "virtualAgentOutput", value.asInstanceOf[js.Any])
    
    inline def setVirtualAgentOutputUndefined: Self = StObject.set(x, "virtualAgentOutput", js.undefined)
  }
}
