package typings.leaflet.leafletMod.Control

import typings.leaflet.leafletMod.ControlOptions
import typings.leaflet.leafletMod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomOptions extends ControlOptions {
  var zoomInText: js.UndefOr[String] = js.undefined
  var zoomInTitle: js.UndefOr[String] = js.undefined
  var zoomOutText: js.UndefOr[String] = js.undefined
  var zoomOutTitle: js.UndefOr[String] = js.undefined
}

object ZoomOptions {
  @scala.inline
  def apply(
    position: ControlPosition = null,
    zoomInText: String = null,
    zoomInTitle: String = null,
    zoomOutText: String = null,
    zoomOutTitle: String = null
  ): ZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (zoomInText != null) __obj.updateDynamic("zoomInText")(zoomInText.asInstanceOf[js.Any])
    if (zoomInTitle != null) __obj.updateDynamic("zoomInTitle")(zoomInTitle.asInstanceOf[js.Any])
    if (zoomOutText != null) __obj.updateDynamic("zoomOutText")(zoomOutText.asInstanceOf[js.Any])
    if (zoomOutTitle != null) __obj.updateDynamic("zoomOutTitle")(zoomOutTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomOptions]
  }
}

