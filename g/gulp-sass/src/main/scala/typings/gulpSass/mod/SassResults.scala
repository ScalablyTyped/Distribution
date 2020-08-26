package typings.gulpSass.mod

import typings.gulpSass.anon.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SassResults extends js.Object {
  var css: String = js.native
  var map: String = js.native
  var stats: Duration = js.native
}

object SassResults {
  @scala.inline
  def apply(css: String, map: String, stats: Duration): SassResults = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[SassResults]
  }
  @scala.inline
  implicit class SassResultsOps[Self <: SassResults] (val x: Self) extends AnyVal {
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
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: String): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setStats(value: Duration): Self = this.set("stats", value.asInstanceOf[js.Any])
  }
  
}

