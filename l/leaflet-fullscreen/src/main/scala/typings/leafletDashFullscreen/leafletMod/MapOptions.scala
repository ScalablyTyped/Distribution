package typings.leafletDashFullscreen.leafletMod

import typings.leafletDashFullscreen.Anon_PseudoFullscreen
import typings.leafletDashFullscreen.leafletDashFullscreenNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var fullscreenControl: js.UndefOr[`true` | Anon_PseudoFullscreen] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(fullscreenControl: `true` | Anon_PseudoFullscreen = null): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (fullscreenControl != null) __obj.updateDynamic("fullscreenControl")(fullscreenControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

