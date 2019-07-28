package typings.mapboxDashGl.mapboxDashGlMod

import typings.mapboxDashGl.mapboxDashGlStrings.content
import typings.mapboxDashGl.mapboxDashGlStrings.metadata
import typings.mapboxDashGl.mapboxDashGlStrings.source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapSourceDataEvent
  extends MapboxEvent[js.UndefOr[scala.Nothing]]
     with MapDataEvent {
  var coord: Coordinate = js.native
  var dataType: source = js.native
  var isSourceLoaded: Boolean = js.native
  var source: Source = js.native
  var sourceDataType: metadata | content = js.native
  var sourceId: String = js.native
  var tile: js.Any = js.native
}

