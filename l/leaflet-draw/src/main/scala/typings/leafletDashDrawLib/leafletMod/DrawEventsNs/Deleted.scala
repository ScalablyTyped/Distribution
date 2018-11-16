package typings
package leafletDashDrawLib.leafletMod.DrawEventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Triggered when layers have been removed (and saved) from the FeatureGroup.
		 */
@js.native
trait Deleted
  extends stdLib.Event {
  /**
  			 * List of all layers just removed from the map.
  			 */
  var layers: leafletLib.leafletMod.LayerGroup[_] = js.native
}

