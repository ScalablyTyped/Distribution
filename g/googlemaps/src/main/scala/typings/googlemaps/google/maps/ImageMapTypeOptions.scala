package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageMapTypeOptions extends js.Object {
  var alt: js.UndefOr[String] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var tileSize: Size
  def getTileUrl(tileCoord: Point, zoom: Double): String
}

object ImageMapTypeOptions {
  @scala.inline
  def apply(
    getTileUrl: (Point, Double) => String,
    tileSize: Size,
    alt: String = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    name: String = null,
    opacity: Int | Double = null
  ): ImageMapTypeOptions = {
    val __obj = js.Dynamic.literal(getTileUrl = js.Any.fromFunction2(getTileUrl), tileSize = tileSize.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMapTypeOptions]
  }
}

