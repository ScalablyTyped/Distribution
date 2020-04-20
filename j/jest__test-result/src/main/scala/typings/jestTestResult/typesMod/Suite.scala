package typings.jestTestResult.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suite extends js.Object {
  var suites: js.Array[Suite]
  var tests: js.Array[AssertionResult]
  var title: String
}

object Suite {
  @scala.inline
  def apply(suites: js.Array[Suite], tests: js.Array[AssertionResult], title: String): Suite = {
    val __obj = js.Dynamic.literal(suites = suites.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suite]
  }
}

