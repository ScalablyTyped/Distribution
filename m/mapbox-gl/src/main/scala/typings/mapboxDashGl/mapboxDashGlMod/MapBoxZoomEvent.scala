package typings.mapboxDashGl.mapboxDashGlMod

import typings.mapboxDashGl.mapboxDashGlStrings.boxzoomcancel
import typings.mapboxDashGl.mapboxDashGlStrings.boxzoomend
import typings.mapboxDashGl.mapboxDashGlStrings.boxzoomstart
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapBoxZoomEvent extends MapboxEvent[MouseEvent] {
  var boxZoomBounds: LngLatBounds = js.native
  @JSName("type")
  var type_MapBoxZoomEvent: boxzoomstart | boxzoomend | boxzoomcancel = js.native
}

