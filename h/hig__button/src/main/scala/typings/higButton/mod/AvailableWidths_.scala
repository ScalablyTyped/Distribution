package typings.higButton.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @hig/button.@hig/button.Widths[keyof @hig/button.@hig/button.Widths] */
/* Rewritten from type alias, can be one of: 
  - typings.higButton.higButtonStrings.shrink
  - typings.higButton.higButtonStrings.grow
*/
trait AvailableWidths_ extends js.Object

object AvailableWidths_ {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def grow: typings.higButton.higButtonStrings.grow = this.cast("grow")
  @scala.inline
  def shrink: typings.higButton.higButtonStrings.shrink = this.cast("shrink")
}

