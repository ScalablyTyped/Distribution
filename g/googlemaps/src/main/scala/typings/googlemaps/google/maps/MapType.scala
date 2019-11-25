package typings.googlemaps.google.maps

import typings.std.Document
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***** Map Types *****/
trait MapType extends js.Object {
  var alt: js.UndefOr[String] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var projection: js.UndefOr[Projection] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var tileSize: js.UndefOr[Size] = js.undefined
  def getTile(tileCoord: Point, zoom: Double, ownerDocument: Document): Element
  def releaseTile(tile: Element): Unit
}

object MapType {
  @scala.inline
  def apply(
    getTile: (Point, Double, Document) => Element,
    releaseTile: Element => Unit,
    alt: String = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    name: String = null,
    projection: Projection = null,
    radius: Int | Double = null,
    tileSize: Size = null
  ): MapType = {
    val __obj = js.Dynamic.literal(getTile = js.Any.fromFunction3(getTile), releaseTile = js.Any.fromFunction1(releaseTile))
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapType]
  }
}

