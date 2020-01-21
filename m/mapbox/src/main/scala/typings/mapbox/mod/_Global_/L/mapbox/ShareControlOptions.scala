package typings.mapbox.mod._Global_.L.mapbox

import typings.leaflet.mod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareControlOptions extends ControlOptions {
  var url: js.UndefOr[String] = js.undefined
}

object ShareControlOptions {
  @scala.inline
  def apply(
    position: ControlPosition = null,
    sanitizer: /* template */ String => String = null,
    url: String = null
  ): ShareControlOptions = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (sanitizer != null) __obj.updateDynamic("sanitizer")(js.Any.fromFunction1(sanitizer))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareControlOptions]
  }
}

