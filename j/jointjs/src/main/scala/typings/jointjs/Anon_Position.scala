package typings.jointjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Position extends js.Object {
  var position: js.UndefOr[js.Any] = js.undefined
  var size: js.UndefOr[js.Any] = js.undefined
}

object Anon_Position {
  @scala.inline
  def apply(position: js.Any = null, size: js.Any = null): Anon_Position = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_Position]
  }
}

