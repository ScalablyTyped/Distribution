package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapTypeControlOptions extends js.Object {
  /** IDs of map types to show in the control. */
  var mapTypeIds: js.UndefOr[js.Array[MapTypeId | java.lang.String]] = js.undefined
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
    mapTypeIds: js.Array[MapTypeId | java.lang.String] = null,
    position: ControlPosition = null,
    style: MapTypeControlStyle = null
  ): MapTypeControlOptions = {
    val __obj = js.Dynamic.literal()
    if (mapTypeIds != null) __obj.updateDynamic("mapTypeIds")(mapTypeIds)
    if (position != null) __obj.updateDynamic("position")(position)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[MapTypeControlOptions]
  }
}

