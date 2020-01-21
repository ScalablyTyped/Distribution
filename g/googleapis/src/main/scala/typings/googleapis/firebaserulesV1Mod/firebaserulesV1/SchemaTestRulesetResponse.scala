package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for FirebaseRulesService.TestRuleset.
  */
@js.native
trait SchemaTestRulesetResponse extends js.Object {
  /**
    * Syntactic and semantic `Source` issues of varying severity. Issues of
    * `ERROR` severity will prevent tests from executing.
    */
  var issues: js.UndefOr[js.Array[SchemaIssue]] = js.native
  /**
    * The set of test results given the test cases in the `TestSuite`. The
    * results will appear in the same order as the test cases appear in the
    * `TestSuite`.
    */
  var testResults: js.UndefOr[js.Array[SchemaTestResult]] = js.native
}

object SchemaTestRulesetResponse {
  @scala.inline
  def apply(issues: js.Array[SchemaIssue] = null, testResults: js.Array[SchemaTestResult] = null): SchemaTestRulesetResponse = {
    val __obj = js.Dynamic.literal()
    if (issues != null) __obj.updateDynamic("issues")(issues.asInstanceOf[js.Any])
    if (testResults != null) __obj.updateDynamic("testResults")(testResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTestRulesetResponse]
  }
}

