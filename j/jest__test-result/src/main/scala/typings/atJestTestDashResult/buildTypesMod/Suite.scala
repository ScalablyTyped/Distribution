package typings.atJestTestDashResult.buildTypesMod

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
    val __obj = js.Dynamic.literal(suites = suites, tests = tests, title = title)
  
    __obj.asInstanceOf[Suite]
  }
}

