package typings.leafletDashDraw.leafletMod.DrawEventsNs

import typings.leaflet.leafletMod.LayerGroup
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Triggered when layers have been removed (and saved) from the FeatureGroup.
		 */
@js.native
trait Deleted extends Event {
  /**
  			 * List of all layers just removed from the map.
  			 */
  var layers: LayerGroup[_] = js.native
}

