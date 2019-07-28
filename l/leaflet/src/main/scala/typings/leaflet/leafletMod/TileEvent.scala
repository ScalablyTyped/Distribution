package typings.leaflet.leafletMod

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileEvent extends LeafletEvent {
  var coords: Point
  var tile: HTMLImageElement
}

object TileEvent {
  @scala.inline
  def apply(coords: Point, target: js.Any, tile: HTMLImageElement, `type`: String): TileEvent = {
    val __obj = js.Dynamic.literal(coords = coords, target = target, tile = tile)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TileEvent]
  }
}

