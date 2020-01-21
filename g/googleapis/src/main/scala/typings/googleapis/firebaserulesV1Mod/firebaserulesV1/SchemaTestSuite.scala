package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `TestSuite` is a collection of `TestCase` instances that validate the
  * logical correctness of a `Ruleset`. The `TestSuite` may be referenced
  * in-line within a `TestRuleset` invocation or as part of a `Release` object
  * as a pre-release check.
  */
@js.native
trait SchemaTestSuite extends js.Object {
  /**
    * Collection of test cases associated with the `TestSuite`.
    */
  var testCases: js.UndefOr[js.Array[SchemaTestCase]] = js.native
}

object SchemaTestSuite {
  @scala.inline
  def apply(testCases: js.Array[SchemaTestCase] = null): SchemaTestSuite = {
    val __obj = js.Dynamic.literal()
    if (testCases != null) __obj.updateDynamic("testCases")(testCases.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTestSuite]
  }
}

