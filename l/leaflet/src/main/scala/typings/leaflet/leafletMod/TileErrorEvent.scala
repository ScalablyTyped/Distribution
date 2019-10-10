package typings.leaflet.leafletMod

import typings.std.Error
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileErrorEvent extends TileEvent {
  var error: Error
}

object TileErrorEvent {
  @scala.inline
  def apply(
    coords: Point,
    error: Error,
    layer: js.Any,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    tile: HTMLImageElement,
    `type`: String
  ): TileErrorEvent = {
    val __obj = js.Dynamic.literal(coords = coords, error = error, layer = layer, propagatedFrom = propagatedFrom, sourceTarget = sourceTarget, target = target, tile = tile)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TileErrorEvent]
  }
}

