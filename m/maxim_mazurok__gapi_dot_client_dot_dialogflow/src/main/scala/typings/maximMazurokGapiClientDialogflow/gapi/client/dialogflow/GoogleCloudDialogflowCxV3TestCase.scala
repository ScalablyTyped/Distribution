package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3TestCase extends StObject {
  
  /** Output only. When the test was created. */
  var creationTime: js.UndefOr[String] = js.undefined
  
  /** Required. The human-readable name of the test case, unique within the agent. Limit of 200 characters. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The latest test result. */
  var lastTestResult: js.UndefOr[GoogleCloudDialogflowCxV3TestCaseResult] = js.undefined
  
  /** The unique identifier of the test case. TestCases.CreateTestCase will populate the name automatically. Otherwise use format: `projects//locations//agents/ /testCases/`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Additional freeform notes about the test case. Limit of 400 characters. */
  var notes: js.UndefOr[String] = js.undefined
  
  /** Tags are short descriptions that users may apply to test cases for organizational and filtering purposes. Each tag should start with "#" and has a limit of 30 characters. */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The conversation turns uttered when the test case was created, in chronological order. These include the canonical set of agent utterances that should occur when the agent is
    * working properly.
    */
  var testCaseConversationTurns: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3ConversationTurn]] = js.undefined
  
  /** Config for the test case. */
  var testConfig: js.UndefOr[GoogleCloudDialogflowCxV3TestConfig] = js.undefined
}
object GoogleCloudDialogflowCxV3TestCase {
  
  inline def apply(): GoogleCloudDialogflowCxV3TestCase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3TestCase]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3TestCase](x: Self) {
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLastTestResult(value: GoogleCloudDialogflowCxV3TestCaseResult): Self = StObject.set(x, "lastTestResult", value.asInstanceOf[js.Any])
    
    inline def setLastTestResultUndefined: Self = StObject.set(x, "lastTestResult", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTestCaseConversationTurns(value: js.Array[GoogleCloudDialogflowCxV3ConversationTurn]): Self = StObject.set(x, "testCaseConversationTurns", value.asInstanceOf[js.Any])
    
    inline def setTestCaseConversationTurnsUndefined: Self = StObject.set(x, "testCaseConversationTurns", js.undefined)
    
    inline def setTestCaseConversationTurnsVarargs(value: GoogleCloudDialogflowCxV3ConversationTurn*): Self = StObject.set(x, "testCaseConversationTurns", js.Array(value*))
    
    inline def setTestConfig(value: GoogleCloudDialogflowCxV3TestConfig): Self = StObject.set(x, "testConfig", value.asInstanceOf[js.Any])
    
    inline def setTestConfigUndefined: Self = StObject.set(x, "testConfig", js.undefined)
  }
}
