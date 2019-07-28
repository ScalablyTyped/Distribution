package typings.heremaps.HNs.mapNs.layerNs.IMarkerLayerNs

import typings.heremaps.HNs.mapNs.AbstractMarker
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
  var number: Double
  var objects: js.Array[AbstractMarker]
  var requested: Double
}

object TiledResponse {
  @scala.inline
  def apply(number: Double, objects: js.Array[AbstractMarker], requested: Double): TiledResponse = {
    val __obj = js.Dynamic.literal(number = number, objects = objects, requested = requested)
  
    __obj.asInstanceOf[TiledResponse]
  }
}

