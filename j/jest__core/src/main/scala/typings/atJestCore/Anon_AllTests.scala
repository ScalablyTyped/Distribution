package typings.atJestCore

import typings.atJestCore.buildTypesMod.Stats
import typings.jestDashRunner.jestDashRunnerMod.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllTests extends js.Object {
  var allTests: Double
  var stats: js.UndefOr[Stats] = js.undefined
  var tests: js.Array[Test]
  var total: js.UndefOr[Double] = js.undefined
}

object Anon_AllTests {
  @scala.inline
  def apply(allTests: Double, tests: js.Array[Test], stats: Stats = null, total: Int | Double = null): Anon_AllTests = {
    val __obj = js.Dynamic.literal(allTests = allTests.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllTests]
  }
}

