package typings.leafletFullscreen.mod

import typings.leafletFullscreen.AnonPseudoFullscreen
import typings.leafletFullscreen.leafletFullscreenBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var fullscreenControl: js.UndefOr[`true` | AnonPseudoFullscreen] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(fullscreenControl: `true` | AnonPseudoFullscreen = null): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (fullscreenControl != null) __obj.updateDynamic("fullscreenControl")(fullscreenControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

