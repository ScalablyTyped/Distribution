package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileEvent extends LeafletEvent {
  var coords: Point
  var tile: stdLib.HTMLImageElement
}

object TileEvent {
  @scala.inline
  def apply(coords: Point, target: js.Any, tile: stdLib.HTMLImageElement, `type`: java.lang.String): TileEvent = {
    val __obj = js.Dynamic.literal(coords = coords, target = target, tile = tile)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TileEvent]
  }
}

