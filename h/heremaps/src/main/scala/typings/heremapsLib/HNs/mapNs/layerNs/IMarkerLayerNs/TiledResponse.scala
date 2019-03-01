package typings
package heremapsLib.HNs.mapNs.layerNs.IMarkerLayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This type represents a response object returned by the H.map.layer.IMarkerLayer#requestMarkers function.
  * @property number {number} - of returned tiles
  * @property requested {number} - number of requested tiles
  * @property objects {Array<H.map.AbstractMarker>} - the marker objects within requested tiled area
  */
trait TiledResponse extends js.Object {
  var number: scala.Double
  var objects: js.Array[heremapsLib.HNs.mapNs.AbstractMarker]
  var requested: scala.Double
}

object TiledResponse {
  @scala.inline
  def apply(
    number: scala.Double,
    objects: js.Array[heremapsLib.HNs.mapNs.AbstractMarker],
    requested: scala.Double
  ): TiledResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("number")(number)
    __obj.updateDynamic("objects")(objects)
    __obj.updateDynamic("requested")(requested)
    __obj.asInstanceOf[TiledResponse]
  }
}

