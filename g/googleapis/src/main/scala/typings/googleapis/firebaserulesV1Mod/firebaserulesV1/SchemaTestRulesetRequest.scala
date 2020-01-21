package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for FirebaseRulesService.TestRuleset.
  */
@js.native
trait SchemaTestRulesetRequest extends js.Object {
  /**
    * Optional `Source` to be checked for correctness.  This field must not be
    * set when the resource name refers to a `Ruleset`.
    */
  var source: js.UndefOr[SchemaSource] = js.native
  /**
    * Inline `TestSuite` to run.
    */
  var testSuite: js.UndefOr[SchemaTestSuite] = js.native
}

object SchemaTestRulesetRequest {
  @scala.inline
  def apply(source: SchemaSource = null, testSuite: SchemaTestSuite = null): SchemaTestRulesetRequest = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (testSuite != null) __obj.updateDynamic("testSuite")(testSuite.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTestRulesetRequest]
  }
}

