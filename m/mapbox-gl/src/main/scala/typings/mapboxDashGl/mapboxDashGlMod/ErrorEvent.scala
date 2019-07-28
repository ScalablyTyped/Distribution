package typings.mapboxDashGl.mapboxDashGlMod

import typings.mapboxDashGl.mapboxDashGlStrings.error
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "ErrorEvent")
@js.native
class ErrorEvent ()
  extends MapboxEvent[js.UndefOr[scala.Nothing]] {
  var error: Error = js.native
  @JSName("type")
  var type_ErrorEvent: error = js.native
}

