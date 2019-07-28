package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageOverlayOptions extends InteractiveLayerOptions {
  var alt: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[CrossOrigin] = js.undefined
  var errorOverlayUrl: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ImageOverlayOptions {
  @scala.inline
  def apply(
    alt: String = null,
    attribution: String = null,
    bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    crossOrigin: CrossOrigin = null,
    errorOverlayUrl: String = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null,
    pane: String = null,
    zIndex: Int | Double = null
  ): ImageOverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (!js.isUndefined(bubblingMouseEvents)) __obj.updateDynamic("bubblingMouseEvents")(bubblingMouseEvents)
    if (className != null) __obj.updateDynamic("className")(className)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (errorOverlayUrl != null) __obj.updateDynamic("errorOverlayUrl")(errorOverlayUrl)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOverlayOptions]
  }
}

