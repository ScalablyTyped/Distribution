package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3TestCase extends StObject {
  
  /**
    * Output only. When the test was created.
    */
  var creationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The human-readable name of the test case, unique within the agent. Limit of 200 characters.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The latest test result.
    */
  var lastTestResult: js.UndefOr[SchemaGoogleCloudDialogflowCxV3TestCaseResult] = js.undefined
  
  /**
    * The unique identifier of the test case. TestCases.CreateTestCase will populate the name automatically. Otherwise use format: `projects//locations//agents/ /testCases/`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional freeform notes about the test case. Limit of 400 characters.
    */
  var notes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tags are short descriptions that users may apply to test cases for organizational and filtering purposes. Each tag should start with "#" and has a limit of 30 characters.
    */
  var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The conversation turns uttered when the test case was created, in chronological order. These include the canonical set of agent utterances that should occur when the agent is working properly.
    */
  var testCaseConversationTurns: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3ConversationTurn]] = js.undefined
  
  /**
    * Config for the test case.
    */
  var testConfig: js.UndefOr[SchemaGoogleCloudDialogflowCxV3TestConfig] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3TestCase {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3TestCase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3TestCase]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3TestCase](x: Self) {
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeNull: Self = StObject.set(x, "creationTime", null)
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLastTestResult(value: SchemaGoogleCloudDialogflowCxV3TestCaseResult): Self = StObject.set(x, "lastTestResult", value.asInstanceOf[js.Any])
    
    inline def setLastTestResultUndefined: Self = StObject.set(x, "lastTestResult", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesNull: Self = StObject.set(x, "notes", null)
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTestCaseConversationTurns(value: js.Array[SchemaGoogleCloudDialogflowCxV3ConversationTurn]): Self = StObject.set(x, "testCaseConversationTurns", value.asInstanceOf[js.Any])
    
    inline def setTestCaseConversationTurnsUndefined: Self = StObject.set(x, "testCaseConversationTurns", js.undefined)
    
    inline def setTestCaseConversationTurnsVarargs(value: SchemaGoogleCloudDialogflowCxV3ConversationTurn*): Self = StObject.set(x, "testCaseConversationTurns", js.Array(value*))
    
    inline def setTestConfig(value: SchemaGoogleCloudDialogflowCxV3TestConfig): Self = StObject.set(x, "testConfig", value.asInstanceOf[js.Any])
    
    inline def setTestConfigUndefined: Self = StObject.set(x, "testConfig", js.undefined)
  }
}
