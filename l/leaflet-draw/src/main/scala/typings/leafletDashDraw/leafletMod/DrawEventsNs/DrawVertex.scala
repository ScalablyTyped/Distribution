package typings.leafletDashDraw.leafletMod.DrawEventsNs

import typings.leaflet.leafletMod.LayerGroup
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawVertex extends Event {
  /**
  			 * List of all layers just being added from the map.
  			 */
  var layers: LayerGroup[_] = js.native
}

