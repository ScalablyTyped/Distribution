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

object MapType {
  @scala.inline
  def apply(
    getTile: js.Function3[Point, scala.Double, stdLib.Document, stdLib.Element],
    releaseTile: js.Function1[stdLib.Element, scala.Unit],
    alt: java.lang.String = null,
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    projection: Projection = null,
    radius: scala.Int | scala.Double = null,
    tileSize: Size = null
  ): MapType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getTile")(getTile)
    __obj.updateDynamic("releaseTile")(releaseTile)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize)
    __obj.asInstanceOf[MapType]
  }
}

