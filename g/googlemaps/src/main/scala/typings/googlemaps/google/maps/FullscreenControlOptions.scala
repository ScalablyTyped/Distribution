package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for the rendering of the fullscreen control. */
trait FullscreenControlOptions extends js.Object {
  /**
    * Position id. Used to specify the position of the control on the map.
    * The default position is RIGHT_TOP.
    */
  var position: js.UndefOr[ControlPosition] = js.undefined
}

object FullscreenControlOptions {
  @scala.inline
  def apply(position: ControlPosition = null): FullscreenControlOptions = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[FullscreenControlOptions]
  }
}

