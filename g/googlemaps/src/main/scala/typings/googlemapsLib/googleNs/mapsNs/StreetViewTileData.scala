package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreetViewTileData extends js.Object {
  var centerHeading: js.UndefOr[scala.Double] = js.undefined
  var tileSize: js.UndefOr[Size] = js.undefined
  var worldSize: js.UndefOr[Size] = js.undefined
  def getTileUrl(pano: java.lang.String, tileZoom: scala.Double, tileX: scala.Double, tileY: scala.Double): java.lang.String
}

