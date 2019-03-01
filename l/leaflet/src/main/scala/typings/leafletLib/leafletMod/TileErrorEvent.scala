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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("coords")(coords)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("tile")(tile)
    __obj.asInstanceOf[TileErrorEvent]
  }
}

