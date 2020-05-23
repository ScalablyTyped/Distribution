package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for the rendering of the map type control. */
trait MapTypeControlOptions extends js.Object {
  /** IDs of map types to show in the control. */
  var mapTypeIds: js.UndefOr[js.Array[MapTypeId | String]] = js.undefined
  /**
    * Position id. Used to specify the position of the control on the map.
    * The default position is TOP_RIGHT.
    */
  var position: js.UndefOr[ControlPosition] = js.undefined
  /** Style id. Used to select what style of map type control to display. */
  var style: js.UndefOr[MapTypeControlStyle] = js.undefined
}

object MapTypeControlOptions {
  @scala.inline
  def apply(
    mapTypeIds: js.Array[MapTypeId | String] = null,
    position: ControlPosition = null,
    style: MapTypeControlStyle = null
  ): MapTypeControlOptions = {
    val __obj = js.Dynamic.literal()
    if (mapTypeIds != null) __obj.updateDynamic("mapTypeIds")(mapTypeIds.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapTypeControlOptions]
  }
}

