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

