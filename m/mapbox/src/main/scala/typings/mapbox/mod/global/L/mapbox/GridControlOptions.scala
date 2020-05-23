package typings.mapbox.mod.global.L.mapbox

import typings.leaflet.mod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridControlOptions extends ControlOptions {
  var follow: js.UndefOr[Boolean] = js.undefined
  var location: js.UndefOr[Boolean] = js.undefined
  var pinnable: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var touchTeaser: js.UndefOr[Boolean] = js.undefined
}

object GridControlOptions {
  @scala.inline
  def apply(
    follow: js.UndefOr[Boolean] = js.undefined,
    location: js.UndefOr[Boolean] = js.undefined,
    pinnable: js.UndefOr[Boolean] = js.undefined,
    position: ControlPosition = null,
    sanitizer: /* template */ String => String = null,
    template: String = null,
    touchTeaser: js.UndefOr[Boolean] = js.undefined
  ): GridControlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(location)) __obj.updateDynamic("location")(location.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pinnable)) __obj.updateDynamic("pinnable")(pinnable.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (sanitizer != null) __obj.updateDynamic("sanitizer")(js.Any.fromFunction1(sanitizer))
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(touchTeaser)) __obj.updateDynamic("touchTeaser")(touchTeaser.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridControlOptions]
  }
}

