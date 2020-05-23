package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileRenderedEventUIParam extends js.Object {
  /**
    * Used to get a reference to the tile manager performing rendering.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
    * Used to get a reference to the rendered tile
    */
  var tile: js.UndefOr[js.Any] = js.undefined
}

object TileRenderedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null, tile: js.Any = null): TileRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (tile != null) __obj.updateDynamic("tile")(tile.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileRenderedEventUIParam]
  }
}

