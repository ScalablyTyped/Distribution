package typings.heredatalens.HNs.datalensNs.HeatmapLayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sets the bandwidth for a given zoom level and uses this to calculate the increment or decrement of the bandwidth at other zoom levels
  * This object defines the behavior of the bandwidth value across all zoom levels, initialized by a reference zoom level and its value at that level.
  * The default behavior with zoomIncrementFactor = 1 doubles the bandwidth with every increasing zoom level and halves it on every decrease in zoom level.
  * For example, a bandwidth of 10@zoom1 turns to 20@zoom2 and 5@zoom0. A zoomIncrementFactor of 0 effectively equals the bandwidth number, ignoring the provided zoom level.
  * A zoomIncrementFactor of 0.5 mean a bandwidth increase of 50% compared to a factor of 1. So a bandwidth of 10@zoom1 computes to 15@zoom2.
  */
trait BandwidthStop extends js.Object {
  var value: Double
  var zoom: Double
  var zoomIncrementFactor: js.UndefOr[Double] = js.undefined
}

object BandwidthStop {
  @scala.inline
  def apply(value: Double, zoom: Double, zoomIncrementFactor: Int | Double = null): BandwidthStop = {
    val __obj = js.Dynamic.literal(value = value, zoom = zoom)
    if (zoomIncrementFactor != null) __obj.updateDynamic("zoomIncrementFactor")(zoomIncrementFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BandwidthStop]
  }
}

