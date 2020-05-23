package typings.googlemaps.google.maps

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO find source documentation
trait FusionTablesLayerOptions extends js.Object {
  var clickable: js.UndefOr[Boolean] = js.undefined
  var heatmap: js.UndefOr[FusionTablesHeatmap] = js.undefined
  var map: js.UndefOr[Map[Element]] = js.undefined
  var query: js.UndefOr[FusionTablesQuery] = js.undefined
  var styles: js.UndefOr[js.Array[FusionTablesStyle]] = js.undefined
  var suppressInfoWindows: js.UndefOr[Boolean] = js.undefined
}

object FusionTablesLayerOptions {
  @scala.inline
  def apply(
    clickable: js.UndefOr[Boolean] = js.undefined,
    heatmap: FusionTablesHeatmap = null,
    map: Map[Element] = null,
    query: FusionTablesQuery = null,
    styles: js.Array[FusionTablesStyle] = null,
    suppressInfoWindows: js.UndefOr[Boolean] = js.undefined
  ): FusionTablesLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.get.asInstanceOf[js.Any])
    if (heatmap != null) __obj.updateDynamic("heatmap")(heatmap.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressInfoWindows)) __obj.updateDynamic("suppressInfoWindows")(suppressInfoWindows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusionTablesLayerOptions]
  }
}

