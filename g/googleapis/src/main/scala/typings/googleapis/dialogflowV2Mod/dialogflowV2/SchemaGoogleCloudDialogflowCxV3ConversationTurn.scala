package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ConversationTurn extends StObject {
  
  /**
    * The user input.
    */
  var userInput: js.UndefOr[SchemaGoogleCloudDialogflowCxV3ConversationTurnUserInput] = js.undefined
  
  /**
    * The virtual agent output.
    */
  var virtualAgentOutput: js.UndefOr[SchemaGoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutput] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ConversationTurn {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ConversationTurn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ConversationTurn]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ConversationTurn](x: Self) {
    
    inline def setUserInput(value: SchemaGoogleCloudDialogflowCxV3ConversationTurnUserInput): Self = StObject.set(x, "userInput", value.asInstanceOf[js.Any])
    
    inline def setUserInputUndefined: Self = StObject.set(x, "userInput", js.undefined)
    
    inline def setVirtualAgentOutput(value: SchemaGoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutput): Self = StObject.set(x, "virtualAgentOutput", value.asInstanceOf[js.Any])
    
    inline def setVirtualAgentOutputUndefined: Self = StObject.set(x, "virtualAgentOutput", js.undefined)
  }
}
