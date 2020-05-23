package typings.jestReporters.anon

import typings.jestReporters.typesMod.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllTests extends js.Object {
  var allTests: Double
  var tests: js.Array[Test]
  var total: Double
}

object AllTests {
  @scala.inline
  def apply(allTests: Double, tests: js.Array[Test], total: Double): AllTests = {
    val __obj = js.Dynamic.literal(allTests = allTests.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllTests]
  }
}

