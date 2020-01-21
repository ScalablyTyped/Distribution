package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.boxzoomcancel
import typings.mapboxGl.mapboxGlStrings.boxzoomend
import typings.mapboxGl.mapboxGlStrings.boxzoomstart
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

