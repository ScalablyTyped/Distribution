package typings
package heremapsLib.HNs.mapNs.layerNs.ObjectLayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
                 * A response object returned by the H.map.layer.ObjectLayer#requestOverlays function.
                 * @property total {number} - The total number of overlays within the requested bounds, inclusive overlays which are not ready loaded yet
                 * @property overlays {Array<H.map.Overlay>} - A list all overlays which are ready to render
                 */

trait OverlaysResponse extends js.Object {
  var overlays: js.Array[heremapsLib.HNs.mapNs.Overlay]
  var total: scala.Double
}

