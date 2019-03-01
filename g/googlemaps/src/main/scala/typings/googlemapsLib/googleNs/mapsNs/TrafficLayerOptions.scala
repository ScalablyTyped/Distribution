package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficLayerOptions extends js.Object {
  var autoRefresh: js.UndefOr[scala.Boolean] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
}

object TrafficLayerOptions {
  @scala.inline
  def apply(autoRefresh: js.UndefOr[scala.Boolean] = js.undefined, map: Map = null): TrafficLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRefresh)) __obj.updateDynamic("autoRefresh")(autoRefresh)
    if (map != null) __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[TrafficLayerOptions]
  }
}

