package typings.leaflet.mod

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileEvent extends LeafletEvent {
  var coords: Point_
  var tile: HTMLImageElement
}

object TileEvent {
  @scala.inline
  def apply(
    coords: Point_,
    layer: js.Any,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    tile: HTMLImageElement,
    `type`: String
  ): TileEvent = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileEvent]
  }
}

