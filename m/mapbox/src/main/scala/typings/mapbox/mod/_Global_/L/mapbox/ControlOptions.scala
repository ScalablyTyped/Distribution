package typings.mapbox.mod._Global_.L.mapbox

import typings.leaflet.mod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////
//////////////////////////////// CONTROLS ////////////////////////////
//////////////////////////////////////////////////////////////////////
trait ControlOptions
  extends typings.leaflet.mod.ControlOptions {
  var sanitizer: js.UndefOr[js.Function1[/* template */ String, String]] = js.undefined
}

object ControlOptions {
  @scala.inline
  def apply(position: ControlPosition = null, sanitizer: /* template */ String => String = null): ControlOptions = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (sanitizer != null) __obj.updateDynamic("sanitizer")(js.Any.fromFunction1(sanitizer))
    __obj.asInstanceOf[ControlOptions]
  }
}

