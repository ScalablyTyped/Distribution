package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapBoxZoomEvent
  extends MapboxEvent[stdLib.MouseEvent] {
  var boxZoomBounds: LngLatBounds = js.native
  @JSName("type")
  var type_MapBoxZoomEvent: mapboxDashGlLib.mapboxDashGlLibStrings.boxzoomstart | mapboxDashGlLib.mapboxDashGlLibStrings.boxzoomend | mapboxDashGlLib.mapboxDashGlLibStrings.boxzoomcancel = js.native
}

