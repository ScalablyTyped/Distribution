package typings
package heremapsLib.HNs.mapNs.providerNs.MarkerTileProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options which are used to initialize the MarkerTileProvider object.
  * @property min {number=} - The minimal supported zoom level, default is 0
  * @property max {number=} - The maximal supported zoom level, default is 22
  * @property requestData {function(number, number, number, function(Array<H.map.AbstractMarker>), Function): H.util.ICancelable} - function that fetches marker data and creates array
  * of H.map.AbstractMarker that is passed success callback, if function fails to fetch data onError callback must be called
  * @property providesDomMarkers {boolean=} - indicates if markers provided are of type H.map.DomMarker or H.map.Marker, default is H.map.Marker
  */
trait Options extends js.Object {
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var providesDomMarkers: js.UndefOr[scala.Boolean] = js.undefined
  def requestData(
    n1: scala.Double,
    n2: scala.Double,
    n3: scala.Double,
    markerCallback: js.Function1[/* markers */ js.Array[heremapsLib.HNs.mapNs.AbstractMarker], scala.Unit],
    f: js.Function0[scala.Unit]
  ): heremapsLib.HNs.utilNs.ICancelable
}

