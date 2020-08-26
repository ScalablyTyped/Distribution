package typings.jestCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends js.Object {
  var roots: Double = js.native
  var testMatch: Double = js.native
  var testPathIgnorePatterns: Double = js.native
  var testPathPattern: js.UndefOr[Double] = js.native
  var testRegex: Double = js.native
}

object Stats {
  @scala.inline
  def apply(roots: Double, testMatch: Double, testPathIgnorePatterns: Double, testRegex: Double): Stats = {
    val __obj = js.Dynamic.literal(roots = roots.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any], testPathIgnorePatterns = testPathIgnorePatterns.asInstanceOf[js.Any], testRegex = testRegex.asInstanceOf[js.Any])
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
    def setRoots(value: Double): Self = this.set("roots", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestMatch(value: Double): Self = this.set("testMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestPathIgnorePatterns(value: Double): Self = this.set("testPathIgnorePatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestRegex(value: Double): Self = this.set("testRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestPathPattern(value: Double): Self = this.set("testPathPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestPathPattern: Self = this.set("testPathPattern", js.undefined)
  }
  
}

