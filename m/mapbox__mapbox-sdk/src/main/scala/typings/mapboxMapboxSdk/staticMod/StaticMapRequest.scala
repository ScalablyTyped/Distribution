package typings.mapboxMapboxSdk.staticMod

import typings.mapboxMapboxSdk.anon.Bearing
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticMapRequest extends js.Object {
  var attribution: js.UndefOr[Boolean] = js.undefined
  var height: Double
  var highRes: js.UndefOr[Boolean] = js.undefined
  var insertOverlayBeforeLayer: js.UndefOr[String] = js.undefined
  var logo: js.UndefOr[Boolean] = js.undefined
  var overlays: js.UndefOr[js.Array[CustomMarkerOverlay | GeoJsonOverlay | PathOverlay]] = js.undefined
  var ownerId: String
  var position: Bearing | auto
  var styleId: String
  var width: Double
}

object StaticMapRequest {
  @scala.inline
  def apply(
    height: Double,
    ownerId: String,
    position: Bearing | auto,
    styleId: String,
    width: Double,
    attribution: js.UndefOr[Boolean] = js.undefined,
    highRes: js.UndefOr[Boolean] = js.undefined,
    insertOverlayBeforeLayer: String = null,
    logo: js.UndefOr[Boolean] = js.undefined,
    overlays: js.Array[CustomMarkerOverlay | GeoJsonOverlay | PathOverlay] = null
  ): StaticMapRequest = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(attribution)) __obj.updateDynamic("attribution")(attribution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highRes)) __obj.updateDynamic("highRes")(highRes.get.asInstanceOf[js.Any])
    if (insertOverlayBeforeLayer != null) __obj.updateDynamic("insertOverlayBeforeLayer")(insertOverlayBeforeLayer.asInstanceOf[js.Any])
    if (!js.isUndefined(logo)) __obj.updateDynamic("logo")(logo.get.asInstanceOf[js.Any])
    if (overlays != null) __obj.updateDynamic("overlays")(overlays.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticMapRequest]
  }
}

