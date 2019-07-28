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
  def apply(coords: Point, error: Error, target: js.Any, tile: HTMLImageElement, `type`: String): TileErrorEvent = {
    val __obj = js.Dynamic.literal(coords = coords, error = error, target = target, tile = tile)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TileErrorEvent]
  }
}

