package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3TestCaseResult extends StObject {
  
  /** The conversation turns uttered during the test case replay in chronological order. */
  var conversationTurns: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3ConversationTurn]] = js.undefined
  
  /** Environment where the test was run. If not set, it indicates the draft environment. */
  var environment: js.UndefOr[String] = js.undefined
  
  /** The resource name for the test case result. Format: `projects//locations//agents//testCases/ /results/`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Whether the test case passed in the agent environment. */
  var testResult: js.UndefOr[String] = js.undefined
  
  /** The time that the test was run. */
  var testTime: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3TestCaseResult {
  
  inline def apply(): GoogleCloudDialogflowCxV3TestCaseResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3TestCaseResult]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3TestCaseResult](x: Self) {
    
    inline def setConversationTurns(value: js.Array[GoogleCloudDialogflowCxV3ConversationTurn]): Self = StObject.set(x, "conversationTurns", value.asInstanceOf[js.Any])
    
    inline def setConversationTurnsUndefined: Self = StObject.set(x, "conversationTurns", js.undefined)
    
    inline def setConversationTurnsVarargs(value: GoogleCloudDialogflowCxV3ConversationTurn*): Self = StObject.set(x, "conversationTurns", js.Array(value*))
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTestResult(value: String): Self = StObject.set(x, "testResult", value.asInstanceOf[js.Any])
    
    inline def setTestResultUndefined: Self = StObject.set(x, "testResult", js.undefined)
    
    inline def setTestTime(value: String): Self = StObject.set(x, "testTime", value.asInstanceOf[js.Any])
    
    inline def setTestTimeUndefined: Self = StObject.set(x, "testTime", js.undefined)
  }
}
