package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorEvent
  extends MapboxEvent[js.UndefOr[scala.Nothing]] {
  var error: stdLib.Error
  @JSName("type")
  var type_ErrorEvent: mapboxDashGlLib.mapboxDashGlLibStrings.error
}

object ErrorEvent {
  @scala.inline
  def apply(
    error: stdLib.Error,
    target: Map,
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.error,
    originalEvent: js.UndefOr[scala.Nothing] = js.undefined
  ): ErrorEvent = {
    val __obj = js.Dynamic.literal(error = error, target = target)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(originalEvent)) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[ErrorEvent]
  }
}

