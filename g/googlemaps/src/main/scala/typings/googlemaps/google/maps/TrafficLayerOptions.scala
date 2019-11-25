package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficLayerOptions extends js.Object {
  var autoRefresh: js.UndefOr[Boolean] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
}

object TrafficLayerOptions {
  @scala.inline
  def apply(autoRefresh: js.UndefOr[Boolean] = js.undefined, map: Map = null): TrafficLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRefresh)) __obj.updateDynamic("autoRefresh")(autoRefresh.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficLayerOptions]
  }
}

