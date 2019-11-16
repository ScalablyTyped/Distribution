package typings.atJestReporters

import typings.atJestReporters.buildTypesMod.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllTests extends js.Object {
  var allTests: Double
  var tests: js.Array[Test]
  var total: Double
}

object Anon_AllTests {
  @scala.inline
  def apply(allTests: Double, tests: js.Array[Test], total: Double): Anon_AllTests = {
    val __obj = js.Dynamic.literal(allTests = allTests, tests = tests, total = total)
  
    __obj.asInstanceOf[Anon_AllTests]
  }
}

