package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1TestCaseResult extends StObject {
  
  /**
    * The conversation turns uttered during the test case replay in chronological order.
    */
  var conversationTurns: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1ConversationTurn]] = js.undefined
  
  /**
    * Environment where the test was run. If not set, it indicates the draft environment.
    */
  var environment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name for the test case result. Format: `projects//locations//agents//testCases/ /results/`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the test case passed in the agent environment.
    */
  var testResult: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time that the test was run.
    */
  var testTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1TestCaseResult {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1TestCaseResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1TestCaseResult]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1TestCaseResult](x: Self) {
    
    inline def setConversationTurns(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1ConversationTurn]): Self = StObject.set(x, "conversationTurns", value.asInstanceOf[js.Any])
    
    inline def setConversationTurnsUndefined: Self = StObject.set(x, "conversationTurns", js.undefined)
    
    inline def setConversationTurnsVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1ConversationTurn*): Self = StObject.set(x, "conversationTurns", js.Array(value*))
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNull: Self = StObject.set(x, "environment", null)
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTestResult(value: String): Self = StObject.set(x, "testResult", value.asInstanceOf[js.Any])
    
    inline def setTestResultNull: Self = StObject.set(x, "testResult", null)
    
    inline def setTestResultUndefined: Self = StObject.set(x, "testResult", js.undefined)
    
    inline def setTestTime(value: String): Self = StObject.set(x, "testTime", value.asInstanceOf[js.Any])
    
    inline def setTestTimeNull: Self = StObject.set(x, "testTime", null)
    
    inline def setTestTimeUndefined: Self = StObject.set(x, "testTime", js.undefined)
  }
}
