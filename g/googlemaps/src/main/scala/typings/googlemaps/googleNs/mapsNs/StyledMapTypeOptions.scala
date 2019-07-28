package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyledMapTypeOptions extends js.Object {
  var alt: js.UndefOr[String] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object StyledMapTypeOptions {
  @scala.inline
  def apply(
    alt: String = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    name: String = null
  ): StyledMapTypeOptions = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[StyledMapTypeOptions]
  }
}

