package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlOptions extends js.Object {
  var position: js.UndefOr[ControlPosition] = js.undefined
}

object ControlOptions {
  @scala.inline
  def apply(position: ControlPosition = null): ControlOptions = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[ControlOptions]
  }
}

