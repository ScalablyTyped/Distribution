package typings.jestCore.searchSourceMod

import typings.jestCore.typesMod.Stats
import typings.jestRunner.mod.Test
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResult extends js.Object {
  var collectCoverageFrom: js.UndefOr[Set[String]] = js.native
  var noSCM: js.UndefOr[Boolean] = js.native
  var stats: js.UndefOr[Stats] = js.native
  var tests: js.Array[Test] = js.native
  var total: js.UndefOr[Double] = js.native
}

object SearchResult {
  @scala.inline
  def apply(tests: js.Array[Test]): SearchResult = {
    val __obj = js.Dynamic.literal(tests = tests.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  @scala.inline
  implicit class SearchResultOps[Self <: SearchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTestsVarargs(value: Test*): Self = this.set("tests", js.Array(value :_*))
    @scala.inline
    def setTests(value: js.Array[Test]): Self = this.set("tests", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollectCoverageFrom(value: Set[String]): Self = this.set("collectCoverageFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectCoverageFrom: Self = this.set("collectCoverageFrom", js.undefined)
    @scala.inline
    def setNoSCM(value: Boolean): Self = this.set("noSCM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSCM: Self = this.set("noSCM", js.undefined)
    @scala.inline
    def setStats(value: Stats): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
  
}

