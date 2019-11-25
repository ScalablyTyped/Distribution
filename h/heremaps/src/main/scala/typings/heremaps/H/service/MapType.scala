package typings.heremaps.H.service

import typings.heremaps.H.map.layer.TileLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A map type is an object holding tile layers corresponding to a map type (e.g. 'normal', 'satellite' or 'terrain'). A map type contains at least a map property which defines the basic
  * map layer for a given map type. In addition it can hold other map layers with the given style, e.g. base, xbase, traffic etc.
  * @property map {H.map.layer.TileLayer} - the basic map tiles with all features and labels
  * @property mapnight {H.map.layer.TileLayer} - the basic map tiles with all features and labels (night mode)
  * @property xbase {H.map.layer.TileLayer=} - map tiles without features and labels
  * @property xbasenight {H.map.layer.TileLayer=} - map tiles without features and labels (night mode)
  * @property base {H.map.layer.TileLayer=} - map tiles without labels
  * @property basenight {H.map.layer.TileLayer=} - map tiles without labels (night mode)
  * @property traffic {H.map.layer.TileLayer=} - map tiles with traffic flow highlighting
  * @property trafficnight {H.map.layer.TileLayer=} - map tiles with traffic flow highlighting (night mode)
  * @property transit {H.map.layer.TileLayer=} - map tiles with public transit lines highlighted
  * @property panorama {H.map.layer.TileLayer=} - map tiles highlighting areas with HERE StreetLevel coverage
  * @property panoramanight {H.map.layer.TileLayer=} - map tiles highlighting areas with HERE StreetLevel coverage (night mode)
  * @property labels {H.map.layer.TileLayer=} - transparent map tiles with labels only
  */
trait MapType extends js.Object {
  var base: js.UndefOr[TileLayer] = js.undefined
  var basenight: js.UndefOr[TileLayer] = js.undefined
  var labels: js.UndefOr[TileLayer] = js.undefined
  var map: TileLayer
  var mapnight: TileLayer
  var panorama: js.UndefOr[TileLayer] = js.undefined
  var panoramanight: js.UndefOr[TileLayer] = js.undefined
  var traffic: js.UndefOr[TileLayer] = js.undefined
  var trafficnight: js.UndefOr[TileLayer] = js.undefined
  var transit: js.UndefOr[TileLayer] = js.undefined
  var xbase: js.UndefOr[TileLayer] = js.undefined
  var xbasenight: js.UndefOr[TileLayer] = js.undefined
}

object MapType {
  @scala.inline
  def apply(
    map: TileLayer,
    mapnight: TileLayer,
    base: TileLayer = null,
    basenight: TileLayer = null,
    labels: TileLayer = null,
    panorama: TileLayer = null,
    panoramanight: TileLayer = null,
    traffic: TileLayer = null,
    trafficnight: TileLayer = null,
    transit: TileLayer = null,
    xbase: TileLayer = null,
    xbasenight: TileLayer = null
  ): MapType = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], mapnight = mapnight.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (basenight != null) __obj.updateDynamic("basenight")(basenight.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (panorama != null) __obj.updateDynamic("panorama")(panorama.asInstanceOf[js.Any])
    if (panoramanight != null) __obj.updateDynamic("panoramanight")(panoramanight.asInstanceOf[js.Any])
    if (traffic != null) __obj.updateDynamic("traffic")(traffic.asInstanceOf[js.Any])
    if (trafficnight != null) __obj.updateDynamic("trafficnight")(trafficnight.asInstanceOf[js.Any])
    if (transit != null) __obj.updateDynamic("transit")(transit.asInstanceOf[js.Any])
    if (xbase != null) __obj.updateDynamic("xbase")(xbase.asInstanceOf[js.Any])
    if (xbasenight != null) __obj.updateDynamic("xbasenight")(xbasenight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapType]
  }
}

