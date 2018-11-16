package typings
package leafletDashDrawLib.leafletMod.DrawEventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditVertex
  extends stdLib.Event {
  /**
  			 * List of all layers just being edited from the map.
  			 */
  var layers: leafletLib.leafletMod.LayerGroup[_] = js.native
  var poly: (leafletLib.leafletMod.Polyline[geojsonLib.geojsonMod.LineString | geojsonLib.geojsonMod.MultiLineString, _]) | leafletLib.leafletMod.Polygon[_] = js.native
}

