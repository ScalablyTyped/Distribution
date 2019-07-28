package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoOverlayOptions extends ImageOverlayOptions {
  /** Whether the video starts playing automatically when loaded. */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  /** Whether the video will save aspect ratio after the projection. */
  var keepAspectRatio: js.UndefOr[Boolean] = js.undefined
  /** Whether the video will loop back to the beginning when played. */
  var loop: js.UndefOr[Boolean] = js.undefined
}

object VideoOverlayOptions {
  @scala.inline
  def apply(
    alt: String = null,
    attribution: String = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    crossOrigin: CrossOrigin = null,
    errorOverlayUrl: String = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    keepAspectRatio: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null,
    pane: String = null,
    zIndex: Int | Double = null
  ): VideoOverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (!js.isUndefined(bubblingMouseEvents)) __obj.updateDynamic("bubblingMouseEvents")(bubblingMouseEvents)
    if (className != null) __obj.updateDynamic("className")(className)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (errorOverlayUrl != null) __obj.updateDynamic("errorOverlayUrl")(errorOverlayUrl)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (!js.isUndefined(keepAspectRatio)) __obj.updateDynamic("keepAspectRatio")(keepAspectRatio)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoOverlayOptions]
  }
}

