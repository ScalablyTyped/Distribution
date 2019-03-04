package typings
package gulpDashSassLib.gulpDashSassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SassResults extends js.Object {
  var css: java.lang.String
  var map: java.lang.String
  var stats: gulpDashSassLib.Anon_Duration
}

object SassResults {
  @scala.inline
  def apply(css: java.lang.String, map: java.lang.String, stats: gulpDashSassLib.Anon_Duration): SassResults = {
    val __obj = js.Dynamic.literal(css = css, map = map, stats = stats)
  
    __obj.asInstanceOf[SassResults]
  }
}

