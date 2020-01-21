package typings.jestCore.searchSourceMod

import typings.jestCore.typesMod.Stats
import typings.jestRunner.mod.Test
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
    val __obj = js.Dynamic.literal(tests = tests.asInstanceOf[js.Any])
    if (collectCoverageFrom != null) __obj.updateDynamic("collectCoverageFrom")(collectCoverageFrom.asInstanceOf[js.Any])
    if (!js.isUndefined(noSCM)) __obj.updateDynamic("noSCM")(noSCM.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
}

