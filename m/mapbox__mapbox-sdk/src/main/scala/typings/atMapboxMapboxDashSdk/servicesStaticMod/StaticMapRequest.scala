package typings.atMapboxMapboxDashSdk.servicesStaticMod

import typings.atMapboxMapboxDashSdk.Anon_Auto
import typings.atMapboxMapboxDashSdk.atMapboxMapboxDashSdkStrings.auto
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
  var position: Anon_Auto | auto
  var styleId: String
  var width: Double
}

object StaticMapRequest {
  @scala.inline
  def apply(
    height: Double,
    ownerId: String,
    position: Anon_Auto | auto,
    styleId: String,
    width: Double,
    attribution: js.UndefOr[Boolean] = js.undefined,
    highRes: js.UndefOr[Boolean] = js.undefined,
    insertOverlayBeforeLayer: String = null,
    logo: js.UndefOr[Boolean] = js.undefined,
    overlays: js.Array[CustomMarkerOverlay | GeoJsonOverlay | PathOverlay] = null
  ): StaticMapRequest = {
    val __obj = js.Dynamic.literal(height = height, ownerId = ownerId, position = position.asInstanceOf[js.Any], styleId = styleId, width = width)
    if (!js.isUndefined(attribution)) __obj.updateDynamic("attribution")(attribution)
    if (!js.isUndefined(highRes)) __obj.updateDynamic("highRes")(highRes)
    if (insertOverlayBeforeLayer != null) __obj.updateDynamic("insertOverlayBeforeLayer")(insertOverlayBeforeLayer)
    if (!js.isUndefined(logo)) __obj.updateDynamic("logo")(logo)
    if (overlays != null) __obj.updateDynamic("overlays")(overlays)
    __obj.asInstanceOf[StaticMapRequest]
  }
}

