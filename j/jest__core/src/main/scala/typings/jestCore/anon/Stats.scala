package typings.jestCore.anon

import typings.jestRunner.mod.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends js.Object {
  var allTests: Double = js.native
  var stats: js.UndefOr[typings.jestCore.typesMod.Stats] = js.native
  var tests: js.Array[Test] = js.native
  var total: js.UndefOr[Double] = js.native
}

object Stats {
  @scala.inline
  def apply(allTests: Double, tests: js.Array[Test]): Stats = {
    val __obj = js.Dynamic.literal(allTests = allTests.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
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
    def setAllTests(value: Double): Self = this.set("allTests", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestsVarargs(value: Test*): Self = this.set("tests", js.Array(value :_*))
    @scala.inline
    def setTests(value: js.Array[Test]): Self = this.set("tests", value.asInstanceOf[js.Any])
    @scala.inline
    def setStats(value: typings.jestCore.typesMod.Stats): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
  
}

