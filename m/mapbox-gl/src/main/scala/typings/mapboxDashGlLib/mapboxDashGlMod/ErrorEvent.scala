package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "ErrorEvent")
@js.native
class ErrorEvent ()
  extends MapboxEvent[js.UndefOr[scala.Nothing]] {
  var error: stdLib.Error = js.native
  @JSName("type")
  var type_ErrorEvent: mapboxDashGlLib.mapboxDashGlLibStrings.error = js.native
}

