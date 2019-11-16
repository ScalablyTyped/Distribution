package typings.atJestCore.buildSearchSourceMod

import typings.atJestCore.buildTypesMod.Stats
import typings.jestDashRunner.jestDashRunnerMod.Test
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult extends js.Object {
  var collectCoverageFrom: js.UndefOr[Set[String]] = js.undefined
  var noSCM: js.UndefOr[Boolean] = js.undefined
  var stats: js.UndefOr[Stats] = js.undefined
  var tests: js.Array[Test]
  var total: js.UndefOr[Double] = js.undefined
}

object SearchResult {
  @scala.inline
  def apply(
    tests: js.Array[Test],
    collectCoverageFrom: Set[String] = null,
    noSCM: js.UndefOr[Boolean] = js.undefined,
    stats: Stats = null,
    total: Int | Double = null
  ): SearchResult = {
    val __obj = js.Dynamic.literal(tests = tests)
    if (collectCoverageFrom != null) __obj.updateDynamic("collectCoverageFrom")(collectCoverageFrom)
    if (!js.isUndefined(noSCM)) __obj.updateDynamic("noSCM")(noSCM)
    if (stats != null) __obj.updateDynamic("stats")(stats)
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
}

