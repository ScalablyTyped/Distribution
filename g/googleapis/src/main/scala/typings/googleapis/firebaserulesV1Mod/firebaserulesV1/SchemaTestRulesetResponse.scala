package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for FirebaseRulesService.TestRuleset.
  */
trait SchemaTestRulesetResponse extends StObject {
  
  /**
    * Syntactic and semantic `Source` issues of varying severity. Issues of
    * `ERROR` severity will prevent tests from executing.
    */
  var issues: js.UndefOr[js.Array[SchemaIssue]] = js.undefined
  
  /**
    * The set of test results given the test cases in the `TestSuite`. The
    * results will appear in the same order as the test cases appear in the
    * `TestSuite`.
    */
  var testResults: js.UndefOr[js.Array[SchemaTestResult]] = js.undefined
}
object SchemaTestRulesetResponse {
  
  @scala.inline
  def apply(): SchemaTestRulesetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestRulesetResponse]
  }
  
  @scala.inline
  implicit class SchemaTestRulesetResponseMutableBuilder[Self <: SchemaTestRulesetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIssues(value: js.Array[SchemaIssue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    
    @scala.inline
    def setIssuesVarargs(value: SchemaIssue*): Self = StObject.set(x, "issues", js.Array(value :_*))
    
    @scala.inline
    def setTestResults(value: js.Array[SchemaTestResult]): Self = StObject.set(x, "testResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResultsUndefined: Self = StObject.set(x, "testResults", js.undefined)
    
    @scala.inline
    def setTestResultsVarargs(value: SchemaTestResult*): Self = StObject.set(x, "testResults", js.Array(value :_*))
  }
}
