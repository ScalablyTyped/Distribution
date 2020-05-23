package typings.jestWatcher.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait End extends js.Object {
  var end: Double
  var index: Double
  var start: Double
}

object End {
  @scala.inline
  def apply(end: Double, index: Double, start: Double): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
}

