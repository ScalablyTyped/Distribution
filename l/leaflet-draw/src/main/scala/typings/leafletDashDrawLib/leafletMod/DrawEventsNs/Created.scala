package typings
package leafletDashDrawLib.leafletMod.DrawEventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Created
  extends stdLib.Event {
  /**
  			 * Layer that was just created.
  			 */
  var layer: leafletLib.leafletMod.Circle[_] | leafletLib.leafletMod.CircleMarker[_] | leafletLib.leafletMod.Marker[_] | leafletLib.leafletMod.Polygon[_] | (leafletLib.leafletMod.Polyline[geojsonLib.geojsonMod.LineString | geojsonLib.geojsonMod.MultiLineString, _]) | leafletLib.leafletMod.Rectangle[_] = js.native
  /**
  			 * The type of layer this is. One of: polyline, polygon, rectangle, circle, marker.
  			 */
  var layerType: java.lang.String = js.native
}

