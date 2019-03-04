package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileErrorEvent extends TileEvent {
  var error: stdLib.Error
}

object TileErrorEvent {
  @scala.inline
  def apply(
    coords: Point,
    error: stdLib.Error,
    target: js.Any,
    tile: stdLib.HTMLImageElement,
    `type`: java.lang.String
  ): TileErrorEvent = {
    val __obj = js.Dynamic.literal(coords = coords, error = error, target = target, tile = tile)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TileErrorEvent]
  }
}

