package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlLayerOptions extends js.Object {
  var clickable: js.UndefOr[Boolean] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var preserveViewport: js.UndefOr[Boolean] = js.undefined
  var screenOverlays: js.UndefOr[Boolean] = js.undefined
  var suppressInfoWindows: js.UndefOr[Boolean] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object KmlLayerOptions {
  @scala.inline
  def apply(
    clickable: js.UndefOr[Boolean] = js.undefined,
    map: Map = null,
    preserveViewport: js.UndefOr[Boolean] = js.undefined,
    screenOverlays: js.UndefOr[Boolean] = js.undefined,
    suppressInfoWindows: js.UndefOr[Boolean] = js.undefined,
    url: String = null,
    zIndex: Int | Double = null
  ): KmlLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveViewport)) __obj.updateDynamic("preserveViewport")(preserveViewport.asInstanceOf[js.Any])
    if (!js.isUndefined(screenOverlays)) __obj.updateDynamic("screenOverlays")(screenOverlays.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressInfoWindows)) __obj.updateDynamic("suppressInfoWindows")(suppressInfoWindows.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[KmlLayerOptions]
  }
}

