package typings
package leafletDashFullscreenLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var fullscreenControl: js.UndefOr[
    leafletDashFullscreenLib.leafletDashFullscreenLibNumbers.`true` | leafletDashFullscreenLib.Anon_PseudoFullscreen
  ] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    fullscreenControl: leafletDashFullscreenLib.leafletDashFullscreenLibNumbers.`true` | leafletDashFullscreenLib.Anon_PseudoFullscreen = null
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (fullscreenControl != null) __obj.updateDynamic("fullscreenControl")(fullscreenControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

