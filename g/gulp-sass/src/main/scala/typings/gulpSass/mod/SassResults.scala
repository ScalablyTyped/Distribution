package typings.gulpSass.mod

import typings.gulpSass.AnonDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SassResults extends js.Object {
  var css: String
  var map: String
  var stats: AnonDuration
}

object SassResults {
  @scala.inline
  def apply(css: String, map: String, stats: AnonDuration): SassResults = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SassResults]
  }
}

