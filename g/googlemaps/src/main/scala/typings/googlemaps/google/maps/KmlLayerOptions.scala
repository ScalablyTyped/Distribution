package typings.googlemaps.google.maps

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlLayerOptions extends js.Object {
  var clickable: js.UndefOr[Boolean] = js.undefined
  var map: js.UndefOr[Map[Element]] = js.undefined
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
    map: Map[Element] = null,
    preserveViewport: js.UndefOr[Boolean] = js.undefined,
    screenOverlays: js.UndefOr[Boolean] = js.undefined,
    suppressInfoWindows: js.UndefOr[Boolean] = js.undefined,
    url: String = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): KmlLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.get.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveViewport)) __obj.updateDynamic("preserveViewport")(preserveViewport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenOverlays)) __obj.updateDynamic("screenOverlays")(screenOverlays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressInfoWindows)) __obj.updateDynamic("suppressInfoWindows")(suppressInfoWindows.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KmlLayerOptions]
  }
}

