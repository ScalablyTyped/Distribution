package typings.mapboxDashGl.mapboxDashGlMod

import typings.mapboxDashGl.mapboxDashGlStrings.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapStyleDataEvent
  extends MapboxEvent[js.UndefOr[scala.Nothing]]
     with MapDataEvent {
  var dataType: style = js.native
}

