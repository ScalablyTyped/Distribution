package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageMapTypeOptions extends js.Object {
  var alt: js.UndefOr[java.lang.String] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var tileSize: js.UndefOr[Size] = js.undefined
  def getTileUrl(tileCoord: Point, zoom: scala.Double): java.lang.String
}

object ImageMapTypeOptions {
  @scala.inline
  def apply(
    getTileUrl: (Point, scala.Double) => java.lang.String,
    alt: java.lang.String = null,
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    tileSize: Size = null
  ): ImageMapTypeOptions = {
    val __obj = js.Dynamic.literal(getTileUrl = js.Any.fromFunction2(getTileUrl))
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize)
    __obj.asInstanceOf[ImageMapTypeOptions]
  }
}

