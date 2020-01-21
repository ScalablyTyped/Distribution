package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileMaximizedEventUIParam extends js.Object {
  /**
  	 * Used to get a reference to the tile manager the maximized tile belongs to.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get the jQuery element of the maximized tile
  	 */
  var tile: js.UndefOr[js.Any] = js.undefined
}

object TileMaximizedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null, tile: js.Any = null): TileMaximizedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (tile != null) __obj.updateDynamic("tile")(tile.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileMaximizedEventUIParam]
  }
}

