package typings.jestCore.anon

import typings.jestRunner.mod.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var allTests: Double
  var stats: js.UndefOr[typings.jestCore.typesMod.Stats] = js.undefined
  var tests: js.Array[Test]
  var total: js.UndefOr[Double] = js.undefined
}

object Stats {
  @scala.inline
  def apply(
    allTests: Double,
    tests: js.Array[Test],
    stats: typings.jestCore.typesMod.Stats = null,
    total: js.UndefOr[Double] = js.undefined
  ): Stats = {
    val __obj = js.Dynamic.literal(allTests = allTests.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

