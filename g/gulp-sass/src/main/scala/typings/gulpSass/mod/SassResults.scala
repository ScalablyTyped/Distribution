package typings.gulpSass.mod

import typings.gulpSass.anon.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SassResults extends js.Object {
  var css: String
  var map: String
  var stats: Duration
}

object SassResults {
  @scala.inline
  def apply(css: String, map: String, stats: Duration): SassResults = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[SassResults]
  }
}

