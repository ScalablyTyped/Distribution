package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapSourceDataEvent
  extends MapboxEvent[js.UndefOr[scala.Nothing]]
     with MapDataEvent {
  var coord: Coordinate = js.native
  var dataType: mapboxDashGlLib.mapboxDashGlLibStrings.source = js.native
  var isSourceLoaded: scala.Boolean = js.native
  var source: Source = js.native
  var sourceDataType: mapboxDashGlLib.mapboxDashGlLibStrings.metadata | mapboxDashGlLib.mapboxDashGlLibStrings.content = js.native
  var sourceId: java.lang.String = js.native
  var tile: js.Any = js.native
}

