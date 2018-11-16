package typings
package heremapsLib.HNs.serviceNs

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
  var base: js.UndefOr[heremapsLib.HNs.mapNs.layerNs.TileLayer] = js.undefined
  var basenight: js.UndefOr[heremapsLib.HNs.mapNs.layerNs.TileLayer] = js.undefined
  var labels: js.UndefOr[heremapsLib.HNs.mapNs.layerNs.TileLayer] = js.undefined
  var map: heremapsLib.HNs.mapNs.layerNs.TileLayer
  var mapnight: heremapsLib.HNs.mapNs.layerNs.TileLayer
  var panorama: js.UndefOr[heremapsLib.HNs.mapNs.layerNs.TileLayer] = js.undefined
  var panoramanight: js.UndefOr[heremapsLib.HNs.mapNs.layerNs.TileLayer] = js.undefined
  var traffic: js.UndefOr[heremapsLib.HNs.mapNs.layerNs.TileLayer] = js.undefined
  var trafficnight: js.UndefOr[heremapsLib.HNs.mapNs.layerNs.TileLayer] = js.undefined
  var transit: js.UndefOr[heremapsLib.HNs.mapNs.layerNs.TileLayer] = js.undefined
  var xbase: js.UndefOr[heremapsLib.HNs.mapNs.layerNs.TileLayer] = js.undefined
  var xbasenight: js.UndefOr[heremapsLib.HNs.mapNs.layerNs.TileLayer] = js.undefined
}

