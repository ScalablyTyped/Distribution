package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapStyleDataEvent
  extends MapboxEvent[js.UndefOr[scala.Nothing]]
     with MapDataEvent {
  var dataType: mapboxDashGlLib.mapboxDashGlLibStrings.style
}

object MapStyleDataEvent {
  @scala.inline
  def apply(
    dataType: mapboxDashGlLib.mapboxDashGlLibStrings.style,
    target: Map,
    `type`: java.lang.String,
    originalEvent: js.UndefOr[scala.Nothing] = js.undefined
  ): MapStyleDataEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("dataType")(dataType)
    __obj.updateDynamic("target")(target)
    if (!js.isUndefined(originalEvent)) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[MapStyleDataEvent]
  }
}

