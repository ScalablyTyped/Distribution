package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FusionTablesLayerOptions extends js.Object {
  var clickable: js.UndefOr[scala.Boolean] = js.undefined
  var heatmap: js.UndefOr[FusionTablesHeatmap] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var query: js.UndefOr[FusionTablesQuery] = js.undefined
  var styles: js.UndefOr[js.Array[FusionTablesStyle]] = js.undefined
  var suppressInfoWindows: js.UndefOr[scala.Boolean] = js.undefined
}

object FusionTablesLayerOptions {
  @scala.inline
  def apply(
    clickable: js.UndefOr[scala.Boolean] = js.undefined,
    heatmap: FusionTablesHeatmap = null,
    map: Map = null,
    query: FusionTablesQuery = null,
    styles: js.Array[FusionTablesStyle] = null,
    suppressInfoWindows: js.UndefOr[scala.Boolean] = js.undefined
  ): FusionTablesLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (heatmap != null) __obj.updateDynamic("heatmap")(heatmap)
    if (map != null) __obj.updateDynamic("map")(map)
    if (query != null) __obj.updateDynamic("query")(query)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (!js.isUndefined(suppressInfoWindows)) __obj.updateDynamic("suppressInfoWindows")(suppressInfoWindows)
    __obj.asInstanceOf[FusionTablesLayerOptions]
  }
}

