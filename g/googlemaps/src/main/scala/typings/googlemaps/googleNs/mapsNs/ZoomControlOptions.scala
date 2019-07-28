package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for the rendering of the zoom control. */
trait ZoomControlOptions extends js.Object {
  /**
    * Position id. Used to specify the position of the control on the map.
    * The default position is TOP_LEFT.
    */
  var position: js.UndefOr[ControlPosition] = js.undefined
  var style: js.UndefOr[ZoomControlStyle] = js.undefined
}

object ZoomControlOptions {
  @scala.inline
  def apply(position: ControlPosition = null, style: ZoomControlStyle = null): ZoomControlOptions = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ZoomControlOptions]
  }
}

