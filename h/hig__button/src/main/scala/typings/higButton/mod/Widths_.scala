package typings.higButton.mod

import typings.higButton.higButtonStrings.grow
import typings.higButton.higButtonStrings.shrink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Widths_ extends js.Object {
  var GROW: grow
  var SHRINK: shrink
}

object Widths_ {
  @scala.inline
  def apply(GROW: grow, SHRINK: shrink): Widths_ = {
    val __obj = js.Dynamic.literal(GROW = GROW.asInstanceOf[js.Any], SHRINK = SHRINK.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Widths_]
  }
}

