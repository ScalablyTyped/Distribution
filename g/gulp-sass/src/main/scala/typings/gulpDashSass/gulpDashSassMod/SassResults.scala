package typings.gulpDashSass.gulpDashSassMod

import typings.gulpDashSass.Anon_Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SassResults extends js.Object {
  var css: String
  var map: String
  var stats: Anon_Duration
}

object SassResults {
  @scala.inline
  def apply(css: String, map: String, stats: Anon_Duration): SassResults = {
    val __obj = js.Dynamic.literal(css = css, map = map, stats = stats)
  
    __obj.asInstanceOf[SassResults]
  }
}

