package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MapType extends js.Object {
  var alt: js.UndefOr[java.lang.String] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var projection: js.UndefOr[Projection] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
  var tileSize: js.UndefOr[Size] = js.undefined
  def getTile(tileCoord: Point, zoom: scala.Double, ownerDocument: stdLib.Document): stdLib.Element
  def releaseTile(tile: stdLib.Element): scala.Unit
}

