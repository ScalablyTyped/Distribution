package typings.heremaps.H.service

import typings.heremaps.H.map.layer.MarkerTileLayer
import typings.heremaps.H.map.layer.TileLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A map type is an object holding tile layers corresponding to a map type (e.g. 'normal', 'satellite' or 'terrain'). A map type contains at least a map property which defines the basic
  * map layer for a given map type. In addition it can hold other map layers with the given style, e.g. base, xbase, traffic etc.
  * {@link https://developer.here.com/documentation/maps/content/api_reference/H.service.html#.MapType}
  * @property map {H.map.layer.TileLayer} - the basic map tiles with all features and labels
  * @property mapnight {H.map.layer.TileLayer} - the basic map tiles with all features and labels (night mode)
  * @property xbase {H.map.layer.TileLayer=} - map tiles without features and labels
  * @property xbasenight {H.map.layer.TileLayer=} - map tiles without features and labels (night mode)
  * @property base {H.map.layer.TileLayer=} - map tiles without labels
  * @property basenight {H.map.layer.TileLayer=} - map tiles without labels (night mode)
  * @property trafficincidents {H.map.layer.TileLayer=} - map tiles with traffic flow highlighting
  * @property transit {H.map.layer.TileLayer=} - map tiles with public transit lines highlighted
  * @property labels {H.map.layer.TileLayer=} - transparent map tiles with labels only
  */
trait MapType extends js.Object {
  var base: TileLayer
  var basenight: js.UndefOr[TileLayer | Null] = js.undefined
  var labels: TileLayer
  var map: TileLayer
  var mapnight: js.UndefOr[TileLayer | Null] = js.undefined
  var trafficincidents: js.UndefOr[MarkerTileLayer | Null] = js.undefined
  var transit: js.UndefOr[TileLayer] = js.undefined
  var xbase: TileLayer
  var xbasenight: js.UndefOr[TileLayer | Null] = js.undefined
}

object MapType {
  @scala.inline
  def apply(
    base: TileLayer,
    labels: TileLayer,
    map: TileLayer,
    xbase: TileLayer,
    basenight: TileLayer = null,
    mapnight: TileLayer = null,
    trafficincidents: MarkerTileLayer = null,
    transit: TileLayer = null,
    xbasenight: TileLayer = null
  ): MapType = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], xbase = xbase.asInstanceOf[js.Any])
    if (basenight != null) __obj.updateDynamic("basenight")(basenight.asInstanceOf[js.Any])
    if (mapnight != null) __obj.updateDynamic("mapnight")(mapnight.asInstanceOf[js.Any])
    if (trafficincidents != null) __obj.updateDynamic("trafficincidents")(trafficincidents.asInstanceOf[js.Any])
    if (transit != null) __obj.updateDynamic("transit")(transit.asInstanceOf[js.Any])
    if (xbasenight != null) __obj.updateDynamic("xbasenight")(xbasenight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapType]
  }
}

