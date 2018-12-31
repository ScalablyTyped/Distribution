package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapBoxZoomEvent
  extends MapboxEvent[stdLib.MouseEvent] {
  var boxZoomBounds: LngLatBounds
  @JSName("type")
  var type_MapBoxZoomEvent: mapboxDashGlLib.mapboxDashGlLibStrings.boxzoomstart | mapboxDashGlLib.mapboxDashGlLibStrings.boxzoomend | mapboxDashGlLib.mapboxDashGlLibStrings.boxzoomcancel
}

