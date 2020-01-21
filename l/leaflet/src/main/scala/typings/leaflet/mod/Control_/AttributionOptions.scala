package typings.leaflet.mod.Control_

import typings.leaflet.mod.ControlOptions
import typings.leaflet.mod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributionOptions extends ControlOptions {
  var prefix: js.UndefOr[String | Boolean] = js.undefined
}

object AttributionOptions {
  @scala.inline
  def apply(position: ControlPosition = null, prefix: String | Boolean = null): AttributionOptions = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributionOptions]
  }
}

