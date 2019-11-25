package typings.leaflet.leafletMod.Control

import typings.leaflet.leafletMod.ControlOptions
import typings.leaflet.leafletMod.ControlPosition
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

